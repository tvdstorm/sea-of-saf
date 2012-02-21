package nl.uva.lap.saf.arena;

import nl.uva.lap.saf.arena.StateFighter.Color;



public class State
{
	/**
	 * The influence the weight of the player has on its moves
	 * the higher it is, the less influence it has and the faster players move.
	 */
	private final int WEIGHT_INFLUENCE = 3;
	
	private final int NEAR_DISTANCE = 5;
	private final int FAR_DISTANCE = 20;
	
	private final int LEFT_START_POSITION = 20;
	private final int RIGHT_START_POSITION = 80;
	
	private StateFighter fighter1;
	private StateFighter fighter2;
	
	public State(nl.uva.lap.saf.ast.fighter.Fighter fighter1, nl.uva.lap.saf.ast.fighter.Fighter fighter2)
	{
		this.fighter1 = new StateFighter(fighter1, LEFT_START_POSITION, StateFighter.Direction.LEFT, Color.BLUE);
		this.fighter2 = new StateFighter(fighter2, RIGHT_START_POSITION, StateFighter.Direction.RIGHT, Color.GREEN);
	}
	
	/**
	 * 
	 * @param fighter
	 */
	private boolean performAction(StateFighter fighter)
	{
		if(fighter.getStep() == fighter.getWeight()/WEIGHT_INFLUENCE)
		{
			fighter.resetStep();
			fighter.defaultActions();
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
			fighter1.updateMovement(fighter2);
		if(fighter2Performed)
			fighter2.updateMovement(fighter1);
		
		if(fighter1Performed)
			fighter1.updateAction(fighter2);
		if(fighter2Performed)
			fighter2.updateAction(fighter1);
	}
	
	public StateFighter getFighter1()
	{
		return fighter1;
	}
	
	public StateFighter getFighter2()
	{
		return fighter2;
	}

	public boolean areFightersNear()
	{
		return fighter1.getDistance(fighter2) < NEAR_DISTANCE;
	}
	
	public boolean areFightersFar()
	{
		return fighter1.getDistance(fighter2) > FAR_DISTANCE;
	}
}
