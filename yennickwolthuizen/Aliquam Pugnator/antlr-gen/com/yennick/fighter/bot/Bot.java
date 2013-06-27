package com.yennick.fighter.bot;

import java.awt.Color;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Bot{
	private final String fighterName;
	private final List<Personality> personality;
	private final List<Behaviour> behaviour;
	
	public Bot(String fighterName){
			this.fighterName = fighterName;
			this.behaviour = new ArrayList<Behaviour>();
			this.personality = new ArrayList<Personality>();
	}
	
	public String getFighterName() {
		return fighterName;
	}
	
	public void addPersonality(Personality personality){
		this.personality.add(personality);
	}

	public void addBehaviour(Behaviour behaviour){
		this.behaviour.add(behaviour);
	}
	
	private int getPersonality(String getP) {
		for(Personality pers: this.personality){
			if(pers.getCharacteristic().equals(getP))
				return pers.getValue();
		}
		return Constants.getDefaultValue();
	}

	private double getWeight(){
		return (this.getPersonality("punchPower")+this.getPersonality("kickPower")) /2;
	}
	
	public int getHeight(){
		return (this.getPersonality("punchReach")+this.getPersonality("kickReach")) /2;
	}
	
	public double getSpeed(){
		return 0.5*(getHeight() - getWeight()) ;
	}
	
	public Color getColor(){
		List<String> colorList = Constants.getColors();
		Color color;

		try {
		    Field field = Class.forName("java.awt.Color").getField(colorList.get(this.getPersonality("color")));
		    color = (Color)field.get(null);
		} catch (Exception e) {
		    color = null; // Not defined
		}
		
		return color;
	}

	
	public String toString(){
		return "Name: " +fighterName + "\n";
	}

}