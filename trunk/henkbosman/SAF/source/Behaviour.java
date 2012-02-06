import java.util.LinkedList;
import java.util.List;
import java.util.Random;

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
	
	public Combatmove pickCombatmove(List<Condition.Conditions> conditions, Random random)
	{
		List<Activity> possibleCombatmoves = new LinkedList<Activity>();
		for (Activity a : _activities)
		{
			if (a.checkCondition(conditions))
				possibleCombatmoves.add(a);
		}

		Activity activity = possibleCombatmoves.get(random.nextInt(possibleCombatmoves.size()));
		Combatmove combatmove = new Combatmove(activity.getMovement(random), activity.getAction(random));

		return combatmove;
	}
	
}