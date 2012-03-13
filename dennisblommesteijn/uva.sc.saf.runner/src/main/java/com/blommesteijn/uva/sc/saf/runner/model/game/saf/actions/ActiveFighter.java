package com.blommesteijn.uva.sc.saf.runner.model.game.saf.actions;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.blommesteijn.uva.sc.saf.ast.types.Behaviour;
import com.blommesteijn.uva.sc.saf.ast.types.Condition;
import com.blommesteijn.uva.sc.saf.ast.types.Fighter;
import com.blommesteijn.uva.sc.saf.ast.types.actions.Action;
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
	
	private Action _currentMove;
	private Action _currentAttack;
	private Action _currentBlock;

	
	public ActiveFighter(Fighter fighter)
	{
		_fighter = fighter;
		_actions = new LinkedList<Task>();
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
				currentState.add(new Condition("far"));
			else if(arena.isNear(_fighter))
				currentState.add(new Condition("near"));
			
			if(arena.isStronger(_fighter))
				currentState.add(new Condition("stronger"));
			else if(arena.isWeaker(_fighter))
				currentState.add(new Condition("weaker"));
			else if(arena.areEven())
				currentState.add(new Condition("even"));
			
			if(arena.isMuchStronger(_fighter))
				currentState.add(new Condition("much_stronger"));
			if(arena.isMuchWeaker(_fighter))
				currentState.add(new Condition("much_weaker"));
			
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

	public void setMove(Action move) 
	{
		_currentMove = move;
	}
	
	public Action getMove()
	{
		return _currentMove;
	}
	
	public void setAttack(Action attack) 
	{
		_currentAttack = attack;
	}

	public Action getAttack() 
	{
		return _currentAttack;
	}

	public Action getBlock() 
	{
		return _currentBlock;
	}

	public void setBlock(Action block) 
	{
		_currentBlock = block;
	}
}
