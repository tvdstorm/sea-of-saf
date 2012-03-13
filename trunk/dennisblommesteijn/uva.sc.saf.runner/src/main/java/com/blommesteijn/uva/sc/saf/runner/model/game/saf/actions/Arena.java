package com.blommesteijn.uva.sc.saf.runner.model.game.saf.actions;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.blommesteijn.uva.sc.saf.ast.types.Behaviour;
import com.blommesteijn.uva.sc.saf.ast.types.Fighter;
import com.blommesteijn.uva.sc.saf.ast.types.Property;
import com.blommesteijn.uva.sc.saf.ast.types.actions.Action;
import com.blommesteijn.uva.sc.saf.utils.ListUtil;

/**
 * 
 * @author dblommesteijn
 * @since 21 Feb, 2012
 */
public class Arena
{
	public static final int FIGHTERS_IN_ARENA_MAX = 2;
	public static final int MUCH_OFFSET = 5;
	private static final int BLOCK_OFFSET = 3;

	
	private static Arena __instance = null;
	
	public static Arena getInstance()
	{
		if(__instance == null)
			__instance = new Arena();
		return __instance;
	}
	
	
	private int _size = 100;
	private List<ActiveFighter> _activeFighters = null;
	
	public Arena()
	{
		_activeFighters = new LinkedList<ActiveFighter>();
	}
	
	public void setFighters(List<ActiveFighter> fighters)
	{
		_activeFighters = fighters;
	}
	
	public void setSize(int size)
	{
		_size = size;
	}
	
	public List<ActiveFighter> getActiveFighters()
	{
		return _activeFighters;
	}
	
	/**
	 * Determine fighter spawn point 
	 * @return
	 */
	private int getSpawnPoint()
	{
		int ret = 0;
		ret = _size / (FIGHTERS_IN_ARENA_MAX * FIGHTERS_IN_ARENA_MAX);
		if(_activeFighters.size() == 1)
			ret = _size - ret;
		return ret;
	}

	/**
	 * Add a fighter to the play realm
	 * @param fighter
	 */
	public void addFighter(ActiveFighter activefighter)
	{
		activefighter.setPosition(this.getSpawnPoint());
		_activeFighters.add(activefighter);
	}
	
	public String toString()
	{
		return "";
	}
	
	private int getDistance(Fighter fighter)
	{
		//get distance
		List<Integer> ret = new LinkedList<Integer>();
		for(ActiveFighter activeFighter : _activeFighters)
		{
			ret.add(activeFighter.getPosition());
		}
		Collections.sort(ret);
		return ListUtil.distance(ret);
	}
	
	private int getReach(Fighter fighter)
	{
		return (int)fighter.getReach();
	}
	
	private double getStrength(Fighter fighter)
	{
		return fighter.getStrength();
	}
	
	/**
	 * Get the other fighter in the arena
	 * @param origin current fighter
	 * @return the fighter other than current
	 */
	private Fighter getOtherFighter(Fighter origin)
	{
		Fighter ret = null;
		for(ActiveFighter activeFighter : _activeFighters)
		{
			Fighter fighter = activeFighter.getFighter();
			if(fighter != origin)
			{
				ret = fighter;
				break;
			}
		}
		return ret;
	}
	
	public ActiveFighter getOtherFighter(ActiveFighter origin)
	{
		ActiveFighter ret = null;
		for(ActiveFighter activeFighter : _activeFighters)
		{
//			Fighter fighter = activeFighter.getFighter();
			if(activeFighter != origin)
			{
				ret = activeFighter;
				break;
			}
		}
		return ret;
	}
	
	

	/**
	 * Is Near (fighters are near eachother)
	 * NOTE: distance between fighters <= fighter reach
	 * @param fighter fighter to calculate range on
	 * @return is other fighter near this fighter
	 */
	public boolean isNear(Fighter fighter)
	{
		int distance = this.getDistance(fighter);
		int reach = this.getReach(fighter);
	
		//in reach of punch or 
		return (distance <= reach);
	}

