package nl.uva.saf.fdl.ast;

public abstract class Action extends TreeNode {
	private String actionType;
	
	public Action(String actionType) {
		this.setActionType(actionType);
	}

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}
}
