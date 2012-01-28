package saf.ast;

public class Attack  extends SafObject{
	private String name;
	
	public Attack(){
		this.name = "";
	}
	
	public Attack(String n){
		this.name = n;
	}
	
	public String getName(){ return this.name; }
}
