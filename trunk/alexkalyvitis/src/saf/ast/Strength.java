package saf.ast;

public class Strength extends SafObject {
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
	
	public String getName(){ return this.name; }
	public int getValue(){ return this.value; }
}
