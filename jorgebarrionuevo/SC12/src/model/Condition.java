package model;

public abstract class Condition extends ASTNode{	
	protected boolean isAlways=false;
	protected String conditionName;
	
	public boolean getAlways(){
		return this.isAlways;
	}
	public String getName() {
		return conditionName;
	}
}