package com.yennick.fighter.bot;

import java.util.ArrayList;
import java.util.List;

public class Behaviour {
//	private Condition condition;
	private final List<Condition> condition;
	private final List<Action> action;
//	private Action action;
	
	public Behaviour(){
		this.condition = new ArrayList<Condition>();
		this.action = new ArrayList<Action>();
	}
	
	public void addCondition(Condition condition) {
		this.condition.add(condition);
	}
	
	public void addAction(Action action,Action moveAction) {
		this.action.add(action);
		this.action.add(moveAction);
	}
	
	public String toString(){
		return condition +"["+ action + "]\n";
	}
	
}
