package behaviours;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import behaviours.Action.EnumActions;
import behaviours.Condition.EnumConditions;
import behaviours.Movement.EnumMovements;

import fighter.Combatmove;

public class Behaviour
{
	private List<Activity> _activities;
	public void addActivity(Activity a)
	{
		_activities.add(a);
	}
	
	public Behaviour()
	{
		_activities = new LinkedList<Activity>();
	}
	
	public Combatmove pickCombatmove(List<EnumConditions> conditions, Random random)
	{
		List<Activity> possibleCombatmoves = new LinkedList<Activity>();
		for (Activity a : _activities)
		{
			if (a.checkCondition(conditions))
				possibleCombatmoves.add(a);
		}
		
		if (!possibleCombatmoves.isEmpty())
		{
			Activity activity = possibleCombatmoves.get(random.nextInt(possibleCombatmoves.size()));
			Combatmove combatmove = new Combatmove(activity.getMovement(random), activity.getAction(random));
			return combatmove;
		}
		
		return new Combatmove(EnumMovements.stand, EnumActions.nothing);


		
	}
	
	public List<String> getErrors()
	{
		List<String> list = new LinkedList<String>();
		
		for (Activity a : _activities)
		{
			list.addAll(a.getErrors());
		}
		
		return list;
	}
}