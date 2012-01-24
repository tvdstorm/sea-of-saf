package saf.classes;

import java.lang.reflect.Field;
import java.util.Vector;

public class Fighter {
	
	//Constructor
	public Fighter(String name, Vector<Characteristic> personality, Vector<Rule> behaviour) {
		setName(name);
		setPersonality(personality);
		setBehaviour(behaviour);
	}
	
	//Name
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//Personality
	private Vector<Characteristic> personality;
	
	public Vector<Characteristic> getPersonality() {
		return personality;
	}

	public void setPersonality(Vector<Characteristic> personality) {
		this.personality = personality;
	}
	
	
	//Behaviour
	private Vector<Rule> behaviour;
	
	public Vector<Rule> getBehaviour() {
		return behaviour;
	}

	public void setBehaviour(Vector<Rule> behaviour) {
		this.behaviour = behaviour;
	}
}

