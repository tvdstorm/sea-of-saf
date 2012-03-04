package fighter;

public class Rules
{
	private int _defaultMovementSpeed;
	private int _defaultMovementDistance;
	private int _startingHealth;
	
	public int getDefaultMovementSpeed()
	{
		return _defaultMovementSpeed;
	}
	
	public int getDefaultMovementDistance()
	{
		return _defaultMovementDistance;
	}
	
	public int getStartingHealth()
	{
		return _startingHealth;
	}
	
	public Rules(int defaultMovementSpeed, int defaultMovementDistance, int startingHealth)
	{
		_defaultMovementSpeed = defaultMovementSpeed;
		_defaultMovementDistance = defaultMovementDistance;
		_startingHealth = startingHealth;
	}
	
	public int calculateMovement(Combatmove combatmove)
	{
		switch(combatmove.getMovement())
		{
			case run_towards:
				return (_defaultMovementDistance*_defaultMovementSpeed*-3);
			case run_away:
				return (_defaultMovementDistance*_defaultMovementSpeed*2);
			case walk_towards:
				return (_defaultMovementDistance*_defaultMovementSpeed*-1);
			case walk_away:
				return (_defaultMovementDistance*_defaultMovementSpeed*-1);
		}
		return 0;
	}
	
	public double calculateSpeed(double speed, Combatmove combatmove)
	{
		double cSpeed=0;

		switch(combatmove.getMovement())
		{
			case run_away:
				cSpeed+=speed+0.2;
				break;
			case run_towards:
				cSpeed+=speed+0.1;
				break;
			case jump:
				cSpeed+=speed+0.2;
				break;
			case crouch:
				cSpeed+=speed+0.3;
				break;
			case stand: 
				cSpeed=0;
				break;
			default:
				cSpeed+=speed;
				break;
		}
		
		switch(combatmove.getAction())
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