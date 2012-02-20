package saf.ast;

import java.util.ArrayList;
import java.util.List;

import saf.ast.base.BehaviorItem;
import saf.simulator.enums.*;

public class Fighter extends BehaviorItem{
	
	private String name;
	private List<Strength> strengths;
	private List<Behavior> behaviors;
	
	private int health;
	
	private float weight;
	private float height;
	private float speed;
	
	private FighterStatus status;
	private FighterLocation location;
	
	public Fighter(){
		this.name = "";
		this.strengths = new ArrayList<Strength>();
		this.behaviors = new ArrayList<Behavior>();
	}
	
	public Fighter(String n){
		this.name = n;
		this.strengths = new ArrayList<Strength>();
		this.behaviors = new ArrayList<Behavior>();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void appendName(String name) {
		this.name = this.name + " " + name;
	}

	public List<Strength> getStrengths() {
		return strengths;
	}
	
	public int getStrengthValue(String strength){
		int index = strengths.indexOf(new Strength(strength));
		if(index == -1)
			return 5;
		return strengths.get(index).getValue();
	}

	public void setStrengths(List<Strength> strengths) {
		this.strengths = strengths;
	}
	
	public void addStrength(Strength strength){
		this.strengths.add(strength);
	}

	public List<Behavior> getBehaviors() {
		return behaviors;
	}

	public void addBehaviors(List<Behavior> behaviors) {
		this.behaviors.addAll(behaviors);
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	public void reduceHealth(int units){
		this.health -= units;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public FighterStatus getStatus() {
		return status;
	}

	public void setStatus(FighterStatus status) {
		this.status = status;
	}

	public FighterLocation getLocation() {
		return location;
	}

	public void setLocation(FighterLocation location) {
		this.location = location;
	}
	
	public int getTotalStrength(){ 
		int sumStrength = 0;
		for(Strength s : strengths) { 
			sumStrength += s.getValue(); 
		}
		return sumStrength;
	}
	
	public int getValueOfStrength(String s){
		for(Strength strength : strengths){
			if(strength.getName().equals(s)){
				return strength.getValue();
			}
		}
		return 5;
	}
	
	public void print(){
		System.out.println("Name: " + name);
		System.out.println("Weight: " + weight);
		System.out.println("Height: " + height);
		System.out.println("Speed: " + speed);
		for (Strength strength : strengths){
			System.out.println("\tStrength :" + strength.toString());
		}
		for (Behavior behavior : behaviors){
			System.out.println("\tBehavior :" + behavior);
		}
	}
}
