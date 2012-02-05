import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class Action
{
	public enum Actions 	{	
		punch_low,punch_high,kick_low,kick_high,block_low,block_high, nothing
	}
	
	private List<Actions> _actions;
	public Action(String name)
	{
		_actions = new LinkedList<Actions>();
		_actions.add(Actions.valueOf(name));
	}
	
	public Action(List<String> list)
	{
		_actions = new LinkedList<Actions>();
		for(String name : list)
		{
			_actions.add(Actions.valueOf(name));
		}
	}
	
	public Actions getAction(Random random)
	{
		return _actions.get(random.nextInt(_actions.size()));
	}
	
}