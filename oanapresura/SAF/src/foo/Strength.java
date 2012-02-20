package foo;

public class Strength {
	String name;
	int value;
	
	public Strength(){
		this.name = new String();
		this.value = 5;
	}
	
	public Strength(String name, int value){
		this.name = name;
		this.value = value;
	}
	void setStrengthName(String name){
		this.name = name;
	}
	
	void setStrengthValue(int val){
		this.value = val;
	}
	
	String getStrengthName(){
		return this.name;
	}
	
	int getStrengthValue(){
		return this.value;
	}
}
