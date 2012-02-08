package fighter;
import behaviours.Action;
import behaviours.Movement;

public class Combatmove
{
	final public Movement.Movements _movement;
	final public Action.Actions _action;
	
	public Combatmove(Movement.Movements movement, Action.Actions action)
	{
		_movement = movement;
		_action = action;
	}
}