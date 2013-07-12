package com.yennick.fighter.bot;

import java.lang.String;
import java.util.Random;

public class Action {
	private final String[] actions = new String[2];
	private final Boolean choose;
	
	public Action(String action1,String action2,boolean choose){
		this.actions[0] = action1;
		this.actions[1] = action2;
		this.choose = choose;
	}
	
	public Action(String action1){
		this.actions[0] = action1;
	//	this.action2 = null;
		this.choose = false;
	}
	
	public Action getAction(){
		
		return this;
	}
	
	public String getActionString(){
		if(choose){
			Random rand = new Random();
			
			return actions[rand.nextInt(1)];
		} 
		
		return actions[0];
	}
	
	public String toString(){
		return (choose)? "choose" +	": " +actions[0] + " , "+ actions[1]  : actions[0] ;		
	}

}
