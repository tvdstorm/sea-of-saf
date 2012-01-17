package AST;

import java.util.ArrayList;
import java.util.List;

public class Bot{
	public String name;
	public List<Characteristic> characteristics;
	public List<Rule> rules;
	
	public Bot(){
		characteristics = new ArrayList<Characteristic>();
		rules = new ArrayList<Rule>();
	}
	
	@Override
	public String toString(){
		String s = "Bot : " + name + "{\n";
		for(Rule r: this.rules)
			s += r.toString();
		for(Characteristic c: this.characteristics)
			s += c.toString();
		s += "}\n";
		return s;
	}
}