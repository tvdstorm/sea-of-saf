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
	
	public AbstractDescribableFighter(String name, List<Characteristic> characteristics, 
															List<Behaviour> behaviours) {
		this.name = name;
		this.characteristics = characteristics;
		this.behaviours = behaviours;
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
	
	public String getAlwaysCondition() {
		return new Condition().getAlwaysCondition();
	}
	
	//--- Set values:
	/** @require isValidName(name) */
	public void setName(String name) {
		assert isValidName(name): "Name requirement broken";
		this.name = name;
	}
	
	/** @require new Characteristic().isValid(property) */
	public void addCharacteristic(String property, int value) {
		assert new Characteristic().isValid(property): "Characteristic requirement broken";
		this.characteristics.add(new Characteristic(property,value));
	}
	
	/** @require new Behaviour().isValid(condition) */
	public void addBehaviour(String condition, List<String> moves, List<String> attacks) {
		assert new Behaviour().isValid(condition): "Behaviour requirement broken";
		this.behaviours.add(new Behaviour(condition, moves, attacks));
	}
	
}
