package com.yennick.fighter.bot;

public class Condition {
	private final String first;
	private final String second;
	private final String type;
	
	public Condition(String first,String second,String type){
		this.first = first;
		this.second = second;
		this.type = type;
	}
	
	public Condition(){
		this.first = "";
		this.second = null;
		this.type = null;
	}
	
	public Condition(String first){
		this.first = first;
		this.second = null;
		this.type = null;
	}

	public String getFirst(){
		return first;
	}
	
	public String toString(){
		return (type != null)? first + " "+ type +" " + second  : first ;		
	}

}
