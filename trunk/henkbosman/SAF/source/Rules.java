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
}