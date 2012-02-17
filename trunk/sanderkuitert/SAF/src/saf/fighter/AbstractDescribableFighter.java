package saf.fighter;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import saf.fighter.fdl.DescribableFighter;

abstract class AbstractDescribableFighter implements DescribableFighter, AST {

	protected String name;
	protected Map<Aspect, Aspect.Value> properties;
	protected Map<Condition, Action> behaviours;
	
	
	public AbstractDescribableFighter(){	
		this.name = "Anonymous";
		this.properties = new HashMap<Aspect, Aspect.Value>();
		this.behaviours = new HashMap<Condition, Action>();
	}
	
	public AbstractDescribableFighter(String name, Map<Aspect, Aspect.Value> properties, 
													Map<Condition, Action> behaviours) {
		this.name = name;
		this.properties = properties;
		this.behaviours = behaviours;
	}

	//--- Implementing AST ---
	public String getValue() {
		return name;
	}
	
	//TODO ugly
	public List<AST> getChildren() {
		LinkedList<AST> result = new LinkedList<AST>();
		for(Entry<Aspect, Aspect.Value> entry: properties.entrySet()) {
			result.add(entry.getKey());
			result.add(entry.getValue());
		}
		for(Entry<Condition, Action> entry: behaviours.entrySet()) {
			result.add(entry.getKey());
			result.add(entry.getValue());
		}
		return result;
	}
	
	public String describeValidValues() {
		return validNames()+"\n"+
				validProperties()+"\n"+
				validBehaviour();
	}
	
	public boolean isValidValue(String name) {
		return isValidName(name);
	}
	
	public boolean equals(Object other) {
		if(other instanceof AbstractDescribableFighter) {
			return this.name.equals(((AbstractDescribableFighter)other).getValue());
//				&& this.getChildren().equals(((AbstractDescribableFighter)other).getChildren()); //TODO
		}
		return false;
	}

	//Attribute validity
	public boolean isValidName(String name) {
		return true;
	}
	
	public boolean isValidAspect(String aspect) {
		return Aspect.isValidValue(aspect);
	}
	
	public boolean isValidPropertyValue(String aspect, int value) {
		return Aspect.Value.isValidValue(aspect, value);
	}
	
	public boolean isValidCondition(String condition) {
		return Condition.isValidValue(condition);
	}
	
	public boolean isValidMove(String move) {
		return Move.isValidValue(move);
	}
	
	public boolean isValidAttack(String attack) {
		return Attack.isValidValue(attack);
	}
	
	
	//Attribute possibilities
	public String validNames() {
		return "Any name is valid.";
	}
	
	public String validProperties() {
		return "Properties consist of an aspect and value.\n"+
				Aspect.describeValidValues();
	}
	
	public String validBehaviour() {
		return "Behaviours consist of a condition, moves and attacks.\n"+
				Condition.describeValidValues()+"\n"+
				Move.describeValidValues()+"\n"+
				Attack.describeValidValues()+"\n";
	}
	
	public String getAlwaysCondition() {
		return Condition.getAlwaysCondition();
	}
	
	//Attribute addition
	/** @require isValidName(name) */
	public void setName(String name) {
		assert isValidName(name): "Name requirement broken";
		this.name = name;
	}
	
	/** @require isValidAspect(aspect) && isValidAspectValue(aspect, value) */
	public void addProperty(String aspect, int value) {
		assert isValidAspect(aspect) && isValidPropertyValue(aspect, value): "Requirement broken";
		this.properties.put(new Aspect(aspect), new Aspect.Value(value));
	}
	
	/** @require isValidBehaviour(conditions, moves, attacks) */
	public void addBehaviour(List<String> conditions, List<String> moves, List<String> attacks) {
		assert isValidBehaviour(conditions, moves, attacks): "Requirement broken";
		this.behaviours.put(new Condition(conditions), new Action(moves, attacks));
	}
	
	//Only used in addBehaviour() assertion
	private boolean isValidBehaviour(List<String> conditions, List<String> moves, List<String> attacks) {
		for(String condition: conditions) {
			if(!isValidCondition(condition)) {
				return false;
			}
		}
		for(String move: moves) {
			if(!isValidMove(move)) {
				return false;
			}
		}
		for(String attack: attacks) {
			if(!isValidAttack(attack)) {
				return false;
			}
		}
		return true;
	}
	
}
