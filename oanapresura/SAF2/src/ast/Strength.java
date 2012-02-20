package ast;

public class Strength {
	public String name;
	public int value;
	
	public Strength(){
		this.name = new String();
		this.value = 5;
	}
	
	public Strength(String name, int value){
		this.name = name;
		this.value = value;
	}
	public void setStrengthName(String name){
		this.name = name;
	}
	
	public void setStrengthValue(int val){
		this.value = val;
	}
	
	public String getStrengthName(){
		return this.name;
	}
	
	public int getStrengthValue(){
		return this.value;
	}
}
