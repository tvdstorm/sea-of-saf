package saf.ast;

import saf.ast.base.BehaviorItem;

public class Strength extends BehaviorItem {
	private String name;
	private int value;
	private static final String[] availableStrengths = { "punchReach", "kickReach", "kickPower", "punchPower" };
	
	public Strength(){
		this.name = "";
		this.value = 5;
	}
	
	public Strength(String n){
		this.name = n;
		this.value = 5;
	}
	
	public Strength(String n, int v){
		this.name = n;
		this.value = v;
	}
	
	public String getName(){ return this.name; }
	public int getValue(){ return this.value; }
	
	public String[] getKeywords() { return availableStrengths; }
	
	@Override
	public String toString(){
		return "\n\t\tName: " + name + "\n\t\tValue: " + value;
	}
}
