package saf.evaluators;

import java.util.HashMap;

public class FightActionIntelligence extends BehaviourActionTypeIntelligence{
	private final static String low = "low";
	private final static String high = "high";
	private final static String defensive = "defensive";
	private final static String offensive = "offensive";
	
	private final static String punchReach = "punchReach";
	private final static String punchPower = "punchPower";
	private final static String kickReach = "kickReach";
	private final static String kickPower = "kickPower";
	
	@SuppressWarnings("serial")
	private static HashMap<String, AggressionActionType> fightActionValues =  new HashMap<String,AggressionActionType>(){
		{
			put("block_low", new AggressionActionType(low, defensive));
			put("block_high", new AggressionActionType(high, defensive));
			put("punch_low", new AggressionActionType(low, offensive, punchReach, punchPower));
			put("punch_high", new AggressionActionType(high, offensive, punchReach, punchPower));
			put("kick_low", new AggressionActionType(low, offensive, kickReach, kickPower));
			put("kick_high", new AggressionActionType(high, offensive, kickReach, kickPower));
		}
	};

	public FightActionIntelligence(BehaviourActionType actionType) {
		super(actionType);
	}
	
	private String getFightActionAggressionDirection(){
		AggressionActionType aggressionActionType = fightActionValues.get(actionTypeName);
		return aggressionActionType.getDirection();
	}
	
	private String getFightActionAggressionType(){
		AggressionActionType aggressionActionType = fightActionValues.get(actionTypeName);
		return aggressionActionType.getAggressionType();
	}

	public String getFightActionAggressionReachType(){
		AggressionActionType aggressionActionType = fightActionValues.get(actionTypeName);
		return aggressionActionType.getReachType();
	}

	public String getFightActionAggressionPowerType(){
		AggressionActionType aggressionActionType = fightActionValues.get(actionTypeName);
		return aggressionActionType.getPowerType();
	}
	
	public Boolean isLow(){
		return getFightActionAggressionDirection() == low;
	}

	public Boolean isHigh(){
		return getFightActionAggressionDirection() == high;
	}
	
	public Boolean isDefensive(){
		return getFightActionAggressionType() == defensive;
	}
	
	private static class AggressionActionType{
		String direction;
		String aggressionType;
		String reachType;
		String powerType;
		
		public AggressionActionType(String direction, String aggressionType, String reachType, String powerType) {
			this.direction = direction;
			this.aggressionType = aggressionType;
			this.reachType = reachType;
			this.powerType = powerType;
		}

		public AggressionActionType(String direction, String aggressionType) {
			this.direction= direction;
			this.aggressionType = aggressionType;
		}

		public String getDirection() {
			return direction;
		}
		
		public String getAggressionType(){
			return aggressionType;
		}

		public String getReachType() {
			return reachType;
		}
		
		public String getPowerType(){
			return powerType;
		}
		
	}
	
}
