package ast;

import java.util.ArrayList;
import java.util.List;

public class Personality {
	
	private List<Strength> strengths;
	
	public Personality(){
		this.strengths = new ArrayList<Strength>();
	}
	
	public void addStrength(Strength s){
		this.strengths.add(s);
	}
	
	public void addStrength(String name, int value){
		Strength s = new Strength(name,value);
		this.strengths.add(s);
	}
	public List<Strength> getStrengths(){
		return this.strengths;
	}
	
	public int getStrengthValue(String name){
		for (int i=0; i < this.strengths.size(); i++)
			if (strengths.get(i).getStrengthName().equals(name))
				return strengths.get(i).getStrengthValue();
		return 0;
	}
}
