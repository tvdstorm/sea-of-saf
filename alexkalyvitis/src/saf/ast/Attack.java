package saf.ast;

import saf.ast.base.BehaviorItem;

public class Attack  extends BehaviorItem{
	private String name;
	private static final String[] availableAttacks = { "punch_low", "punch_high", "kick_low", "kick_high", "block_low", "block_high" };
	
	public Attack(){
		this.name = "";
	}
	
	public Attack(String n){
		this.name = n;
	}
	
	public String getName(){ return this.name; }
	
	public String[] getKeywords() { return availableAttacks; }
}
