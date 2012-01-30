package saf.evaluators;

import java.util.ArrayList;
import java.util.List;

public class Bot {
	private String name;
	private final List<Characteristic> characteristics;
	private final List<Behaviour> behaviours;
	
	public Bot() {
		this.characteristics = new ArrayList<Characteristic>();
		this.behaviours = new ArrayList<Behaviour>();
		
	}

	@Override
	public String toString() {
		return "Bot [name=" + name + ", characteristics=" + characteristics
				+ ", behaviours=" + behaviours + "]\n";
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void addCharacteristic(Characteristic characteristic) {
		this.characteristics.add(characteristic);
	}
	
	public void addBehaviour(Behaviour behaviour) {
		this.behaviours.add(behaviour);
	}
}