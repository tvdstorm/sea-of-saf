package saf.structure;

public abstract class Action extends Node
{
	protected final String actionTypeString;
	
	public Action(String actionTypeString)
	{
		this.actionTypeString = actionTypeString;
	}
	
	public String getActionTypeString()
	{
		return actionTypeString;
	}
	
}
