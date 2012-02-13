package saf.fighter;

import java.security.InvalidParameterException;
import java.util.LinkedList;
import java.util.List;

import saf.fighter.fdl.DescribableFighter;
import saf.fighter.fdl.FDLReader;


public class SuperAwesomeFighter implements Fighter, DescribableFighter{
	
	String name;
	List<Characteristic> characteristics;
	List<Behaviour> behaviours;
	
	public SuperAwesomeFighter (){
		resetAttributes(); //set attributes to default
	}
	
	public SuperAwesomeFighter (String fdl) throws InvalidParameterException {
		this();
		
		new FDLReader(fdl).applyAttributes(this);
		
	}
	
//	public List<AST> children() {
//		
//		List<AST> result = new LinkedList<AST>();
//		result.add(characteristics);
//		result.add(behaviours);
//		
//		return result;
//	}
//	
//	public String validAttributes() {
//		String validAttributes = "";
//		for(Object child: children()){
//			validAttributes += child.validAttributes();
//		}
//		return validAttributes;
//	}
	
	public String validAttributes() {
		return Characteristic.validValues()+"\n"+Behaviour.validValues();
	}
	
	public boolean isValidName(String name) {
		return true;
	}
	
	public boolean isValidCharacteristic(String property, int value) {
		return Characteristic.isValid(property, value);
	}
	
	public boolean isValidBehaviour(String condition, List<String> moves, List<String> attacks) {
		return Behaviour.isValid(condition, moves, attacks);
	}
	
	public void resetAttributes(){
		name = "Anonymous";
		characteristics = new LinkedList<Characteristic>();
		behaviours = new LinkedList<Behaviour>();
	}
	
	/** @require isValidName(name) */
	public void setName(String name) {
		assert isValidName(name): "Name requirement broken";
		this.name = name;
	}
	
	/** @require isValidCharacteristic(property, value) */
	public void addCharacteristic(String property, int value) {
		assert isValidCharacteristic(property, value): "Characteristic requirement broken";
		this.characteristics.add(new Characteristic(property,value));
	}
	
	/** @require isValidBehaviour(condition, moves, attacks) */
	public void addBehaviour(String condition, List<String> moves, List<String> attacks) {
		assert isValidBehaviour(condition, moves, attacks): "Behaviour requirement broken";
		this.behaviours.add(new Behaviour(condition, moves, attacks));
	}

}
