package saf.ast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Describes a Fighter. This file doesn't contain any game state.
 */
public class FighterDefinition {
	private static final String KICK_POWER = "kickPower";
	private static final String KICK_REACH = "kickReach";
	private static final String PUNCH_POWER = "punchPower";
	private static final String PUNCH_REACH = "punchReach";

	private final static int DefaultPropertyValue = 5;

	private String name;

	private HashMap<String, Integer> properties = new HashMap<String, Integer>();
	
	private List<BehaviourRule> behaviourRules = new ArrayList<BehaviourRule>();
	private final String[] propertyNames = {PUNCH_REACH, PUNCH_POWER, KICK_REACH, KICK_POWER};
	
	private int getProperty(String property) {
		Integer result = properties.get(property);
		return (result != null) ? result : DefaultPropertyValue;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPunchReach() {
		return getProperty(PUNCH_REACH);
	}

	public int getPunchPower() {
		return getProperty(PUNCH_POWER);
	}

	public int getKickReach() {
		return getProperty(KICK_REACH);
	}

	public int getKickPower() {
		return getProperty(KICK_POWER);
	}
	
	public void setProperty(String key, int value) {
		properties.put(key, value);
	}
	
	public List<BehaviourRule> getBehaviourRules() {
		return behaviourRules;
	}
	
	public void validate(List<String> errorList) {
		validateProperties(errorList);		
		validateBehaviourRules(errorList);	
		validateName(errorList);
	}

	private void validateName(List<String> errorList) {
		if (name == null | name.equals(""))
			errorList.add("Name not set");
	}

	private void validateBehaviourRules(List<String> errorList) {
		for (BehaviourRule rule : behaviourRules) {
			rule.validate(errorList);
		}
		
		//To cover the case that there are no applicable rules, there must be an "always" rule.
		Set<State> alwaysSet = new HashSet<State>();
		alwaysSet.add(State.always); 
		if (findBehaviourRulesForStates(alwaysSet).isEmpty())
			errorList.add("No always rule added");
	}

	private void validateProperties(List<String> errorList) {
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
	}

	public List<BehaviourRule> findBehaviourRulesForStates(Set<State> filter) {
		List<BehaviourRule> result = new ArrayList<BehaviourRule>();
		for (BehaviourRule rule : behaviourRules) {
			if (rule.getCondition().matched(filter))
				result.add(rule);
		}
		
		return result;
	}
}