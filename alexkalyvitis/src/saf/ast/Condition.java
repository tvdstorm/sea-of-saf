package saf.ast;

public class Condition {
	private String name;
	
	public Condition(){
		this.name = "";
	}
	
	public Condition(String n){
		this.name = n;
	}
	
	public String getName(){ return this.name; }
}
