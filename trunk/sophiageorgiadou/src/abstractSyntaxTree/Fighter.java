package abstractSyntaxTree;

import java.util.ArrayList;

public class Fighter {
	
	private String name;
	private Personality personality;
	private Behavior behavior;
	
	private double weight;
	private double height;
	private double speed;
	
	private int health; //10 full life - 0 dead
	
	private Location location;
	
	public Fighter(){
		this.name="";
		this.personality=new Personality();
		this.behavior=new Behavior();
		
		this.weight=0.0;
		this.height=0.0;
		this.speed=0.0;
	}
	
	public void addPersonality(Personality personality){
		this.setPersonality(personality);
	}
	
	public void addBehavior(Behavior behavior){
		this.setBehavior(behavior);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the personality
	 */
	public Personality getPersonality() {
		return personality;
	}

	/**
	 * @param personality the personality to set
	 */
	public void setPersonality(Personality personality) {
		this.personality = personality;
	}

	/**
	 * @return the behavior
	 */
	public Behavior getBehavior() {
		return behavior;
	}

	/**
	 * @param behavior the behavior to set
	 */
	public void setBehavior(Behavior behavior) {
		this.behavior = behavior;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * @return the speed
	 */
	public double getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(double speed) {
		this.speed = speed;
	}

	/**
	 * @return the health
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * @param health the health to set
	 */
	public void setHealth(int health) {
		this.health = health;
	}

	/**
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(Location location) {
		this.location = location;
	}
		
	public String toString(){
		String temp="Name: "+this.name+"\n" +
				"Personality: "+this.personality+"\n" +
				"Behavior: "+this.behavior+"\n" +
				"Weight: "+this.weight+"\n" +
				"Height: "+this.height+"\n" +
				"Speed: "+this.speed+"\n" +
				"Health: "+this.health+"\n";	
		return temp;
	}
}
