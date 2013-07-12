package com.yennick.fighter.bot;

public class Condition {
	
	//distance and/or strength
	private final String[] conditions = new String[2];
	//private final String second;
	
	// and/or
	private final String type;
	
	public Condition(String first,String second,String type){
		this.conditions[0] = first;
		this.conditions[1] = second;
		this.type = type;
	}

	public Condition(String first){
		this.conditions[0] = first;
		this.type = null;
	}

	public String[] getConditions(){
		
		return conditions;
	}
	
	
	public boolean hasCondition(String cond){
		return ((conditions[0] != null && conditions[0].equalsIgnoreCase(cond)) || (conditions[1] != null && conditions[1].equalsIgnoreCase(cond)));
	}
	
	public String toString(){
		return (type != null)? conditions[0] + " "+ type +" " + conditions[1]  : conditions[0] ;		
	}

}
