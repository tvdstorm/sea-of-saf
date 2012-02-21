package saf.simulation;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Dictionary;

import saf.fightclub.Configuration;

public final class Rules implements Configuration {

	private static final int NEAR = 10;
	private static final int STRONGER = 10;
	private static final int EVEN = 0;
	private static final int WEAKER = 10;
	private static final int MUCH_WEAKER = 20;
	private static final Dictionary<String, Integer> movements = new Hashtable<String, Integer>();

	public Rules() {

		movements.put("jump", 0);
		movements.put("crouch", 0);
		movements.put("stand", 0);
		movements.put("run_towards", 10);
		movements.put("run_away", 8);
		movements.put("walk_towards", 2);
		movements.put("walk_away", 2);
	}

	public static List<String> ResolveCondition(int distance, int healthDifference) {

		List<String> conditionColl = new ArrayList<String>();

		if (distance <= NEAR) {
			conditionColl.add("near");
		} else if (distance > NEAR) {
			conditionColl.add("far");
		}

		if (healthDifference > STRONGER) {
			conditionColl.add("much_stronger");
		} else if (healthDifference <= STRONGER && healthDifference > EVEN) {
			conditionColl.add("stronger");
		} else if (healthDifference == EVEN) {
			conditionColl.add("even");
		} else if (healthDifference < EVEN && healthDifference > MUCH_WEAKER) {
			conditionColl.add("weaker");
		} else if (healthDifference < WEAKER) {
			conditionColl.add("much_weaker");
		}

		conditionColl.add("always");
		return conditionColl;
	}

	public int ResolveMovement(String moveAction) {
		if (movements.get(moveAction) != null) {
			return movements.get(moveAction);
		}

		return 0;
	}
}
