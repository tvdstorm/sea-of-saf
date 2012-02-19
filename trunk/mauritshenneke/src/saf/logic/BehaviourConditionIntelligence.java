package saf.logic;

import java.util.HashMap;

import saf.evaluators.BehaviourCondition;

public class BehaviourConditionIntelligence {
//	 public static final String[] behaviourConditionNames = new String[] {
//	        "stronger", "weaker", "much_stronger", "much_weaker", "even", "near", "far", "always" };
	
	private static final Integer muchHealthDifference = 50;
	private static final Integer equalHealthDifference = 0;
	private static final Integer distanceDifference = 10;
	
	private HashMap<String, Boolean> behaviourConditionMap;
	
	@SuppressWarnings("serial")
	public BehaviourConditionIntelligence(int healthDifference, int distance){
		behaviourConditionMap = new HashMap<String, Boolean>(){};
		behaviourConditionMap.put("much_stronger", healthDifference >= muchHealthDifference);
		behaviourConditionMap.put("stronger", healthDifference >= equalHealthDifference && healthDifference < muchHealthDifference);
		behaviourConditionMap.put("weaker", healthDifference < equalHealthDifference && healthDifference > -muchHealthDifference);
		behaviourConditionMap.put("much_weaker", healthDifference <= -muchHealthDifference);
		behaviourConditionMap.put("even", healthDifference == equalHealthDifference);
		behaviourConditionMap.put("far", distance >= distanceDifference);
		behaviourConditionMap.put("near", distance < distanceDifference);
		behaviourConditionMap.put("always", true);
	}

	public boolean IsValidFor(BehaviourCondition behaviorCondition) {
		String behaviorConditionValue = behaviorCondition.getValue();
		if(behaviorConditionValue == "and"){
			return this.IsValidFor(behaviorCondition.getLeft()) && this.IsValidFor(behaviorCondition.getRight()); 
		}
		if(behaviorConditionValue == "or"){
			return this.IsValidFor(behaviorCondition.getLeft()) || this.IsValidFor(behaviorCondition.getRight()); 			
		}
		
		return behaviourConditionMap.get(behaviorConditionValue);
	}
	
	
}
