package fighter;
import behaviours.Action.EnumActions;
import behaviours.Movement.EnumMovements;

public class Combatmove
{
	private EnumMovements _movement;
	private EnumActions _action;
	
	public EnumMovements getMovement()
	{
		return _movement;
	}
	
	public EnumActions getAction()
	{
		return _action;
	}
	
	public Combatmove(EnumMovements movement, EnumActions action)
	{
		_movement = movement;
		_action = action;
	}
}