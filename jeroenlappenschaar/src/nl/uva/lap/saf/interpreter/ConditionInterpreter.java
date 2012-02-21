package nl.uva.lap.saf.interpreter;

import nl.uva.lap.saf.arena.State;
import nl.uva.lap.saf.ast.Visitor;
import nl.uva.lap.saf.ast.action.Choose;
import nl.uva.lap.saf.ast.action.SimpleAction;
import nl.uva.lap.saf.ast.condition.And;
import nl.uva.lap.saf.ast.condition.Or;
import nl.uva.lap.saf.ast.condition.SimpleCondition;
import nl.uva.lap.saf.ast.fighter.Behaviour;
import nl.uva.lap.saf.ast.fighter.Fighter;
import nl.uva.lap.saf.ast.fighter.Personality;

public class ConditionInterpreter implements Visitor
{
	private static boolean evaluation = false;
	private final State state;
	private final Fighter fighter;
	
	private ConditionInterpreter(Fighter fighter, State state)
	{
		this.state = state;
		this.fighter = fighter;
	}
	
	public static boolean evaluate(Behaviour behaviour, Fighter fighter, State state)
	{
		ConditionInterpreter interpreter = new ConditionInterpreter(fighter, state);
		evaluation = false;
		interpreter.visit(behaviour);
		return evaluation;
	}

	@Override
	public void visit(SimpleAction action)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Choose choose)
	{
		// TODO Auto-generated method stub
		
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
		behaviour.getCondition().accept(this);
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
		if(!evaluation)
			orCondition.getRhs().accept(this);
	}

	@Override
	public void visit(SimpleCondition simpleCondition)
	{
		if(simpleCondition.getCondition().equals("near"))
			if(state.areFighterNear())
				evaluation = true;
		if(simpleCondition.getCondition().equals("far"))
			if(state.areFighterFar())
				evaluation = true;
	}

}
