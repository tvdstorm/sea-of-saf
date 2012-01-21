package saf.objects;

public class Strength {
	private String name;
	private int value;
	
	public Strength(){
		this.name = "";
		this.value = 5;
	}
	
	public Strength(String n){
		this.name = n;
		this.value = 5;
	}
	
	public Strength(String n, int v){
		this.name = n;
		this.value = v;
	}
	
	public String GetName(){ return this.name; }
	public int GetValue(){ return this.value; }
}
