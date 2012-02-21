package nl.uva.lap.saf.arena;

import nl.uva.lap.saf.interpreter.Fighter;

public class StateFighter extends Fighter
{
	private final int RUN_SPEED = 2;
	private final int WALK_SPEED = 1;
	
	private final int DEFAULT_HEALTH = 100;
	
	public enum Direction {LEFT, RIGHT};
	public enum Stand {CROUCH, STAND, JUMP};
	public enum Color {GREEN, BLUE};
	
	private int health = DEFAULT_HEALTH;
	private int xPosition;
	private int step = 0;
	private Direction direction; 
	private Stand stand = Stand.STAND;
	private Color color;
	
	public StateFighter(nl.uva.lap.saf.ast.fighter.Fighter fighter, int xPosition, Direction direction, Color color)
	{
		super(fighter);
		this.xPosition = xPosition;
		this.direction = direction;
		this.color = color;
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
	
	public void updateMovement(StateFighter otherFighter)
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
		else if(currentMovement.equals("walk_towards"))
			moveCloser(WALK_SPEED);
		else if(currentMovement.equals("walk_away"))
			moveAway(WALK_SPEED);
	}
	
	public void updateAction(StateFighter otherFighter)
	{
		int distance = getDistance(otherFighter);
		if(otherFighter.isKicking() && distance <= otherFighter.getKickReach() && !isBlocked(otherFighter))
			hit(otherFighter.getKickPower());
		else if (otherFighter.isPunching() && distance <= otherFighter.getPunchReach() && !isBlocked(otherFighter))
			hit(otherFighter.getPunchPower());
	}
	
	public int getDistance(StateFighter otherFighter)
	{
		return Math.abs(getXPosition() - otherFighter.getXPosition());
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

	public Color getColor()
	{
		return color;
	}
	
	private void hit(int power)
	{
		health-=power;
	}
	
	public int getHealth()
	{
		return health;
	}
}
