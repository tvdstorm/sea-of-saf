package com.yennick.SAF.Bot;

import java.util.ArrayList;
import java.util.List;


public class Bot{
	private String fighterName;
	private List<Personality> personality;
	
	public Bot(String fighterName){
			this.personality = new ArrayList<Personality>();
			this.setFighterName(fighterName);
	}
	
	public String getFighterName() {
		return fighterName;
	}

	public void setFighterName(String fighterName) {
		this.fighterName = fighterName;
	}	
	
	public void addPersonality(Personality personality){
		this.personality.add(personality);
	}
	
	public String toString(){
		return fighterName;
		
	}
	
}