package nl.uva.lap.saf.ast.fighter;

import nl.uva.lap.saf.interpreter.Fighter;

public class StateFighter extends Fighter
{
	private final int RUN_SPEED = 2;
	private final int WALK_SPEED = 1;
	
	public enum Direction {LEFT, RIGHT};
	public enum Stand {CROUCH, STAND, JUMP};
	
	private int xPosition;
	private int step = 0;
	private Direction direction; 
	private Stand stand = Stand.STAND;
	
	public StateFighter(nl.uva.lap.saf.ast.fighter.Fighter fighter, int xPosition, Direction direction)
	{
		super(fighter);
		this.xPosition = xPosition;
		this.direction = direction;
	}
	
	public void increaseStep()
	{
		step++;
	}
	
	public void resetStep()
	{
		step = 0;
	}
	
	public int getStep()
	{
		return step;
	}
	
	private void moveCloser(int closer)
	{
		if(direction == Direction.LEFT)
			xPosition += closer;
		else
			xPosition -= closer;
	}
	
	private void moveAway(int closer)
	{
		if(direction == Direction.LEFT)
			xPosition -= closer;
		else
			xPosition += closer;
	}
	
	private void updateMovement()
	{
		if(currentMovement.equals("stand"))
			stand = Stand.STAND;
		else if(currentMovement.equals("crouch"))
			stand = Stand.CROUCH;
		else if(currentMovement.equals("jump"))
			stand = Stand.JUMP;
		else if(currentMovement.equals("run_towards"))
			moveCloser(RUN_SPEED);
		else if(currentMovement.equals("run_away"))
			moveAway(RUN_SPEED);
		else if(currentMovement.equals("move_towards"))
			moveCloser(WALK_SPEED);
		else if(currentMovement.equals("move_away"))
			moveAway(WALK_SPEED);
	}

	public void updateState(StateFighter otherFighter)
	{
		updateMovement();
	}
	
	public int getXPosition()
	{
		return xPosition;
	}

	public Stand getStand()
	{
		return stand;
	}
	
	public Direction getDirection()
	{
		return direction;
	}
}
