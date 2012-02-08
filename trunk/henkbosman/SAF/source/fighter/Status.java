package fighter;
public class Status 
{
	private int _position;
	public int position()
	{
		return _position;
	}
	public void movePosition(int pos)
	{
		_position+=pos;
		if (_position<20)
			_position=20;
		if (_position>360)
			_position=360;
	}
	
	private int _health;
	public int health()
	{
		return _health;
	}

	public Status(int health)
	{
		_health = health;
		_recoverTime=0;
		_position=0;
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