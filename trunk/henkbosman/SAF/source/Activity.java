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
	
	private Movement.Movements getMovement(Random random)
	{
		return _movement.getMovement(random);
	}
	
	private Action.Actions getAction(Random random)
	{
		return _action.getAction(random);
	}
}