package fighter;

public class Rules
{
	protected double _defaultActionSpeed;
	protected double _defaultMovementSpeed;
	protected int _defaultMovementDistance;
	protected int _startingHealth;
	
	public Rules(double defaultActionSpeed, double defaultMovementSpeed, int defaultMovementDistance, int startingHealth)
	{
		_defaultActionSpeed = defaultActionSpeed;
		_defaultMovementSpeed = defaultMovementSpeed;
		_defaultMovementDistance = defaultMovementDistance;
		_startingHealth = startingHealth;
	}
	
	public int calculateMovement(Combatmove combatmove)
	{
		switch(combatmove._movement)
		{
			case run_towards:
				return -10;
			case run_away:
				return +7;
			case walk_towards:
				return -4;
			case walk_away:
				return -3;
		}
		return 0;
	}
	
	public double calculateSpeed(double speed, Combatmove combatmove)
	{
		double cSpeed=0;

		switch(combatmove._movement)
		{
			case run_away:
				cSpeed=speed+0.2;
				break;
			case run_towards:
				cSpeed=speed+0.1;
				break;
			case jump:
				cSpeed=speed+0.2;
				break;
			case crouch:
				cSpeed=speed+0.3;
				break;
			case stand: 
				cSpeed=0;
				break;
			default:
				cSpeed=speed;
				break;
		}
		
		switch(combatmove._action)
		{
			case kick_low:
				cSpeed=speed+0.1;
				break;
			case kick_high:
				cSpeed=speed+0.2;
				break;
			case nothing:
				cSpeed+=0;
				break;
			default:
				cSpeed+=speed;
				break;
		}
		return cSpeed;
	}
}