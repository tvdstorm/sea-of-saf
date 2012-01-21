package saf.objects;

public class Condition {
	private String name;
	
	public Condition(){
		this.name = "";
	}
	
	public Condition(String n){
		this.name = n;
	}
	
	public String GetName(){ return this.name; }
}
