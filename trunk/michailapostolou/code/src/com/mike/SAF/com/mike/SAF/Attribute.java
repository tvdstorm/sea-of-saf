package com.mike.SAF;

public class Attribute {
	private String name;
	private int value;
	
	
	public Attribute(String name, int value){
		System.out.println("Attribute "+name+" has value = "+value);
		this.name = name;
		this.value = value;
	}
//GETTERS	
	public String getName() {
		return name;
	}
	
	public int getValue() {
		return value;
	}
//END OF GETTERS
	
	public void setValue(int value) {
		this.value = value;
	}
}
