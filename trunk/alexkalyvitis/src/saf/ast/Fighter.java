package saf.ast;

import java.util.ArrayList;

public class Fighter {
	
	private String name;
	private ArrayList<Strength> strengths;
	private ArrayList<Behavior> behaviors;
	
	public Fighter(){
		this.name = "";
		this.strengths = new ArrayList<Strength>();
		this.behaviors = new ArrayList<Behavior>();
	}
	
	public void setName(String n){ this.name = n; }
	public void appendName(String n){ this.name += " " + n; }
	public void addStrength(Strength s){ this.strengths.add(s); }
	public void addBehavior(Behavior b){ this.behaviors.add(b); }
	public void addBehaviors(ArrayList<Behavior> b){ this.behaviors.addAll(b); }
	
	public String getName(){ return this.name; }
	public ArrayList<Strength> getStrengths(){ return this.strengths; }
	public ArrayList<Behavior> getBehaviors(){ return this.behaviors; }
}
