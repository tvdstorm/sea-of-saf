package nl.uva.lap.saf.arena;

import java.rmi.activation.UnknownObjectException;
import nl.uva.lap.saf.ast.fighter.StateFighter;


public class State
{
	private int LEFT_START_POSITION = 20;
	private int RIGHT_START_POSITION = 80;
	
	private StateFighter fighter1;
	private StateFighter fighter2;
	
	public State(nl.uva.lap.saf.ast.fighter.Fighter fighter1, nl.uva.lap.saf.ast.fighter.Fighter fighter2)
	{
		this.fighter1 = new StateFighter(fighter1, LEFT_START_POSITION, StateFighter.Direction.LEFT);
		this.fighter2 = new StateFighter(fighter1, RIGHT_START_POSITION, StateFighter.Direction.RIGHT);
	}
	
	/**
	 * 
	 * @param fighter
	 */
	private boolean performAction(StateFighter fighter)
	{
		if(fighter.getStep() == fighter.getWeight())
		{
			fighter.resetStep();
			fighter.calculateBehaviour(this);
			return true;
		}
		fighter.increaseStep();
		return false;
	}
	
	public void next()
	{
		boolean fighter1Performed = performAction(fighter1);
		boolean fighter2Performed = performAction(fighter2);
		
		if(fighter1Performed)
			fighter1.updateState(fighter2);
		if(fighter2Performed)
			fighter2.updateState(fighter1);
	}
	
	public StateFighter getFighter1()
	{
		return fighter1;
	}
	
	public StateFighter getFighter2()
	{
		return fighter2;
	}
}