	/**
	 * Is Far (fighters are far from each other)
	 * NOTE: distance between fighters > fighter reach
	 * @param fighter fighter to calculate range on
	 * @return is other fighter far from this fighter
	 */
	public boolean isFar(Fighter fighter)
	{
		int distance = this.getDistance(fighter);
		int reach = this.getReach(fighter);
	
		//in reach of punch or 
		return (distance > reach);
	}


	/**
	 * Is Fighter Stronger than other fighter
	 * @param origin original fighter
	 * @return passed fighter is stronger than other fighter
	 */
	public boolean isStronger(Fighter origin)
	{
		// note: there are max two fighters in the arena (so this will work)
		int originStrength = (int) this.getStrength(origin);
		int targetStrength = (int) this.getStrength(this.getOtherFighter(origin));
		return (originStrength > targetStrength);
	}
	
	/**
	 * Is Fighter Weaker than other fighter
	 * @param origin original fighter
	 * @return passed fighter is weaker than other fighter
	 */
	public boolean isWeaker(Fighter origin)
	{
		// note: there are max two fighters in the arena (so this will work)
		int originStrength = (int) this.getStrength(origin);
		int targetStrength = (int) this.getStrength(this.getOtherFighter(origin));
		return (originStrength < targetStrength);
	}

	/**
	 * Is Fighter Much Stronger than other fighter
	 * @param origin original fighter
	 * @return passed fighter is stronger than other fighter
	 */
	public boolean isMuchStronger(Fighter fighter)
	{
		// note: there are max two fighters in the arena (so this will work)
		int originStrength = (int) this.getStrength(fighter);
		int targetStrength = (int) this.getStrength(this.getOtherFighter(fighter));
		return (originStrength + MUCH_OFFSET > targetStrength);
	}
	
	/**
	 * Is Fighter Much Weaker than other fighter
	 * @param origin original fighter
	 * @return passed fighter is weaker than other fighter
	 */
	public boolean isMuchWeaker(Fighter origin)
	{
		// note: there are max two fighters in the arena (so this will work)
		int originStrength = (int) this.getStrength(origin);
		int targetStrength = (int) this.getStrength(this.getOtherFighter(origin));
		return (originStrength < targetStrength + MUCH_OFFSET);
	}

	public boolean areEven()
	{
		double strength = -1;
		for(ActiveFighter activeFighter : _activeFighters)
		{
			Fighter fighter = activeFighter.getFighter();
			if(strength >= 0 && strength ==  this.getStrength(fighter))
				return true;
			strength = this.getStrength(fighter);
		}
		return false;
	}
	
	public void move(ActiveFighter origin, Action move)
	{
		ActiveFighter other = this.getOtherFighter(origin);
		int direction = 1;
		if(other.getPosition() < origin.getPosition())
			direction = -1;
		
		double fighterSpeed = origin.getFighter().getSpeed();
		double position = origin.getPosition();
		double newPosition = move.calcNextPosition(position, fighterSpeed, direction);
		if(newPosition <= _size && newPosition >= 0)
			origin.setPosition((int)newPosition);
	}


	public void attack(ActiveFighter activeFighter, Action attack) 
	{
		Fighter origin = activeFighter.getFighter();
		ActiveFighter otherActiveFighter = this.getOtherFighter(activeFighter);
		if(this.isNear(origin))
		{
			double value = -origin.getStrength();
			
			if(this.isOtherBlocking(otherActiveFighter))
				value = -origin.getStrength() + BLOCK_OFFSET;
			otherActiveFighter.reduceHealth((int)value);
		}
	}

	
	public boolean isOtherBlocking(ActiveFighter otherActiveFighter)
	{		
		Action block = otherActiveFighter.getBlock();		
		return (block != null);
	}



	
}
