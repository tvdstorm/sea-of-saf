package saf.fighter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Behaviour implements AST {

	private Map<Condition, Action> behaviours;
	
	//TODO move
	private Set<String> validConditions = new HashSet<String>(Arrays.asList(
    	    "always","near","far","much_stronger","stronger","even","weaker","much_weaker"
    ));    
	private Set<String> validMoves = new HashSet<String>(Arrays.asList(
    	    "walk_towards","walk_away","run_towards","run_away","jump","crouch","stand"
    ));
	private Set<String> validAttacks = new HashSet<String>(Arrays.asList(
    	    "block_low","block_high","punch_low","punch_high","kick_low","kick_high"
    ));
	
	public Behaviour() {
//		behaviours = new HashMap<Condition, Action>();
	}
	
	public Behaviour(String condition, List<String> moves, List<String> attacks) {
		this();
//		behaviours.put(new Condition(... TODO
	}

	public String validPropertyValues(){
		return "The only valid behaviours have one of the following conditions: "+validConditions+
			   ", one of the following moves: "+validMoves+
			   ", and one of those attacks: "+validAttacks;
	}
	
	public boolean isValid(String condition) {
//		return behaviours.get(condition).isValid();
		return true; //TODO
	}

}
