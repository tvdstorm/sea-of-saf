package saf.objects;

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
	
	public Fighter(String n, Strength s, Behavior b){
		this.name = "";
		this.strengths = new ArrayList<Strength>(); this.strengths.add(s);
		this.behaviors = new ArrayList<Behavior>(); this.behaviors.add(b);
	}
	
	public String GetName(){ return this.name; }
	public ArrayList<Strength> GetStrengths(){ return this.strengths; }
	public ArrayList<Behavior> GetBehaviors(){ return this.behaviors; }
}
