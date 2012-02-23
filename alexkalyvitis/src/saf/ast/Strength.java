package saf.ast;

import saf.ast.base.Identifier;
import saf.ast.identifiers.Strengths;

public class Strength extends Identifier {
	private String name;
	private int value;
	
	public Strength(){
		this("");
	}
	
	public Strength(String n){
		this(n,5);
	}
	public Strength(String n, int v){
		this.name = n;
		this.value = v;
	}
	
	public Strengths getStrength(){
		return Strengths.valueOf(this.name.toUpperCase());
	}
	public String getName() { 
		return this.name; 
	}
	public int getValue() { 
		return this.value; 
	}
	
	public boolean isValid() {
		try {
			saf.ast.identifiers.Strengths.valueOf(name.toUpperCase());
		} catch(Exception e) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString(){
		return "\n\t\tName: " + name + "\n\t\tValue: " + value;
	}
}
