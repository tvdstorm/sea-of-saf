package AbstractSyntaxTree;

import java.util.ArrayList;

public class Fighter {
	
	private String name;
	private Personality personality;
	private ArrayList<BehaviorRule> behavior;
	
	private float weight;
	private float height;
	private float speed;
	
	private int health; //10 full life - 0 dead
	
	private Location location;
	
	public Fighter(){
		this.name = "";
		this.personality = new Personality();
		this.behavior = new ArrayList<BehaviorRule>();
		
		this.health = 10;
		
		this.weight = 0;
		this.height = 0;
		this.speed = 0;
		
		this.location = new Location();
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
		
	public String getName() {
		return name;
	}

	public void setPersonality(Personality newPersonality){
		this.personality = newPersonality;
	}

	public Personality getPersonality(){
		return personality;
	}
	
	public void setBehavior(ArrayList<BehaviorRule> newBehavior){
		this.behavior = newBehavior;
	}
	
	public ArrayList<BehaviorRule> getBehavior(){
		return behavior;
	}
	
}
