package saf.ast;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
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

	private final String name;

	private final Map<String, Integer> properties;
	
	private final List<BehaviourRule> behaviourRules;
	private final String[] propertyNames = {PUNCH_REACH, PUNCH_POWER, KICK_REACH, KICK_POWER};
	
	public FighterDefinition(String name, Map<String, Integer> properties, List<BehaviourRule> behaviourRules) {
		this.name = name;
		this.properties = properties;
		this.behaviourRules = behaviourRules;
	}

	private int getProperty(String property) {
		Integer result = properties.get(property);
		return (result != null) ? result : DefaultPropertyValue;
	}

	public String getName() {
		return name;
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
	
	public void validate(List<String> errorList) {
		validateName(errorList);
		validateProperties(errorList);		
		validateBehaviourRules(errorList);	
	}

	private void validateName(List<String> errorList) {
		if (name == null || name.equals(""))
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
			validatePropertyRange(errorList, key);
			if (! propertyExists(key))
				errorList.add("Unknown assignment: " + key);
		}
	}

	private void validatePropertyRange(List<String> errorList, String key) {
		int value = getProperty(key);
		if (value < 1 || value > 10)
			errorList.add("Value out of range for " + key + " (" + value + ")");
	}

	private boolean propertyExists(String key) {
		boolean found = false;
		for (String string : propertyNames) {
			if (string.equals(key)) {
				found = true;
			}
		}
		return found;
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
