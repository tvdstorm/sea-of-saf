package com.yennick.fighter.bot;

import java.util.List;

public class ConcreteCondition extends Condition {
	
	private final String condition;

	public ConcreteCondition(String condition){
		this.condition = condition;
	}
	
	public String getCondition(){
		return condition;
	}
	
	public boolean hasCondition(List<String> cond){
		return cond.contains(getCondition());
	}

	public String toString(){
		return getCondition() ;		
	}

}