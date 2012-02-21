package saf.ast;

import saf.ast.base.Identifier;

public class Move extends Identifier {
	private String name;
	
	public Move(){
		this.name = "";
	}
	
	public Move(String n){
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
			saf.ast.identifiers.Moves.valueOf(name.toUpperCase());
		} catch(Exception e) {
			return false;
		}
		return true;
	}
}
