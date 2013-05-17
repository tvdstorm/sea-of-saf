package com.yennick.fighter.bot;

import java.lang.String;

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
	
	public String toString(){
		return (choose)? "choose" +	": " +action1 + " , "+ action2  : action1 ;		
	}

}
