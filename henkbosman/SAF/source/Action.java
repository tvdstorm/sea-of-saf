import java.util.LinkedList;
import java.util.List;

public class Action
{
	public enum Actions 	{	
		punch_low,punch_high,kick_low,kick_high,block_low,block_high
	}

	private List<Actions> _actions;
	public Action()
	{
		_actions = new LinkedList<Actions>();
	}
	
	public void AddAction(String name)
	{
		_actions.add(Actions.valueOf(name));
	
	}
	
	public void AddAction(List<String> list)
	{
		for(String name : list)
		{
			_actions.add(Actions.valueOf(name));
		}
	}
	
	public void outputData()
	{
		if (_actions.size()>1)
		{
			System.out.print(" choose(");
		}
		
		for (Actions a : _actions)
		{
			System.out.print(" "+a);
		}
		
		if (_actions.size()>1)
		{
			System.out.print(")");
		}
	
	}
}