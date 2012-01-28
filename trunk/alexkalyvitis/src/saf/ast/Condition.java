package saf.ast;

public class Condition extends SafObject{
	private String name;
	
	public void setName(String n){ this.name = n; }
	
	public String getName(){ return this.name; }
	public String getCondition() {
		return "\n\t\tCondition: " + name; 
	}
}
