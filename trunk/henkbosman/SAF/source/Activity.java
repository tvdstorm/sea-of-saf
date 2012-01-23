import java.util.LinkedList;
import java.util.List;

public class Activity 
{
	private List<Condition> _conditions;
	public void AddCondition(Condition c)
	{
		_conditions.add(c);
	}
	
	private List<Movement> _movements;
	public void AddMovement(Movement m)
	{
		_movements.add(m);
	}
	
	private List<Action> _actions;
	public void AddAction(Action c)
	{
		_actions.add(c);
	}

	public Activity()
	{
		_conditions = new LinkedList<Condition>();
		_movements = new LinkedList<Movement>();
		_actions = new LinkedList<Action>();
	}
	
	public void outputData()
	{
		for (Condition c : _conditions)
		{
			c.outputData();
		}
		System.out.print("[");
		for (Movement m : _movements)
		{
			m.outputData();
		}
		
		for (Action a : _actions)
		{
			a.outputData();
		}
		System.out.println("]");
		
	}

}