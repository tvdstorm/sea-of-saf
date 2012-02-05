package saf.ast;

import java.util.ArrayList;
import java.util.List;

import saf.ast.base.BehaviorItem;

public class Fighter extends BehaviorItem{
	
	private String name;
	private List<Strength> strengths;
	private List<Behavior> behaviors;
	private int health;
	
	private float weight;
	private float height;
	private float speed;
	
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
	
	public Fighter(Fighter f){
		name = f.name;
		strengths = f.strengths;
		behaviors = f.behaviors;
	}
	
	public void setName(String n){ this.name = n; }
	public void setWeight(float w){ this.weight = w; }
	public void setHeight(float h){ this.height = h; }
	public void setSpeed(float s){ this.speed = s; }
	public void setHealth(int h){ this.health = h; }
	public void appendName(String n){ this.name += " " + n; }
	public void addStrength(Strength s){ this.strengths.add(s); }
	public void addBehavior(Behavior b){ this.behaviors.add(b); }
	public void addBehaviors(List<Behavior> b){ this.behaviors.addAll(b); }
	
	public String getName(){ return this.name; }
	public List<Strength> getStrengths(){ return this.strengths; }
	public List<Behavior> getBehaviors(){ return this.behaviors; }
	public float getWeight(){ return this.weight; }
	public float getHeight(){ return this.height; }
	public float getSpeed(){ return this.speed; }
	public int getHealth(){ return health; }

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
