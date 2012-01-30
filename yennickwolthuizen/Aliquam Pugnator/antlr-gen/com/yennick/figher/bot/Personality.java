package com.yennick.figher.bot;

public class Personality {
	private String characteristic;
	private int value;
	
	public Personality(String characteristic, int value){
		setCharacteristic(characteristic);
		setValue(value);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getCharacteristic() {
		return characteristic;
	}

	public void setCharacteristic(String characteristic) {
		this.characteristic = characteristic;
	}
	
	public String toString(){
		return characteristic + " = " + value + "\n";
	}
	
}
