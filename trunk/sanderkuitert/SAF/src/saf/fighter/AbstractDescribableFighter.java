package saf.fighter;

import java.util.LinkedList;
import java.util.List;

import saf.fighter.fdl.DescribableFighter;

abstract class AbstractDescribableFighter implements DescribableFighter, AST {

	protected String name;
	protected List<Property> properties;
	protected List<Condition> behaviours;
	
	
	public AbstractDescribableFighter(){	
		this.name = "Anonymous";
		this.properties = new LinkedList<Property>();
		this.behaviours = new LinkedList<Condition>();
	}

	
	public boolean equals(Object other) {
		if(other instanceof AbstractDescribableFighter) {
			return this.name.equals(((AbstractDescribableFighter)other).getName()) &&
						this.getChildren().equals(((AbstractDescribableFighter)other).getChildren());
		}
		return false;
	}
	
	//--- Implementing AST ---
	public String getName() {
		return name;
	}
	
	public List<AST> getChildren() {
		List<AST> result = new LinkedList<AST>();
		result.addAll(properties);
		result.addAll(behaviours);
		return result;
	}
	
	//--- Implementing DescribableFighter ---
	//Attribute validity
	public boolean isValidName(String name) {
		return true;
	}
	
	public boolean isValidAspect(String aspect) {
		return VALID_ASPECTS.contains(aspect);
	}
	
	public boolean isValidPropertyValue(String aspect, int value) {
		return new Property(aspect).isValidValue(value);
	}
	
	public boolean isValidCondition(String condition) {
		return VALID_CONDITIONS.contains(condition);
	}
	
	public boolean isValidMove(String move) {
		return VALID_MOVES.contains(move);
	}
	
	public boolean isValidAttack(String attack) {
		return VALID_ATTACKS.contains(attack);
	}
	
	
	//Attribute possibilities
	public String validNames() {
		return "Any name is valid.";
	}
	
	public String validProperties() {
		return "Valid properties are: "+VALID_ASPECTS+". By default, these range between "+
					DEFAULT_PROPERTY_MIN+" and "+DEFAULT_PROPERTY_MAX+".";
	}
	
	public String validBehaviour() {
		return "Behaviours consist of a condition, moves and attacks.\n"+
					"Valid conditions are: "+VALID_CONDITIONS+"\n"+
					"Valid moves are: "+VALID_MOVES+"\n"+
					"Valid attacks are: "+VALID_ATTACKS+"\n";
	}
	
	public String getAlwaysCondition() {
		return ALWAYS_CONDITION;
	}
	
	//Attribute addition
	/** @require isValidName(name) */
	public void setName(String name) {
		assert isValidName(name): "Name requirement broken";
		this.name = name;
	}
	
	/** @require isValidAspect(aspect) && isValidAspectValue(aspect, value) */
	public void addProperty(String aspect, int value) {
		assert isValidAspect(aspect) && isValidPropertyValue(aspect, value): "Aspect requirement broken";
		this.properties.add(new Property(aspect, value));
	}
	
	/** 
	 * @require non-empty lists with valid members 
	 */
	public void addBehaviour(List<String> postOrderConditionTree, List<String> moves, List<String> attacks) {
		Condition condition;
		
		//Create condition hierarchy
		Condition orCondition = null;
		Condition andCondition = null;
		List<Condition> atomicConditions = new LinkedList<Condition>();
		for(String element: postOrderConditionTree) {
			if(element.equals("or")) {
				atomicConditions.add(andCondition); //combine
				orCondition = new Condition.CompoundCondition(false, atomicConditions);
				andCondition = null;
				atomicConditions.clear();
			} else if(element.equals("and")) {
				andCondition = new Condition.CompoundCondition(true, atomicConditions);
				atomicConditions.clear();
			} else {
				atomicConditions.add(new Condition(element, new Action(moves, attacks)));
			}
		}
		
		//Select toplevel condition
		if(atomicConditions.size()>0) {
			condition=atomicConditions.get(0);
		} else if(andCondition != null) {
			condition=andCondition;
		} else {
			condition = orCondition;
		}
		
		this.behaviours.add(condition);
	}
	
}
