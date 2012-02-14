package com.yennick.fighter.bot;

public class Personality {
	private final String characteristic;
	private final int value;
	
	public Personality(String characteristic, int value){
		this.characteristic = characteristic;
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public String getCharacteristic() {
		return characteristic;
	}

	public String toString(){
		return characteristic + " = " + value + "\n";
	}
	
}
