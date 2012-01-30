package com.yennick.figher.bot;

import java.util.ArrayList;
import java.util.List;


public class Bot{
	private final String fighterName;
	private final List<Personality> personality;
	private final List<Behaviour> behaviour;
	
	public Bot(String fighterName){
			this.fighterName = new String(fighterName);
			this.behaviour = new ArrayList<Behaviour>();
			this.personality = new ArrayList<Personality>();
			///this.fighterName = fighterName;
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
	
//	private String getAllPersonalities 
	public String toString(){
		return fighterName + "\n" +
				this.personality.toString()  + "\n" +
				this.behaviour.toString()
				;
		
		
	}
	
}