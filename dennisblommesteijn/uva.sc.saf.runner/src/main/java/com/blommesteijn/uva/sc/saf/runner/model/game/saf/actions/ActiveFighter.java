package com.blommesteijn.uva.sc.saf.runner.model.game.saf.actions;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.blommesteijn.uva.sc.saf.ast.types.Fighter;

/**
 * 
 * @author dblommesteijn
 * @since 21 Feb, 2012
 */
public class ActiveFighter
{
	private Fighter _fighter = null;
	private List<Task> _actions = null;
	private Iterator<Task> _iterator = null;
	
	private int _position = 0;
	private int _health = 0;

	
	public ActiveFighter(Fighter fighter)
	{
		_fighter = fighter;
		_actions = new LinkedList<Task>();
	}
	
	public Fighter getFighter()
	{
		return _fighter;
	}
	
	public boolean hasNext()
	{
		if(_iterator == null)
			_iterator = _actions.iterator();
		
		return _iterator.hasNext();
	}
	
	public Task next()
	{
		return _iterator.next();
	}

//	public Task next()
//	{
//		if(_iterator == null)
//			_iterator = _actions.iterator();
//		
//		if(_iterator.hasNext())
//			return _iterator.next();
//		else
//		{
//			_iterator = null;
//			return this.next();
//		}
//	}


	public void add(Task task)
	{
		_actions.add(task);
	}
	
	public void addAll(List<Task> tasks)
	{
		_actions.addAll(tasks);
	}

	public int size()
	{
		return _actions.size();
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

}
