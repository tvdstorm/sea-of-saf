package test;

//import java.util.ArrayList;
//import java.util.List;

import java.util.ArrayList;
import java.util.List;

import saf.*;
//import test.*;

public class SafVisitorCheck implements SafVisitor {

	final SafList Strenghts = new SafList("strength", new String[]{ "punchReach", "punchPower", "kickReach", "kickPower" } );
	final SafList Conditions = new SafList("condition", new String[]{ "always", "near", "far", "much_stronger", "stronger", "even", "weaker", "much_weaker" } );
	final SafList Moves = new SafList("move", new String[]{ "walk_towards", "walk_away", "run_towards", "run_away", "jump", "crouch", "stand" } );
	final SafList Fights = new SafList("fight", new String[]{ "block_low", "block_high", "punch_low", "punch_high", "kick_low", "kick_high" } );
	
	final int minStrength = 1;
	final int maxStrength = 9;
	
	private List<String> errors = new ArrayList<String>();
	
	@Override
	public void visit(Saf saf) {      
        System.out.println("Visiting " + saf.getName());

        if (saf.getBehaviour() == null) addError("There is no behaviour defined");
        if (saf.getPersonality() == null) addError("There is no personality defined");
    }
 
	@Override
    public void visit(Personality p) {
        //System.out.println("Visiting personality");
    }
 
    @Override
	public void visit(Strength s) {    	 
    	try {
			inList(this.Strenghts, s.getCharacteristic());
		} catch (SafException e) {
			addError(e.getMessage());
		}
    	
    	if (s.getValue() > this.maxStrength) 
    		addError("Value for strength " + s.getCharacteristic() + " is too large: " + s.getValue());
    	
    	if (s.getValue() < this.minStrength) 
    		addError("Value for strength " + s.getCharacteristic() + " is too small: " + s.getValue());
	} 
    
    @Override
    public void visit(Behaviour b) {
        //System.out.println("Visiting behaviour");
    }
    
    @Override
    public void visit(BehaviourRule br) {
        //System.out.println("Visiting BehaviourRule");
    }
    
    @Override
    public void visit(Condition c) {
    	try {
			inList(this.Conditions, c.getType());
		} catch (SafException e) {
			addError(e.getMessage());
		}
    }
    
    @Override
    public void visit(WalkAction ma) {
    	try {
			inList(this.Moves, ma.getType());
		} catch (SafException e) {
			addError(e.getMessage());
		}
    }
    
    @Override
    public void visit(FightAction ma) {
    	try {
			inList(this.Fights, ma.getType());
		} catch (SafException e) {
			addError(e.getMessage());
		}
    }
    
    @Override
    public void visit(Type t) {
        System.out.println("Visiting type:" + t.getType());
    }
    
    public void inList(SafList sl, String item) throws SafException {
    	if ( !sl.inList(item) ) 
    		throw new SafException("no valid " + sl.getType() + ": " + item + ", did you mean: " + sl.getSuggestion(item));
    }
    
    public void addError(String error) {
    	this.errors.add(error);
    	System.err.println(error);
    }
}
