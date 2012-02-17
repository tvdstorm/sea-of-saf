/**
 * 
 */
package saf.fighter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Attack implements AST {
	private final static Set<String> VALID_ATTACKS = new HashSet<String>(Arrays.asList(
    	    "block_low","block_high","punch_low","punch_high","kick_low","kick_high"
    ));
	
	private String attack;
	
	public Attack(String attack) {
		this.attack = attack;
	}

	public String getValue() {
		return attack;
	}
	
	public List<AST> getChildren() {
		return new LinkedList<AST>();
	}
	
	public static String describeValidValues() {
		return "Valid attacks are: "+VALID_ATTACKS;
	}
	
	public static boolean isValidValue(String attack) {
		return VALID_ATTACKS.contains(attack);
	}
	
	public static class UndecidedAttack extends Attack {

		List<Attack> optionalAttacks;
		
		public UndecidedAttack(List<String> attacks) {
			super(null); // we don't use parent members
			this.optionalAttacks = new ArrayList<Attack>();
			for(String attack: attacks) {
				this.optionalAttacks.add(new Attack(attack));
			}
		}
		
		//TODO override methods that need a random attack here:
		public List<AST> getChildren() {
			return new LinkedList<AST>(optionalAttacks);
		}
		
	}

}