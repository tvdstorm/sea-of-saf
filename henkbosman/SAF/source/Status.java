public class Status 
{
	private int _health;
	public int health()
	{
		return _health;
	}
	private double _recoverTime;
	
	public Status(int health)
	{
		_health = health;
		_recoverTime=0;
	}
	
	public boolean lowerHealth(int damage)
	{
		_health -= damage;
		return _health>0;
	}
	

	public boolean recover()
	{
		_recoverTime -= 1;
		return _recoverTime<0;
	}
	
	public void doAction(double recoverTime)
	{
		_recoverTime += recoverTime;
	}
}