package behaviours;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Activity 
{
	private Condition _condition;
	private Movement _movement;
	private Action _action;

	public Activity(Condition c, Movement m, Action a)
	{
		_condition=c;
		_movement=m;
		_action=a;
	}
	
	public boolean checkCondition(List<Condition.Conditions> conditions)
	{
		return _condition.checkCondition(conditions);
	}
	
	public Movement.Movements getMovement(Random random)
	{
		return _movement.getMovement(random);
	}
	
	public Action.Actions getAction(Random random)
	{
		return _action.getAction(random);
	}
	
	public List<String> getErrors()
	{
		List<String> list = new LinkedList<String>();
		if (_condition!=null)
			list.addAll(_condition.getErrors());
		if (_movement!=null)
			list.addAll(_movement.getErrors());
		if (_action!=null)
			list.addAll(_action.getErrors());
		return list;
	}
}