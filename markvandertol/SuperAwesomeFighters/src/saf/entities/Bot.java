package saf.entities;

import java.util.ArrayList;
import java.util.List;

import net.sf.oval.constraint.Length;
import net.sf.oval.constraint.Max;
import net.sf.oval.constraint.Min;
import net.sf.oval.guard.Guarded;

@Guarded
public class Bot {
	@Length(min = 1)
	private String name;
	
	@Min(value = 1) @Max(value = 10)
	private int punchReach = 5;
	@Min(value = 1) @Max(value = 10)
	private int punchPower = 5;
	@Min(value = 1) @Max(value = 10)
	private int kickReach = 5;
	@Min(value = 1) @Max(value = 10)
	private int kickPower = 5;
	
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
	
	public List<BehaviourRule> getBehaviourRules() {
		return behaviourRules;
	}
}
