package saf.ast.action;

import java.util.List;

import saf.ast.ASTNode;

public abstract class Action extends ASTNode {
	String action;
	List<String> actions;
	
	public Action(String action) {
		this.action = action;
	}
	
	public Action(List<String> actions) {
		this.actions = actions;
	}

	public String getAction() {
		return action;
	}

	public List<String> getActions() {
		return actions;
	}
	
	
}
