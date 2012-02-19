package saf.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import saf.evaluators.BehaviourActionType;

public class FightActionIntelligence extends BehaviourActionTypeIntelligence {
	private final static String low = "low";
	private final static String high = "high";
	private final static String defensive = "defensive";
	private final static String offensive = "offensive";

	private static enum AttackProperty {
		PUNCHREACH("punchReach"), PUNCHPOWER("punchPower"), KICKREACH("kickReach"), KICKPOWER("kickPower");
		private String name;
		private AttackProperty(String name) { this.name = name; }
		public String getName() { return name; }
	}

	private static enum AttackType {
		BLOCK_LOW("block_low"), BLOCK_HIGH("block_high"), PUNCH_LOW("punch_low"), PUNCH_HIGH("punch_high"), KICK_LOW("kick_low"), KICK_HIGH("kick_high");
		private String name;
		private AttackType(String name) { this.name = name; }
		public String getName() { return name; }
	}

	@SuppressWarnings("serial")
	private static HashMap<String, AggressionActionType> fightActionValues = new HashMap<String, AggressionActionType>() {
		{
			put(AttackType.BLOCK_LOW.getName(), new AggressionActionType(low, defensive));
			put(AttackType.BLOCK_HIGH.getName(), new AggressionActionType(high, defensive));
			put(AttackType.PUNCH_LOW.getName(), new AggressionActionType(low, offensive, AttackProperty.PUNCHREACH.getName(),AttackProperty.PUNCHPOWER.getName()));
			put(AttackType.PUNCH_HIGH.getName(), new AggressionActionType(high, offensive, AttackProperty.PUNCHREACH.getName(),AttackProperty.PUNCHPOWER.getName()));
			put(AttackType.KICK_LOW.getName(), new AggressionActionType(low, offensive, AttackProperty.KICKREACH.getName(), AttackProperty.KICKPOWER.getName()));
			put(AttackType.KICK_HIGH.getName(), new AggressionActionType(high, offensive, AttackProperty.KICKREACH.getName(), AttackProperty.KICKPOWER.getName()));
		}
	};

	public FightActionIntelligence(BehaviourActionType actionType) {
		super(actionType);
	}

	public static List<String> getAttackPropertyNames() {
		List<String> result = new ArrayList<String>();

		for (AttackProperty attackProperty : AttackProperty.values()) {
			result.add(attackProperty.getName());
		}
		return result;
	}

	public String getFightActionAggressionReachType() {
		AggressionActionType aggressionActionType = fightActionValues.get(actionTypeName);
		return aggressionActionType.getReachType();
	}

	public String getFightActionAggressionPowerType() {
		AggressionActionType aggressionActionType = fightActionValues.get(actionTypeName);
		return aggressionActionType.getPowerType();
	}

	public Boolean isLow() {
		return getFightActionAggressionDirection() == low;
	}

	public Boolean isHigh() {
		return getFightActionAggressionDirection() == high;
	}

	public static Integer calculateSpeed(HashMap<String, Integer> attackPropertyNamesWithValues){
		double height = (attackPropertyNamesWithValues.get(AttackProperty.PUNCHREACH.getName()) + attackPropertyNamesWithValues.get(AttackProperty.KICKREACH.getName())) / 2; 
		double weight = (attackPropertyNamesWithValues.get(AttackProperty.PUNCHPOWER.getName()) + attackPropertyNamesWithValues.get(AttackProperty.KICKPOWER.getName())) / 2; 
		return (int) Math.round(0.1 + (Math.abs(height - weight) * 0.5));
	}

	public Boolean isDefensive() {
		return isDefensive(actionTypeName);
	}

	private String getFightActionAggressionDirection() {
		AggressionActionType aggressionActionType = fightActionValues.get(actionTypeName);
		return aggressionActionType.getDirection();
	}
	
	private static String getFightActionAggressionType(String actionTypeName) {
		AggressionActionType aggressionActionType = fightActionValues.get(actionTypeName);
		return aggressionActionType.getAggressionType();
	}
	
	private static Boolean isDefensive(String actionTypeName){
		return getFightActionAggressionType(actionTypeName) == defensive;
	}

	private static Boolean isOffensive(String actionTypeName){
		return getFightActionAggressionType(actionTypeName) == offensive;
	}

	public static BehaviourActionType getDefaultActionType() {
		return new BehaviourActionType("block_low");
	}

	public static FightActionIntelligence getOffensiveIntelligence() {
		AttackType attackType = getRandomOffensiveAttackType();
		BehaviourActionType behaviourActionType = new BehaviourActionType(attackType.getName());
		return new FightActionIntelligence(behaviourActionType);
	}
	
	private static AttackType getRandomOffensiveAttackType(){
		Random randomIndexGenerator = new Random();
		List<AttackType> offensiveAttackTypes = new ArrayList<AttackType>();
		
		for (AttackType attackType : AttackType.values()) {
			if(isOffensive(attackType.getName())){
				offensiveAttackTypes.add(attackType);
			}
		}
		
		int randomIndex = randomIndexGenerator.nextInt(offensiveAttackTypes.size());
		return offensiveAttackTypes.get(randomIndex);
	}
	
	private static class AggressionActionType {
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
			this.direction = direction;
			this.aggressionType = aggressionType;
		}

		public String getDirection() {
			return direction;
		}

		public String getAggressionType() {
			return aggressionType;
		}

		public String getReachType() {
			return reachType;
		}

		public String getPowerType() {
			return powerType;
		}

	}
}
