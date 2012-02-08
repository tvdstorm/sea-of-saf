package fighter;
public class Property 
{
	public enum Properties {
		kickPower, kickReach, punchPower, punchReach
	}

	private Properties _type; 
	public Properties type()
	{
		return _type;
	}
	private void type(String name)
	{
		_type = Properties.valueOf(name);
	}
	
	private int _value = 5; 
	public int value()
	{
		return _value;
	}
	private void value(String value)
	{
		_value = Integer.parseInt(value);
	}
	
	public Property(String name, String value)
	{
		type(name);
		value(value);
	}
}