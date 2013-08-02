package com.yennick.fighter.bot;

import java.util.List;

 
public class Behaviour{
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
		return moveAction;
	}
	
	public Action getAction(){
		return fightAction;
	}
	
	public String getActionString(){
		return getAction().getActionString();
	}
	
	public String getMoveActionString(){
		return getMoveAction().getActionString();
	}
	
	public void check(List<String> errors){
		checkCondition(errors);
		checkMoveAction(errors);
		checkFightAction(errors);
	}
	
	private void checkMoveAction(List<String> errors) {
		moveAction.check(errors,Constants.getMoveActions());
	}
	
	private void checkFightAction(List<String> errors) {
		fightAction.check(errors,Constants.getFightActions());
	}

	private void checkCondition(List<String> errors) {
		condition.check(errors);
	}

	public String toString(){
		String toString = condition.toString() + " : " + moveAction.toString() + " : " +  fightAction.toString();
		return  toString ;
	}
}