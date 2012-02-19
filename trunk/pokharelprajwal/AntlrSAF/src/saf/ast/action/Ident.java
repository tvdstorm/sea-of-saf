package saf.ast.action;

import saf.ast.INodeVisitor;

public class Ident extends Action {

	private final String _name;

	public Ident(String name){
		this._name = name;
	}
	
	@Override
	public void accept(INodeVisitor v) {
		v.visit(this);
	}

	@Override
	public String GetTreeString() {
		return getName();
	}

	public String getName() {
		return _name;
	}

}
