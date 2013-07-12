package com.yennick.fighter.bot;
 
public class Behaviour {
	private Condition condition; 
	private Action action;
	private Action moveAction;
	
	public Behaviour(){
	}
	
	public void addCondition(Condition condition) {
		this.condition = condition;
	}
	
	public void addAction(Action moveAction,Action action) {
		this.moveAction = moveAction;
		this.action = action;
	}
	
	public Condition getCondition() {
		return condition;
	}
	
	public Action getMoveAction(){
		System.out.println(moveAction);
		return moveAction;
	}
	
	public Action getAction(){
		return action;
	}
	
	public String toString(){
		String toString = condition.toString() + " : " + moveAction.toString() + " : " +  action.toString();
		return  toString ;
	}
}