package model;

import util.Visitor;

public class FightAction extends SimpleAction{
	public FightAction(String actionName) {
		super(actionName);
	}
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
