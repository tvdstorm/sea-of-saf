package saf.fighter;

import java.util.LinkedList;
import java.util.List;

import saf.fighter.fdl.DescribableFighter;

abstract class AbstractDescribableFighter implements DescribableFighter, AST {

	protected String name;
	protected List<Characteristic> characteristics;
	protected List<Behaviour> behaviours;
	
	public AbstractDescribableFighter(){	
		this.name = "Anonymous";
		this.characteristics = new LinkedList<Characteristic>();
		this.behaviours = new LinkedList<Behaviour>();
	}
	
	//--- AST
	public String validPropertyValues() {
		return validNames()+"\n"+
				validCharacteristics()+"\n"+
				validBehaviour();
	}
	
	public boolean isValid(String name) {
		return isValidName(name);
	}
	
	//--- Describable Fighter
	//--- Validity tests:
	public boolean isValidName(String name) {
		return true;
	}
	
	public boolean isValidProperty(String property) {
		return new Property().isValid(property);
	}
	
	public boolean isValidPropertyValue(int value) {
		return new Property().isValid(value);
	}
	
	public boolean isValidCondition(String condition) {
		return new Condition().isValid(condition);
	}
	
	public boolean isValidMove(String move) {
		return new Action().new Move().isValid(move);
	}
	
	public boolean isValidAttack(String attack) {
		return new Action().new Attack().isValid(attack);
	}
	
	
	//--- Attribute possibilities:
	public String validNames() {
		return "Any name is valid.";
	}
	
	public String validCharacteristics() {
		return new Characteristic().validPropertyValues();
	}
	
	public String validBehaviour() {
		return new Behaviour().validPropertyValues();
	}
	
	
	//--- Set values:
	/** @require isValidName(name) */
	public void setName(String name) {
		assert isValidName(name): "Name requirement broken";
		this.name = name;
	}
	
	/** @require isValidProperty(property) && isValidPropertyValue(value) */
	public void addCharacteristic(String property, int value) {
		assert isValidProperty(property) && isValidPropertyValue(value): 
										"Characteristic requirement broken";
		this.characteristics.add(new Characteristic(property,value));
	}
	
	/** @require isValidCondition(condition) && 
	 * 		for each move: isValidMove(move) &&
	 * 		for each attack: isValidAttack(attack) */
	public void addBehaviour(String condition, List<String> moves, List<String> attacks) {
		assert isValidCondition(condition) && validMoves(moves) && validAttacks(attacks):
											"Behaviour requirement broken";
		this.behaviours.add(new Behaviour(condition, moves, attacks));
	}
	
	//---Only used in addBehaviour-assert: 
	//TODO remove in final?
	private boolean validMoves(List<String> moves) {
		for(String move: moves)
			if(!isValidMove(move))
				return false;
		return true;
	}
	
	private boolean validAttacks(List<String> attacks) {
		for(String attack: attacks)
			if(!isValidAttack(attack))
				return false;
		return true;
	}
}
