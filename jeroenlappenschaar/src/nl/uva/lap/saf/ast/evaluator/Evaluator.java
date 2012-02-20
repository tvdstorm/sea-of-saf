package nl.uva.lap.saf.ast.evaluator;

import java.util.ArrayList;
import java.util.List;

import nl.uva.lap.saf.Settings;
import nl.uva.lap.saf.ast.ASTNode;
import nl.uva.lap.saf.ast.Visitor;
import nl.uva.lap.saf.ast.action.Action;
import nl.uva.lap.saf.ast.action.Choose;
import nl.uva.lap.saf.ast.action.SimpleAction;
import nl.uva.lap.saf.ast.condition.And;
import nl.uva.lap.saf.ast.condition.Or;
import nl.uva.lap.saf.ast.condition.SimpleCondition;
import nl.uva.lap.saf.ast.fighter.Behaviour;
import nl.uva.lap.saf.ast.fighter.Fighter;
import nl.uva.lap.saf.ast.fighter.Personality;

public class Evaluator implements Visitor, Settings
{
	private List<Message> messages = new ArrayList<Message>();
	
	private Evaluator()
	{
		//private
	}
	
	public static List<Message> evaluate(ASTNode node)
	{
		Evaluator evaluator = new Evaluator();
		node.accept(evaluator);
		return evaluator.messages;
	}
	
	@Override
	public void visit(SimpleAction action)
	{
		if(!ACTIONS.contains(action.getAction()) && !MOVES.contains(action.toString()))
			messages.add(new Error("Unknown action '" + action.toString() + "'"));
	}

	@Override
	public void visit(Choose choose)
	{
		for(Action action : choose.getOptions())
			action.accept(this);
	}

	@Override
	public void visit(Personality personality)
	{
		if(!STRENGTHS.contains(personality.getName()))
			messages.add(new Error("Unknown personality '" + personality.getName() + "'"));
		int strength = personality.getValue();
		if(strength < MIN_STRENGTH || strength > MAX_STRENGTH)
			messages.add(new Error("Unvalid strength '" + strength + "'"));
	}

	@Override
	public void visit(Fighter fighter)
	{
		for(Personality personality : fighter.getPersonalities())
			personality.accept(this);
		for(Behaviour behaviour : fighter.getBehaviours())
			behaviour.accept(this);
	}

	@Override
	public void visit(Behaviour behaviour)
	{
		behaviour.getCondition().accept(this);
		int moves = 0, actions = 0;
		for(Action action : behaviour.getActions())
		{
			action.accept(this);
			if(action.contains(MOVES))
				moves++;
			if(action.contains(ACTIONS))
				actions++;
		}
		if(moves > 1)
			messages.add(new Warning("Multiple moves defined for behaviour '" + behaviour.getCondition().toString() + "'"));
		if(actions > 1)
			messages.add(new Warning("Multiple actions defined for behaviour'" + behaviour.getCondition().toString() + "'"));
	}

	@Override
	public void visit(And andCondition)
	{
		andCondition.getLhs().accept(this);
		andCondition.getRhs().accept(this);
	}

	@Override
	public void visit(Or orCondition)
	{
		orCondition.getLhs().accept(this);
		orCondition.getRhs().accept(this);
	}

	@Override
	public void visit(SimpleCondition simpleCondition)
	{
		if(!CONDITIONS.contains(simpleCondition.getCondition()))
			messages.add(new Error("Unknown condition '" + simpleCondition.toString() + "'"));
	}
}
