package saf.astelements;

import java.util.List;

import saf.ISAFElement;
import saf.ISAFElementVisitor;

public class Fighter implements ISAFElement{
	private String name;
	private List<Characteristic> characteristics;
	private List<Rule> rules;

	public Fighter(String name, List<Characteristic> characteristics, List<Rule> rules){
		this.name = name;
		this.characteristics = characteristics;
		this.rules = rules;
	}

	public List<Characteristic> getCharacteristics() {
		return characteristics;
	}

	public String getName() {
		return name;
	}
	
	public List<Rule> getRules() {
		return rules;
	}
	
	@Override
	public void accept(ISAFElementVisitor visitor){
		visitor.visit(this);		
	}
}