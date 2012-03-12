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
	private static final int WEAKER = -10;
	private static final int MUCH_WEAKER = -20;
	private final Dictionary<String, Integer> movements = new Hashtable<String, Integer>();
	private final Dictionary<String, String[]> possibleCounters = new Hashtable<String, String[]>();

	public Rules() {
		initialiseMovements();
		initialiseCounters();
	}
	
	private void initialiseMovements(){
		this.movements.put("jump", 0);
		this.movements.put("crouch", 0);
		this.movements.put("stand", 0);
		this.movements.put("run_towards", 10);
		this.movements.put("run_away", -8);
		this.movements.put("walk_towards", 2);		
		this.movements.put("walk_away", -2);
	}
	
	private void initialiseCounters(){
		this.possibleCounters.put("punch_low", new String[]{"block_low"});
		this.possibleCounters.put("punch_high", new String[]{"block_high","block_low","kick_low","punch_low","crouch"});
		this.possibleCounters.put("kick_low", new String[]{"block_low","jump"});
		this.possibleCounters.put("kick_high", new String[]{"block_high","block_low","kick_low","punch_low","crouch"});
	}
	
	public static List<String> resolveCondition(int distance, int healthDifference) {

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
		} else if (healthDifference < EVEN && healthDifference < MUCH_WEAKER) {
			conditionColl.add("weaker");
		} else if (healthDifference > WEAKER) {
			conditionColl.add("much_weaker");
		}

		conditionColl.add("always");
		return conditionColl;
	}

	public Boolean isValidPunch(String attack, String block, String evade){
		if(attack.equals("punch_low")|| attack.equals("punch_high")){
			return !isAttackBlocked(attack, block, evade);
		}
		// not a punch
		return false;
	}
	
	public Boolean isValidKick(String attack, String block, String evade){
		if(attack.equals("kick_low")|| attack.equals("kick_high")){
			return !isAttackBlocked(attack, block, evade);
		}
		// not a kick
		return false;
	}
	
	private Boolean isAttackBlocked(String attack, String block, String evade){
		for(String c : this.possibleCounters.get(attack)){
			if(c.equals(block) || c.equals(evade)){
				return true;
			}
		}
		return false;
	}

	public int resolveMovement(String moveAction) {
		if (this.movements.get(moveAction) != null) {
			return this.movements.get(moveAction);
		}

		return 0;
	}
}
