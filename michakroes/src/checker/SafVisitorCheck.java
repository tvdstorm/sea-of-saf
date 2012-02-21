package checker;

import java.util.ArrayList;
import java.util.List;

import config.settings;

import saf.*;

/*
 * Checks if Super Awesome Fighter has valid properties.
 * 
 * checks the following properties:
 * - Personality
 * 	 -> valid strengts
 *     -> valid characteristics
 *     -> valid powers (in bounds)
 *   -> presence of all strengths
 * - Behaviour 
 *   -> valid rules
 *     -> valid string
 *   -> required always rule
 *  
 */
public class SafVisitorCheck implements SafVisitor {	
	private List<String> errors = new ArrayList<String>();
	
	@Override
	public void visit(Saf saf) {
        if (saf.getBehaviour() == null) addError("There is no behaviour defined");
        if (saf.getPersonality() == null) addError("There is no personality defined");
    }
 
	@Override
    public void visit(Personality p) {
		for (String strength : settings.Strenghts.getItems()) {
    		if (! p.hasStrength(strength) ) addError("Strength " + strength + " is not defined");
		}
    }
 
    @Override
	public void visit(Strength s) {    	 
    	try {
			inList(settings.Strenghts, s.getCharacteristic());
		} catch (SafException e) {
			addError(e.getMessage());
		}
    	
    	if (s.getValue() > settings.maxStrength) 
    		addError("Value for strength " + s.getCharacteristic() + " is too large: " + s.getValue());
    	
    	if (s.getValue() < settings.minStrength) 
    		addError("Value for strength " + s.getCharacteristic() + " is too small: " + s.getValue());
	} 
    
    @Override
    public void visit(Behaviour b) {    	
    	if (b.getAlwaysRule() == null)
    		addError("Always is not defined");
    }
    
    @Override
    public void visit(BehaviourRule br) {
        
    }
    
    @Override
    public void visit(Condition c) {
    	//System.out.println("Visiting Condition");
    }
    
    @Override
    public void visit(ConditionConnective conditionConnective) {
    	//System.out.println("Visiting conditionConnective");
    }
    
    @Override
    public void visit(ConditionAnd c) {
    	//System.out.println("Visiting ConditionAnd");
    }
    
    @Override
    public void visit(ConditionOr c) {
    	//System.out.println("Visiting ConditionOr");
    }
    
    @Override
    public void visit(ConditionAction c) {
    	try {
			inList(settings.Conditions, c.getCondition());
		} catch (SafException e) {
			addError(e.getMessage());
		}
    }
    
    @Override
    public void visit(WalkAction ma) {
    	try {
			inList(settings.Moves, ma.getType());
		} catch (SafException e) {
			addError(e.getMessage());
		}
    }
    
    @Override
    public void visit(FightAction ma) {
    	try {
			inList(settings.Fights, ma.getType());
		} catch (SafException e) {
			addError(e.getMessage());
		}
    }
    
    public void inList(SafList sl, String item) throws SafException {
    	if ( !sl.inList(item) ) 
    		throw new SafException("no valid " + sl.getType() + ": " + item + ", did you mean: " + sl.getSuggestion(item));
    }
    
    public void addError(String error) {
    	this.errors.add(error);
    	System.err.println(error);
    }
    
    public int getCountErrors() {
    	return this.errors.size();
    }
}
