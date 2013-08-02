package com.yennick.fighter.bot;


import java.util.ArrayList;
import java.util.List;

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
		if(validateChar(personality)){
			super.add(personality);
			return true;
		}
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
	
	private boolean validateChar(Personality personality){
		if(Constants.getCharacteristics().contains(personality.getCharacteristic())){
			return true;
		}
		return false;
	}
	
	private boolean validateValue(){
		return (Constants.getMax() >= getValue() && getValue() >= Constants.getMin());
	}

	public void check(List<String> errors) {
		if(!validateChar(this)){
			errors.add("Element " + this.characteristic + " does not exist");
		}
		if(!validateValue()){
			errors.add("Element " + characteristic + " [" + getValue() + "] requires a value between " + Constants.getMin() + " and " + Constants.getMax());
		}
		
		
	}
	
}