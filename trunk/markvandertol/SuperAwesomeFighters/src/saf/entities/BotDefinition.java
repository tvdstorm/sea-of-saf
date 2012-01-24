package saf.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Describes a bot.
 */
public class BotDefinition {
	private static final String KICK_POWER = "kickPower";
	private static final String KICK_REACH = "kickReach";
	private static final String PUNCH_POWER = "punchPower";
	private static final String PUNCH_REACH = "punchReach";

	private final int DefaultValue = 5;

	private String name;

	private HashMap<String, Integer> properties = new HashMap<String, Integer>();
	
	private List<BehaviourRule> behaviourRules = new ArrayList<BehaviourRule>();
	private final String[] propertyNames = {PUNCH_REACH, PUNCH_POWER, KICK_REACH, KICK_POWER};
	
	private int getProperty(String property) {
		Integer result = properties.get(property);
		return (result != null) ? result : DefaultValue;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the punchReach
	 */
	public int getPunchReach() {
		return getProperty(PUNCH_REACH);
	}
	/**
	 * @return the punchPower
	 */
	public int getPunchPower() {
		return getProperty(PUNCH_POWER);
	}
	/**
	 * @return the kickReach
	 */
	public int getKickReach() {
		return getProperty(KICK_REACH);
	}
	/**
	 * @return the kickPower
	 */
	public int getKickPower() {
		return getProperty(KICK_POWER);
	}
	
	public void setProperty(String key, int value) {
		properties.put(key, value);
	}
	
	/**
	 * 
	 * @return list with behaviourRules
	 */
	public List<BehaviourRule> getBehaviourRules() {
		return behaviourRules;
	}
	
	public void validate(List<String> errorList) {
		for (String key : properties.keySet()) {
			boolean found = false;
			for (String string : propertyNames) {
				if (string.equals(key)) {
					found = true;
					
					int value = getProperty(key);
					if (value < 1 || value > 10)
						errorList.add("Value out of range for " + key + " (" + value + ")");
				}
			}
			if (!found)
				errorList.add("Unknown assignment: " + key);
		}
		
		for (BehaviourRule rule : behaviourRules) {
			rule.validate(errorList);
		}
		
		//To cover the case that there are no applicable rules, there must be an "always" rule.
		Set<State> alwaysSet = new HashSet<State>();
		alwaysSet.add(State.always); 
		if (getBehaviourRules(alwaysSet).isEmpty())
			errorList.add("No always rule added");
		
		if (name == null | name.equals(""))
			errorList.add("Name not set");
	}

	public List<BehaviourRule> getBehaviourRules(Set<State> filter) {
		List<BehaviourRule> result = new ArrayList<BehaviourRule>();
		for (BehaviourRule rule : behaviourRules) {
			if (rule.getCondition().matched(filter))
				result.add(rule);
		}
		
		return result;
	}
}
