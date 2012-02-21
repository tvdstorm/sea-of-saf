package ast.fighter;

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
}
