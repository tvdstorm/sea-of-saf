package saf.ast;

public class Condition extends SafObject{
	private String name;
	
	public Condition(){
		this.name = "";
	}
	
	public Condition(String n){
		this.name = n;
	}
	
	public String getName(){ return this.name; }
}
