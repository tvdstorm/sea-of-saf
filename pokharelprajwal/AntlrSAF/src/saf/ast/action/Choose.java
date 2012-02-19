package saf.ast.action;

import saf.ast.INodeVisitor;

public class Choose extends Action {

	private final String _actionFirst;
	private final String _actionSecond;
	
	public Choose(String actionFirst, String actionSecond){
		this._actionFirst = actionFirst;
		this._actionSecond = actionSecond;
	}
	
	@Override
	public void accept(INodeVisitor v) {
		v.visit(this);
	}

	@Override
	public String GetTreeString() { 
		return "Choose(" + getActionFirst() + " " + getActionSecond() + ")";
	}
	
	public String getActionFirst() {
		return _actionFirst;
	}

	public String getActionSecond() {
		return _actionSecond;
	}
	
}
