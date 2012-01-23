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
	public void setName( String name) {
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
	
	public Set<String> getDefinedProperties() {
		return properties.keySet();
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
}
