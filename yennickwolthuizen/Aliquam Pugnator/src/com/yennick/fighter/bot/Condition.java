package com.yennick.fighter.bot;

public class Condition {
	
	//distance and/or strength
	private final String condition1;
	private final String condition2;
	
	// and/or
	private final String type;
	
	public Condition(String distance,String strength,String type){
		this.condition1 = distance;
		this.condition2 = strength;
		this.type = type;
	}

	public Condition(String condition){
		this.condition1 = condition;
		this.condition2 = null;
		this.type = null;
	}

	public boolean hasCondition(String cond){
		return ((condition1 != null && condition1.equalsIgnoreCase(cond)) || (condition2 != null && condition2.equalsIgnoreCase(cond)));
	}
	
	public String toString(){
		return (type != null)? condition1 + " "+ type +" " + condition2  : condition1 ;		
	}
}