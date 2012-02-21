package saf.ast;

import saf.ast.base.Identifier;

public class Attack  extends Identifier{
	private String name;
	
	public Attack(){
		this.name = "";
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
			saf.ast.identifiers.Attacks.valueOf(name.toUpperCase());
		} catch(Exception e) {
			return false;
		}
		return true;
	}
}