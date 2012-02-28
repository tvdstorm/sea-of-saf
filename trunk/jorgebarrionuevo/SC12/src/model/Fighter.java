package model;
import java.util.ArrayList;
import java.util.List;

import util.Visitor;

public class Fighter extends ASTNode{
	
	
	private String name;
	private ArrayList<Behaviour> behaviors = new ArrayList<Behaviour>();
	private Personality personality = new Personality();
	
	public void setName(String nameFighter) {
        this.name = nameFighter;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addBehavior(Behaviour behaviour) {
		this.behaviors.add(behaviour);
	}
	
	public void addCharacteristic(Characteristic characteristic) {
		this.personality.addCharacteristic(characteristic);
	}
	
	public Personality getPersonality() {
		return this.personality;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
}
