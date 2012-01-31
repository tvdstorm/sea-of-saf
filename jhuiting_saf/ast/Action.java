package ast;

import ast.interfaces.IAction;

public class Action implements IAction {
	
	String value;
	
	public Action(String value)
	{
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String toString()
	{
		return this.getValue();
	}

}
