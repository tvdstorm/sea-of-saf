public class Property 
{
	public enum Properties {
		kickPower, kickReach, punchPower, punchReach
	}

	private Properties _type; 
	public Properties Type()
	{
		return _type;
	}
	private void Type(String name)
	{
		_type = Properties.valueOf(name);
	}
	
	private int _value = 5; 
	public int Value()
	{
		return _value;
	}
	private void Value(String value)
	{
		_value = Integer.parseInt(value);
	}
	
	public Property(String name, String value)
	{
		Type(name);
		Value(value);
	}
	
	public void outputData()
	{
		System.out.println(_type +"="+_value);
	}
	
}