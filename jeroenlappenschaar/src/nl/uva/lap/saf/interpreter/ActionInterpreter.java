package nl.uva.lap.saf.interpreter;

import java.util.List;
import java.util.Random;

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

public class ActionInterpreter implements Visitor
{
	private static SimpleAction action;
	private Random random = new Random();
	
	private ActionInterpreter()
	{
		//private
	}
	
	public static SimpleAction evaluate(Action givenAction)
	{
		ActionInterpreter interpreter = new ActionInterpreter();
		interpreter.visit(givenAction);
		return action;
	}

	@Override
	public void visit(SimpleAction action)
	{
		this.action = action; 
	}
	
	/* TODO: How to fix this?? */
	public void visit(Action action)
	{
		if(action instanceof SimpleAction)
		{
			SimpleAction simple = (SimpleAction) action;
			visit(simple);
		}
		else if(action instanceof Choose)
		{
			Choose choose = (Choose) action;
			visit(choose);
		}
	}

	@Override
	public void visit(Choose choose)
	{
		List<Action> actions = choose.getOptions();
		int randomIndex = random.nextInt(actions.size());
		Action action = actions.get(randomIndex);
		action.accept(this);
	}

	@Override
	public void visit(Personality personality)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Fighter fighter)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Behaviour behaviour)
	{
		
	}

	@Override
	public void visit(And andCondition)
	{
		
	}

	@Override
	public void visit(Or orCondition)
	{
		
	}

	@Override
	public void visit(SimpleCondition simpleCondition)
	{
		
		
	}

}
