package saf.ast;

import java.util.List;
import java.util.ArrayList;

public class FighterDef {

	private final String name;
	private final List<Characteristic> characteristics;
	private final List<Behaviour> behaviours;
	
	public String getName() {
		return this.name;
	}
	

	public List<Characteristic> getCharacteristics() {
		return this.characteristics;
	}
	
	public int getCharacteristicValue(String name) {
		for(Characteristic c : this.characteristics) {
			if(name.equals(c.getType())) {
				return c.getValue();
			}
		}
		// return default value
		return 5;
	}

	public List<Behaviour> getBehaviours() {
		return this.behaviours;
	}

	public FighterDef(String name)	{
		this.name = name;
		this.characteristics = new ArrayList<Characteristic>();
		this.behaviours = new ArrayList<Behaviour>();
	}
	
	public void addCharacteristics(Characteristic c) {
		this.characteristics.add(c);
	}
	
	public void addBehaviour(Behaviour b) {
		this.behaviours.add(b);
	}
	
	public String toString(String indent) {
		
		String text = "Name: " + this.name; 
		
		for(Characteristic c : this.characteristics) {
			text += "\n" + c.toString(indent);
		}
		
		for(Behaviour b : this.behaviours) {
			text += "\n" + b.toString(indent);
		}
		
		return text;
	}
}