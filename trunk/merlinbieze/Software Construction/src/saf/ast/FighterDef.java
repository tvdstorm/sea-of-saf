package saf.ast;

import java.util.List;
import java.util.ArrayList;

public class FighterDef {

	private final String name;
	private final List<Characteristic> characteristics;
	private final List<Behaviour> behaviours;
	private final static int DEFAULTVALUE = 5;

	public String getName() {
		return this.name;
	}

	public List<Characteristic> getCharacteristics() {
		return this.characteristics;
	}

	public int getCharacteristicValue(String name) {
		for (Characteristic c : this.characteristics) {
			if (name.equals(c.getType())) {
				return c.getValue();
			}
		}
		return DEFAULTVALUE;
	}

	public List<Behaviour> getBehaviours() {
		return this.behaviours;
	}

	public FighterDef(String name) {
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
}