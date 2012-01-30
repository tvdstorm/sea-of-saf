package com.yennick.fighter.bot;

public class Behaviour {
	private String condition;
//	private Action action;
	
	public Behaviour(String condition){
		this.setCondition(condition);
	}
	
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	
	public String toString(){
		return condition + "\n";
	}
	
}
