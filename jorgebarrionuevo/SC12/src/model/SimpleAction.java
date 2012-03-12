package model;

public abstract class SimpleAction extends Action{
	
	private String simpleAction;

	public SimpleAction(String actionName) {
		simpleAction = actionName;
	}
	
	public String getNameAction() {
		return simpleAction;
	}
	
}
