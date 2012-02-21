package com.mike.SAF;

public class Attribute {
	private String name;
	private int value;
	
	
	public Attribute(String name, int value){
		this.name = name;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
}
