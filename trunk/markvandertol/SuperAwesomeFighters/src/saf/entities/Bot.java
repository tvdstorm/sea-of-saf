package saf.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Describes a bot.
 */
public class Bot {
	private final int DefaultValue = 5;

	private String name;

	private int punchReach = DefaultValue;
	private int punchPower = DefaultValue;
	private int kickReach = DefaultValue;
	private int kickPower = DefaultValue;
	
	private List<BehaviourRule> behaviourRules = new ArrayList<BehaviourRule>();
	
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
		return punchReach;
	}
	/**
	 * @param punchReach the punchReach to set
	 */
	public void setPunchReach(int punchReach) {
		this.punchReach = punchReach;
	}
	/**
	 * @return the punchPower
	 */
	public int getPunchPower() {
		return punchPower;
	}
	/**
	 * @param punchPower the punchPower to set
	 */
	public void setPunchPower(int punchPower) {
		this.punchPower = punchPower;
	}
	/**
	 * @return the kickReach
	 */
	public int getKickReach() {
		return kickReach;
	}
	/**
	 * @param kickReach the kickReach to set
	 */
	public void setKickReach(int kickReach) {
		this.kickReach = kickReach;
	}
	/**
	 * @return the kickPower
	 */
	public int getKickPower() {
		return kickPower;
	}
	/**
	 * @param kickPower the kickPower to set
	 */
	public void setKickPower(int kickPower) {
		this.kickPower = kickPower;
	}
	
	/**
	 * 
	 * @return list with behaviourRules
	 */
	public List<BehaviourRule> getBehaviourRules() {
		return behaviourRules;
	}
}
