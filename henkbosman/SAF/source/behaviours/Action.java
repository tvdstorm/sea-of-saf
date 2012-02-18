package behaviours;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Action
{
	public enum Actions 	{	
		punch_low,punch_high,kick_low,kick_high,block_low,block_high, nothing
	}
	private List<String> _errorList;
	private List<Actions> _actions;
	private void addAction(String name)
	{
		try
		{
			_actions.add(Actions.valueOf(name));
		} catch (IllegalArgumentException e) {
			String msg = "Error parsing \""+name+"\". Possible options:";
			for (Actions a : Actions.values())
			{
				msg+=" "+a+" ";
			}
			_errorList.add(msg);
		}
	}
	
	
	public Action(String name)
	{
		_errorList = new LinkedList<String>();
		_actions = new LinkedList<Actions>();
		addAction(name);
	}
	
	public Action(List<String> list)
	{
		_errorList = new LinkedList<String>();
		_actions = new LinkedList<Actions>();
		for(String name : list)
		{
			addAction(name);
		}
	}
	
	public Actions getAction(Random random)
	{
		return _actions.get(random.nextInt(_actions.size()));
	}
	
	public List<String> getErrors()
	{
		return _errorList;
	}
	
}