package behaviours;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import behaviours.Action.EnumActions;
import behaviours.Condition.EnumConditions;
import behaviours.Movement.EnumMovements;

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
	
	public boolean checkCondition(List<EnumConditions> conditions)
	{
		return _condition.checkCondition(conditions);
	}
	
	public EnumMovements getMovement(Random random)
	{
		return _movement.getMovement(random);
	}
	
	public EnumActions getAction(Random random)
	{
		return _action.getAction(random);
	}
	
	public List<String> getErrors()
	{
		List<String> list = new LinkedList<String>();
		list.addAll(_condition.getErrors());
		list.addAll(_movement.getErrors());
		list.addAll(_action.getErrors());
		return list;
	}
}