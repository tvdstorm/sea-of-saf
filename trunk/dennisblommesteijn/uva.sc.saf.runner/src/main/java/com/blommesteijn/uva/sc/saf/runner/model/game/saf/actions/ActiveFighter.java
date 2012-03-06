package com.blommesteijn.uva.sc.saf.runner.model.game.saf.actions;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.blommesteijn.uva.sc.saf.ast.types.Action;
import com.blommesteijn.uva.sc.saf.ast.types.Behaviour;
import com.blommesteijn.uva.sc.saf.ast.types.Condition;
import com.blommesteijn.uva.sc.saf.ast.types.Fighter;
import com.blommesteijn.uva.sc.saf.ast.types.values.EAttack;
import com.blommesteijn.uva.sc.saf.ast.types.values.ECondition;
import com.blommesteijn.uva.sc.saf.ast.types.values.EMove;
import com.blommesteijn.uva.sc.saf.runner.model.game.GameException;

/**
 * 
 * @author dblommesteijn
 * @since 21 Feb, 2012
 */
public class ActiveFighter
{
	private Fighter _fighter = null;
	private List<Task> _actions = null;
	private Behaviour _lastBehaviour = null;
	
	private int _position = 0;
	private int _health = 0;
	private int _speed = 0;
	private EMove _currentMove;
	private EAttack _currentAttack;

	
	public ActiveFighter(Fighter fighter)
	{
		_fighter = fighter;
		_actions = new LinkedList<Task>();
		_fighter.getProperties();
		_health = 100;
	}
	
	public Fighter getFighter()
	{
		return _fighter;
	}
	
	public List<Task> getActions()
	{
		return _actions;
	}

	public int getPosition()
	{
		return _position;
	}
	
	public void setPosition(int position)
	{
		_position = position;
	}

	/**
	 * @return the health
	 */
	public int getHealth()
	{
		return _health;
	}

	/**
	 * @param health the health to set
	 */
	public void setHealth(int health)
	{
		_health = health;
	}
	
	public void reduceHealth(int offset)
	{
		_health += offset;
	}

	public Behaviour getNextBehaviour(Arena arena) throws GameException 
	{
		Behaviour behaviour = null;
		//try all active tasks
		for(Task task : _actions)
		{
			//collect arena properties
			List<Condition> currentState = new LinkedList<Condition>();
			if(arena.isFar(_fighter))
				currentState.add(new Condition(0, ECondition.FAR.getIdent()));
			else if(arena.isNear(_fighter))
				currentState.add(new Condition(0, ECondition.NEAR.getIdent()));
			
			if(arena.isStronger(_fighter))
				currentState.add(new Condition(0, ECondition.STRONGER.getIdent()));
			else if(arena.isWeaker(_fighter))
				currentState.add(new Condition(0, ECondition.WEAKER.getIdent()));
			else if(arena.areEven())
				currentState.add(new Condition(0, ECondition.EVEN.getIdent()));
			
			if(arena.isMuchStronger(_fighter))
				currentState.add(new Condition(0, ECondition.MUCH_STRONGER.getIdent()));
			if(arena.isMuchWeaker(_fighter))
				currentState.add(new Condition(0, ECondition.MUCH_WEAKER.getIdent()));
			
			
			//skip task if it cannot be performed
			behaviour = task.getNextBehaviour(currentState);
			if(behaviour != null)
			{
				_lastBehaviour  = behaviour;
				break;
			}
		}	
		return behaviour;
	}

	public Behaviour getLastBehaviour() 
	{
		return _lastBehaviour;
	}

	public void setMove(EMove move) 
	{
		_currentMove = move;
	}
	
	public EMove getMove()
	{
		return _currentMove;
	}


	public void setAttack(EAttack attack) 
	{
		_currentAttack = attack;
	}

	public EAttack getAttack() 
	{
		return _currentAttack;
	}




	

}
