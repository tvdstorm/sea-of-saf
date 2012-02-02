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
	
	public void outputData()
	{
		_condition.outputData();
		System.out.print("[");
		_movement.outputData();
		_action.outputData();
		System.out.println("]");
	}
}