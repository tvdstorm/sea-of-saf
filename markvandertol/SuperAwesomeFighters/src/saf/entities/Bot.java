package saf.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * Describes a bot.
 */
public class Bot {
	private final int DefaultValue = 5;

	private String name;

	private HashMap<String, Integer> properties = new HashMap<String, Integer>();
	
	private List<BehaviourRule> behaviourRules = new ArrayList<BehaviourRule>();
	private final String[] propertyNames = {"punchReach", "punchPower", "kickReach", "kickPower"};
	
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
		return getProperty("punchReach");
	}
	/**
	 * @return the punchPower
	 */
	public int getPunchPower() {
		return getProperty("punchPower");
	}
	/**
	 * @return the kickReach
	 */
	public int getKickReach() {
		return getProperty("kickReach");
	}
	/**
	 * @return the kickPower
	 */
	public int getKickPower() {
		return getProperty("kickPower");
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
		
		if (name == null | name.equals(""))
			errorList.add("Name not set");
	}
}
