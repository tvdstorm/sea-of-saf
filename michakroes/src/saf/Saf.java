package saf;

import checker.SafInterface;
import checker.SafVisitor;

public class Saf implements SafInterface {

	private String name;
	
	private Behaviour behaviour;
	private Personality personality; 

	private int health; 
	
	private int posX;
	private int posY;
	
	public Saf(String name, Personality p, Behaviour b) {
        this.name = name;
        this.personality = p; 
        this.behaviour = b;
        this.health = 100;
	} 

	public String getName() {
		return name;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public int getHealth() {
		return health;
	}
	
	public Personality getPersonality() {
		return this.personality;
	}
	
	public Behaviour getBehaviour() {
		return this.behaviour;
	}
	
	@Override
	public void accept(SafVisitor visitor) {
		this.behaviour.accept(visitor);
		this.personality.accept(visitor);
		
		visitor.visit(this);
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
}
