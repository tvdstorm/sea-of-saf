package ast;

import constants.CorrectValues;

public class Condition implements CorrectValues{

	private String type;
	
	public Condition(){
		this.type = new String();
	}
	public void setCondition(String type){
		this.type = type;
	}
	
	public String getCondition(){
		return this.type;
	}
	public boolean isValid(){
		return CorrectValues.conditions.contains(this.type);
	}
}
