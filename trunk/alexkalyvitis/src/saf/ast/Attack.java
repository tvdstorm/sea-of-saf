package saf.ast;

import saf.ast.base.Identifier;
import saf.ast.identifiers.Attacks;

public class Attack extends Identifier{
	private String name;
	
	public Attack(){
		this("");
	}
	public Attack(Attacks a){
		this(a.toString());
	}
	public Attack(String n){
		this.name = n;
	}
	public String getName(){ 
		return this.name; 
	}
	public String toString(){ 
		return this.getName(); 
	}
	public boolean isValid() {
		try {
			Attacks.valueOf(name.toUpperCase());
		} catch(Exception e) {
			return false;
		}
		return true;
	}
}