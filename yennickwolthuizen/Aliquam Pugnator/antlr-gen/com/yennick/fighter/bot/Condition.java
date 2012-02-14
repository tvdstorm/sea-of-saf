package com.yennick.fighter.bot;

public class Condition {
	private final String condition;
	
	public Condition(String condition){
		this.condition = condition;
	}
	
	public String getCondition(){
		return condition;
	}
	
	public String toString(){
		return condition + "\n";		
	}

}
