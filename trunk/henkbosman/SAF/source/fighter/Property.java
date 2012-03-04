package fighter;

import java.util.LinkedList;
import java.util.List;

public class Property 
{
	public enum EnumProperties {
		kickPower, kickReach, punchPower, punchReach
	}

	private String _type;
	private String _value;
	
	private List<String> _errorList;
	
	public EnumProperties getType()
	{
		return parseType();
	}
	
	public int getValue()
	{
		return parseValue();
	}
	
	public Property(String name, String value)
	{
		_errorList = new LinkedList<String>();
		_type = name;
		_value = value;
	}
	
	private int parseValue()
	{
		int returnValue=Integer.parseInt(_value);

		if (returnValue<1 || returnValue>10)
		{
			_errorList.add("Property values must be between 1 and 10, using the default value 5");
			returnValue=5;
		}
		
		return returnValue;
	}
	
	private EnumProperties parseType()
	{
		EnumProperties returnType;
		try
		{
			returnType = EnumProperties.valueOf(_type);
			return returnType;
		} catch (IllegalArgumentException e) {
			String msg = "Error parsing \""+_type+"\". Possible options:";
			for (EnumProperties p : EnumProperties.values())
			{
				msg+=" "+p+" ";
			}
			_errorList.add(msg);
		}
		
		return null;
	}
	
	public List<String> getErrors()
	{
		parseValue();
		parseType();
		return _errorList;
	}
}