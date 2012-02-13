package saf.fighter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Behaviour {

	private final static Set<String> validConditions = new HashSet<String>(Arrays.asList(
    	    "always","near","far","much_stronger","stronger","even","weaker","much_weaker"
    ));    
	private final static Set<String> validMoves = new HashSet<String>(Arrays.asList(
    	    "walk_towards","walk_away","run_towards","run_away","jump","crouch","stand"
    ));
	private final static Set<String> validAttacks = new HashSet<String>(Arrays.asList(
    	    "block_low","block_high","punch_low","punch_high","kick_low","kick_high"
    ));
	
	public Behaviour(String condition, List<String> moves, List<String> attacks) {
		// TODO Auto-generated constructor stub
	}

	public static String validValues(){
		return "The only valid behaviours have one of the following conditions: "+validConditions+
			   ", one of the following moves: "+validMoves+
			   ", and one of those attacks: "+validAttacks;
	}
	
	public static boolean isValid(String condition, List<String> moves, List<String> attacks) {
		return 	validConditions.contains(condition) && 
				validMoves.containsAll(moves) && 
				validAttacks.containsAll(attacks);
	}

}
