package model;
import java.util.ArrayList;
import java.util.List;

public class Fighter extends ASTNode{
	
	//private static final Integer DEFAULT_STRENGTH = 5;
	private String name;
	private ArrayList<Behavior> behaviors = new ArrayList<Behavior>();
	private Personality personality = new Personality();
	
	
	
	public void setName(String nameFighter) {
        this.name = nameFighter;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addBehavior(Behavior behavior) {
		this.behaviors.add(behavior);
	}
	
	public void addCharacteristic(Characteristic characteristic) {
		this.personality.add(characteristic);
	}	
	
}
