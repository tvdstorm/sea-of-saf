package saf.astelements;

import java.util.List;

import saf.ISAFNode;
import saf.ISAFNodeVisitor;

public class Fighter implements ISAFNode{
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
	public void accept(ISAFNodeVisitor visitor){
		visitor.visit(this);		
	}
}