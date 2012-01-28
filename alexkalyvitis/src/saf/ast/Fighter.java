package saf.ast;

import java.util.ArrayList;
import java.util.List;

public class Fighter extends SafObject{
	
	private String name;
	private List<Strength> strengths;
	private List<Behavior> behaviors;
	
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
	
	public void setName(String n){ this.name = n; }
	public void appendName(String n){ this.name += " " + n; }
	public void addStrength(Strength s){ this.strengths.add(s); }
	public void addBehavior(Behavior b){ this.behaviors.add(b); }
	public void addBehaviors(List<Behavior> b){ this.behaviors.addAll(b); }
	
	public String getName(){ return this.name; }
	public List<Strength> getStrengths(){ return this.strengths; }
	public List<Behavior> getBehaviors(){ return this.behaviors; }
	
	public void print(){
		System.out.println("Name: " + name);
		for (Strength strength : strengths){
			System.out.println("\tStrength :" + strength.toString());
		}
		for (Behavior behavior : behaviors){
			System.out.println("\tBehavior :" + behavior);
		}
	}
}
