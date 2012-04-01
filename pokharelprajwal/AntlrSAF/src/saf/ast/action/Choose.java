package saf.ast.action;

import java.util.ArrayList;
import java.util.List;

import saf.ast.INodeVisitor;

public class Choose extends Action {

	private List<String> actions = new ArrayList<String>();
	
	public Choose(String actionFirst, String actionSecond){
		this.actions.add(actionFirst);
		this.actions.add(actionSecond);
	}
	
	@Override
	public void accept(INodeVisitor v) {
		v.visit(this);
	}

	public List<String> getActions() {
		return this.actions;
	}
		
}
