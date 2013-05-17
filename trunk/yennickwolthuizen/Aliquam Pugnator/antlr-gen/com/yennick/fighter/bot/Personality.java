package com.yennick.fighter.bot;


import java.util.ArrayList;

import com.yennick.fighter.bot.Constants;

@SuppressWarnings("serial")
public class Personality extends ArrayList<Personality> {

	private final String characteristic;
	private final int value;
	
	public Personality(String characteristic, int value){
		
		this.characteristic = characteristic;
		this.value = value;
	}

	public boolean add(Personality personality){
		if(this.validate(personality)){
			super.add(personality);
	//		System.out.println("valid "+ personality.characteristic);
			return true;
		}
	//	System.out.println("not valid "+ personality.characteristic);
		return false;
	}
	
	public int getValue() {
		return value;
	}

	public String getCharacteristic() {
		return characteristic;
	}

	public String toString(){
		return this.characteristic.toString() + " = " + value ;
	}
	
	public boolean validate(Personality personality){
		if(Constants.getCharacteristics().contains(personality.getCharacteristic())){
			return true;
		}
		return false;
	}
	
}