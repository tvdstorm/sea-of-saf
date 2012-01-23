package ast;

import java.util.ArrayList;
import java.util.List;

import saf.ISAFElement;
import saf.ISAFElementVisitor;

public class BotElement implements ISAFElement{
	private String name;
	private List<CharacteristicElement> characteristicElements;
	private List<RuleElement> ruleElements;

	public BotElement(){
		this.characteristicElements = new ArrayList<CharacteristicElement>();
		this.ruleElements = new ArrayList<RuleElement>();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/* TODO iterator??? */
	public List<CharacteristicElement> getCharacteristicElements() {
		return this.characteristicElements;
	}
	/* TODO iterator??? */
	public List<RuleElement> getRules() {
		return this.ruleElements;
	}

	public void addCharacteristic(CharacteristicElement characteristic) {
		this.characteristicElements.add(characteristic);
	}

	public void addRule(RuleElement rule) {
		this.ruleElements.add(rule);
	}

	@Override
	public void accept(ISAFElementVisitor visitor) throws Exception{
		visitor.visit(this);
		for(CharacteristicElement characteristic: this.characteristicElements)
			characteristic.accept(visitor);
		for(RuleElement rule: this.ruleElements)
			rule.accept(visitor);		
	}
}