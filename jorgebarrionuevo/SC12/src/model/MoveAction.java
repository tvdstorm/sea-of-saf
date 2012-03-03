package model;

import util.Visitor;

public class MoveAction extends Action{

	private String moveActionName;

	public MoveAction() {
		moveActionName = "";
	}
	
	public MoveAction(String moveaActionName) {
		this.moveActionName = moveaActionName;
	}
	
	public String getName() {
		return moveActionName;
	}
	
	public void setName(String moveaActionName) {
		this.moveActionName = moveaActionName;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
}
