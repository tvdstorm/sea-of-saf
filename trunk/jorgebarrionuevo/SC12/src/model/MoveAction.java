package model;

import util.Visitor;

public class MoveAction extends Action{

	private final String moveActionName;

	public MoveAction(String moveaActionName) {
		this.moveActionName = moveaActionName;
	}
	
	public String getName() {
		return moveActionName;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
}
