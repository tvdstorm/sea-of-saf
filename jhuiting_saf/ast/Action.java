package ast;

public class Action {
	String actionType;
	String value;
	
	public Action(String actionType, String value)
	{
		this.actionType = actionType;
		this.value = value;
	}
	
	public String getActionType() {
		return actionType;
	}

	public String getValue() {
		return value;
	}
	
	public String toString()
	{
		return "Action: " + this.actionType;
	}

}
