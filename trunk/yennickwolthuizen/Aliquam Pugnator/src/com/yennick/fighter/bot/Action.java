package com.yennick.fighter.bot;

import java.lang.String;
import java.util.List;
import java.util.Random;

public class Action {
	private final String action1;
	private final String action2;
	private final Boolean choose;
	
	public Action(String action1,String action2,boolean choose){
		this.action1 = action1;
		this.action2 = action2;
		this.choose = choose;
	}
	
	public Action(String action1){
		this.action1 = action1;
		this.action2 = null;
		this.choose = false;
	}
	
	public Action getAction(){
		return this;
	}
	
	public String getActionString(){
		String action = action1;
		if(choose){
			Random rand = new Random();
			action = (rand.nextBoolean())? action1 : action2;
		} 
		
		return action;
	}
	
	public String toString(){
		return (choose)? "choose" +	": " +action1 + " , "+ action2  : action1 ;		
	}

	public void check(List<String> errors, List<String> actions) {
		checkAction(errors, actions, action1);
		checkAction(errors, actions, action2);
	}
	
	private void checkAction(List<String> errors, List<String> actions, String action){
		if(!actions.contains(action) && action != null){
			errors.add("Action " + action + " does not exist" );
		}
	}

}
