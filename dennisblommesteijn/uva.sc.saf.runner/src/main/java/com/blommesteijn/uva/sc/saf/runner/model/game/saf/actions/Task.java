package com.blommesteijn.uva.sc.saf.runner.model.game.saf.actions;

import java.util.List;
import java.util.Random;

import com.blommesteijn.uva.sc.saf.ast.types.Action;
import com.blommesteijn.uva.sc.saf.ast.types.Behaviour;
import com.blommesteijn.uva.sc.saf.ast.types.Condition;
import com.blommesteijn.uva.sc.saf.ast.types.Operator;
import com.blommesteijn.uva.sc.saf.ast.types.values.ECondition;
import com.blommesteijn.uva.sc.saf.ast.types.values.EOperator;
import com.blommesteijn.uva.sc.saf.runner.model.game.GameException;

public class Task
{
	private Behaviour _behaviour = null;

	public Task(Behaviour behaviour)
	{
		_behaviour = behaviour;
	}
	
	private static Action getRandomAction(List<Action> actions)
	{
		Random r = new Random();
		int offset = 0;
		int max = actions.size()-1;
		if(max > 0)
			offset = r.nextInt(max);
		return actions.get(offset);
	}
	
	public Action getAttack()
	{
		return Task.getRandomAction(_behaviour.getAttacks());
	}
	
	public Action getMove()
	{
		return Task.getRandomAction(_behaviour.getMoves());
	}
	
	public List<Condition> getConditions()
	{
		return _behaviour.getConditions();
	}
	
	public boolean isAlwaysBehaviour()
	{
		boolean ret = false;
		for(Condition condition : _behaviour.getConditions())
		{
			if(condition.getIdent().equals(ECondition.ALWAYS.getIdent()))
			{
				ret = true;
				break;
			}
		}
		return ret;
	}
	
	/**
	 * Get Operator
	 * NOTE: only one operator allowed
	 * @return operator (if present)
	 */
	public Operator getOperator()
	{
		if(_behaviour.getOperators().size() > 0)
			return _behaviour.getOperators().get(0);
		else
			return null;
	}
	
	private static boolean matchOne(List<Condition> conditions, Condition taskCondition)
	{
		boolean found = false;
		for(Condition condition : conditions)
		{
			if(condition.getIdent().equals(taskCondition.getIdent()))
			{
				found = true;
				break;
			}
		}
		return found;
	}
	
	private static boolean matchAll(List<Condition> conditions, List<Condition> taskConditions )
	{
		//conditions should be in taskconditions
		for(Condition condition : conditions)
		{
			if(!matchOne(taskConditions, condition))
				return false;
		}
		return true;
	}
	
	/**
	 * Get Next behaviour from a list of properties
	 * @param taskConditions current game conditions
	 * @return appropriate behaiviour
	 * @throws GameException
	 */
	public Behaviour getNextBehaviour(List<Condition> taskConditions) throws GameException
	{
		//only one operator allowed
		Operator operator = this.getOperator();
		List<Condition> conditions = this.getConditions();	

		//match multicondition
		if(operator != null)
		{
			//found all conditions (AND)
			if(operator.getIdent().equals(EOperator.AND.getIdent()))
			{
				if(Task.matchAll(conditions, taskConditions))
					return _behaviour;
			}
			
			//found one condition (OR)
			else if(operator.getIdent().equals(EOperator.OR.getIdent()))
			{
				for(Condition taskCondition : taskConditions)
				{
					if(Task.matchOne(conditions, taskCondition))
						return _behaviour;
				}
			}
		}
		
		//match single condition
		else
		{
			if(Task.matchOne(taskConditions, this.getConditions().get(0)))
				return _behaviour;
		}
		
		//default behaviour
		if(this.isAlwaysBehaviour())
			return _behaviour;
		
		//no always behaviour
		return null;
	}
	
	
	public String toString()
	{
		return this.getAttack() + "-" + this.getMove();
	}
}
