package saf.objects;

public class Move {
	private String name;
	
	public Move(){
		this.name = "";
	}
	
	public Move(String n){
		this.name = n;
	}
	
	public String GetName(){ return this.name; }
}
