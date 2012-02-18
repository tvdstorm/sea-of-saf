package fighter;

import java.util.LinkedList;
import java.util.List;

public class Property 
{
	public enum Properties {
		kickPower, kickReach, punchPower, punchReach
	}

	private List<String> _errorList;
	
	private Properties _type; 
	public Properties type()
	{
		return _type;
	}
	private void type(String name)
	{
		try
		{
			_type = Properties.valueOf(name);
		} catch (IllegalArgumentException e) {
			String msg = "Error parsing \""+name+"\". Possible options:";
			for (Properties p : Properties.values())
			{
				msg+=" "+p+" ";
			}
			_errorList.add(msg);
		}
	}
	
	private int _value = 5; 
	public int value()
	{
		return _value;
	}
	private void value(String value)
	{
		_value = Integer.parseInt(value);
		if (_value<1 || _value>10)
		{
			_errorList.add("Property values must be between 1 and 10, using the default value 5");
			_value=5;
		}
	}
	
	public Property(String name, String value)
	{
		_errorList = new LinkedList<String>();
		type(name);
		value(value);
	}
	
	public List<String> getErrors()
	{
		return _errorList;
	}
}