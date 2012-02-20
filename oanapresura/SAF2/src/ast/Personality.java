package ast;

import java.util.ArrayList;

public class Personality {
	
	public ArrayList<Strength> strengths;
	
	public Personality(){
		this.strengths = new ArrayList<Strength>();
	}
	
	public void addStrength(Strength s){
		this.strengths.add(s);
	}
	
	public ArrayList<Strength> getStrengths(){
		return this.strengths;
	}
	
}
