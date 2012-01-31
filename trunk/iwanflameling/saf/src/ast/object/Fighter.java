/**
 * 
 */
package ast.object;

import java.util.Set;

/**
 * Describes a Fighter in the SAF game.
 * @author Iwan Flameling
 */
public class Fighter {
	/**
	 * The name of this {@link Fighter}.
	 */
	private String name;
	
	/**
	 * A {@link Set} of {@link Rule}s to describe the behavior of this {@link Fighter}. 
	 */
	private Set<Rule> behaviour;
	
	/**
	 * Indication of how far this {@link Fighter} can reach its punch.
	 */
	private int punchReach;
	
	/**
	 * Indication of how far this {@link Fighter} can reach its kick.
	 */
	private int kickReach;
	
	/**
	 * Indication of how powerful this {@link Fighter} can punch.
	 */
	private int punchPower;
	
	/**
	 * Indication of kick-power on a scale of 1 to 10 inclusive.
	 */
	private int kickPower;
	
	
	/**
	 * no-arg constructor, because I don't know yet the mandatory
	 * information for a {@link Fighter}.
	 */
	public Fighter(String name){
		this.name = name;
	}
	
	/**
	 * @return The name of the {@link Fighter}.
	 */
	private String getName(){
		return this.name;
	}
	
	/**
	 * @return A {@link String} representation of the {@link Fighter}.
	 */
	public String toString(){
		String className = this.getClass().getSimpleName();
		StringBuilder sb = new StringBuilder("<" + className + "| ");
		sb.append("name: " + getName());
		sb.append("|>");
		return sb.toString();
	}
}
