package saf.objects;

public class Attack {
	private String name;
	
	public Attack(){
		this.name = "";
	}
	
	public Attack(String n){
		this.name = n;
	}
	
	public String GetName(){ return this.name; }
}
