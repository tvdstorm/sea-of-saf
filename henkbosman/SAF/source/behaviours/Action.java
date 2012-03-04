package behaviours;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Action
{
	public enum EnumActions 	{	
		punch_low,punch_high,kick_low,kick_high,block_low,block_high, nothing
	}
	
	private List<String> _actions;
	private List<String> _errorList;
	
	private void addAction(String name)
	{
		_actions.add(name);
	}
	
	private void initialize()
	{
		_actions = new LinkedList<String>();
		_errorList = new LinkedList<String>();
	}
	
	public Action(String name)
	{
		initialize();
		addAction(name);
	}
	
	public Action(List<String> list)
	{
		initialize();
		for(String name : list)
		{
			addAction(name);
		}
	}
	
	private List<EnumActions> parseActions()
	{
		List<EnumActions> returnList = new LinkedList<EnumActions>();
		for(String a : _actions)
		{
			try
			{
				returnList.add(EnumActions.valueOf(a));
			} catch (IllegalArgumentException e) {
				String msg = "Error parsing \""+a+"\". Possible options:";
				for (EnumActions action : EnumActions.values())
				{
					msg+=" "+action+" ";
				}
				_errorList.add(msg);
			}
		}
		return returnList;
	}
	
	public EnumActions getAction(Random random)
	{
		return parseActions().get(random.nextInt(parseActions().size()));
	}
	
	public List<String> getErrors()
	{
		parseActions();
		return _errorList;
	}
	
}