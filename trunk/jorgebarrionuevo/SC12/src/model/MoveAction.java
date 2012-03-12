package model;

import util.Visitor;

public class MoveAction extends SimpleAction{
	
	public MoveAction(String actionName) {
		super(actionName);
	}
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
