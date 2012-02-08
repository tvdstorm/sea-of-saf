package fighter;
public class Status 
{
	private int _health;
	public int health()
	{
		return _health;
	}

	public Status(int health)
	{
		_health = health;
		_recoverTime=0;
	}
	
	public boolean lowerHealth(int damage)
	{
		_health -= damage;
		return _health<1;
	}
	
	private double _recoverTime;
	public boolean recover(double speed)
	{
		_recoverTime -= speed;
		if (_recoverTime<0)
			_recoverTime=0;
		return _recoverTime<=0;
	}
	
	public void doAction(double recoverTime)
	{
		_recoverTime += recoverTime;
	}
}