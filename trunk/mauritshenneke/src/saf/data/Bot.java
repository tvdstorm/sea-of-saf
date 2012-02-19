package saf.evaluators;

import java.util.ArrayList;

public class Bot {
	private String name;
	private ArrayList<Characteristic> characteristics;
	private ArrayList<Behaviour> behaviour;
	public Bot(String name, ArrayList<Characteristic> characteristics,
			ArrayList<Behaviour> behaviour) {
		super();
		this.name = name;
		this.characteristics = characteristics;
		this.behaviour = behaviour;
	}
	@Override
	public String toString() {
		return "Bot [name=" + name + ", characteristics=" + characteristics
				+ ", behaviour=" + behaviour + "]";
	}

	
}