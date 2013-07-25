package com.yennick.fighter.bot;
 
public class Behaviour {
	private final Condition condition; 
	private final Action fightAction;
	private final Action moveAction;
	
	public Behaviour(Condition condition,Action moveAction, Action fightAction){
		this.condition = condition;
		this.moveAction = moveAction;
		this.fightAction = fightAction;
	}
	
	public Condition getCondition() {
		return condition;
	}
	
	public Action getMoveAction(){
		System.out.println(moveAction);
		return moveAction;
	}
	
	public Action getAction(){
		return fightAction;
	}
	
	public String toString(){
		String toString = condition.toString() + " : " + moveAction.toString() + " : " +  fightAction.toString();
		return  toString ;
	}
}