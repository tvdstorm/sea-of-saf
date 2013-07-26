package com.yennick.fighter.bot;

import java.lang.String;
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

}
