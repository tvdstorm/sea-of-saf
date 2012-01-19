package ast;

import java.util.ArrayList;
import java.util.List;

public class Bot{
	private String name;
	private List<Characteristic> characteristics;
	private List<Rule> rules;

	public Bot(){
		characteristics = new ArrayList<Characteristic>();
		rules = new ArrayList<Rule>();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addCharacteristic(Characteristic characteristic) {
		this.characteristics.add(characteristic);
	}

	public void addRule(Rule rule) {
		this.rules.add(rule);
	}
	
	@Override
	public String toString(){
		String s = "Bot : " + name + "{\n";
		for(Characteristic c: this.characteristics)
			s += c.toString();
		for(Rule r: this.rules)
			s += r.toString();
		s += "}\n";
		return s;
	}
}