package foo;

import java.util.ArrayList;

public class Personality {
	
	ArrayList<Strength> strengths;
	
	public Personality(){
		this.strengths = new ArrayList<Strength>();
	}
	
	void addStrength(Strength s){
		this.strengths.add(s);
	}
	
}
