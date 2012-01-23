package saf.ast;

public class Move {
	private String name;
	
	public Move(){
		this.name = "";
	}
	
	public Move(String n){
		this.name = n;
	}
	
	public String getName(){ return this.name; }
}
