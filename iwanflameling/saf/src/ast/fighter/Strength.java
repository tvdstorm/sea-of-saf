package ast.fighter;

import ast.Visitor;

/**
 * 
 * @author iwan
 *
 */
public class Strength extends FighterProp {
	
	private String fightId;
	private int fightPower;
	
	public Strength(String fightId, int fightPower){
		this.fightId = fightId;
		this.fightPower = fightPower;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);	
	}

	/**
	 * @return the fightId
	 */
	public String getFightId() {
		return fightId;
	}

	/**
	 * @return the fightPower
	 */
	public int getFightPower() {
		return fightPower;
	}
	
}
