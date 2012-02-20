package ast;

public class Condition {

	public String type;
	public Condition(){
		this.type = new String();
	}
	public void setCondition(String type){
		this.type = type;
	}
	
	public String getCondition(){
		return this.type;
	}
	
}
