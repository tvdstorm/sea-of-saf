package checker;

import java.util.ArrayList;
import java.util.List;

import config.settings;

import saf.*;

public class SafVisitorCheck implements SafVisitor {	
	private List<String> errors = new ArrayList<String>();
	
	@Override
	public void visit(Saf saf) {
		// TODO technische implementatie van visitor
		saf.getBehaviour().accept(this);
		
        if (this.errors.size() > 0)
        	System.exit(this.errors.size());
    }
 
	@Override
    public void visit(Personality p) {
		for (String strength : settings.Strengths.getItems()) {
    		if (! p.hasStrength(strength) ) addError("Strength " + strength + " is not defined");
		}
    }
 
    @Override
	public void visit(Strength s) {    	 
    	try {
			inList(settings.Strengths, s.getCharacteristic());
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
    }
    
    @Override
    public void visit(ConditionConnective conditionConnective) {
    }
    
    @Override
    public void visit(ConditionAnd c) {
    }
    
    @Override
    public void visit(ConditionOr c) {
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
    	assert ma != null;
    	if (!settings.Fights.inList(ma.getType())) {
    		addError("nov alid ");
    	}
//    	try {
//			inList(settings.Fights, ma.getType());
//		} catch (SafException e) {
//			addError(e.getMessage());
//		}
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
