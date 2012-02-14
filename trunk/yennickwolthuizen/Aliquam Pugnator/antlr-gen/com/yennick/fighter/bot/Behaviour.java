package com.yennick.fighter.bot;

import java.util.ArrayList;
import java.util.List;

public class Behaviour {
//	private Condition condition;
	private final List<Condition> condition;
//	private Action action;
	
	public Behaviour(){
		this.condition = new ArrayList<Condition>();
	}
	
	public void addCondition(Condition condition) {
		this.condition.add(condition);
	}
	
	public String toString(){
		return condition + "\n";
	}
	
}
