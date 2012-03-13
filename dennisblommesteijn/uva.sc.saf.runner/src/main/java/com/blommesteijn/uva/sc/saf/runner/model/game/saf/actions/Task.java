package com.blommesteijn.uva.sc.saf.runner.model.game.saf.actions;

import java.util.List;
import java.util.Random;

import com.blommesteijn.uva.sc.saf.ast.types.Behaviour;
import com.blommesteijn.uva.sc.saf.ast.types.Condition;
import com.blommesteijn.uva.sc.saf.ast.types.actions.Action;
import com.blommesteijn.uva.sc.saf.ast.types.actions.AttackAction;
import com.blommesteijn.uva.sc.saf.ast.types.actions.MoveAction;
import com.blommesteijn.uva.sc.saf.ast.types.operators.Operator;
import com.blommesteijn.uva.sc.saf.runner.model.game.GameException;

import edu.emory.mathcs.backport.java.util.Arrays;

public class Task
{
	private Behaviour _behaviour = null;

	public Task(Behaviour behaviour)
	{
		_behaviour = behaviour;
	}
	
	public String toString()
	{
		return "task";
	}
	
	public boolean isAlwaysBehaviour(Behaviour behaviour)
	{
		List<Condition> conditions = Arrays.asList(new Condition[]{new Condition("always")});
		return behaviour.getConditions().isValidCondition(conditions);
	}

	public Behaviour getNextBehaviour(List<Condition> currentState) 
	{	
		System.out.println(currentState);
		if(_behaviour.getConditions().isValidCondition(currentState))
			return _behaviour;
		if(this.isAlwaysBehaviour(_behaviour))
			return _behaviour;
		return null;
	}
}
