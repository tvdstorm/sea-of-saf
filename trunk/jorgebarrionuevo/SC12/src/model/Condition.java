package model;

public abstract class Condition extends ASTNode{	
	protected boolean isAlways=false;
	
	public boolean getAlways(){
		return this.isAlways;
	}
}