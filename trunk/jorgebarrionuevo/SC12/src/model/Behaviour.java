package model;

import util.Visitor;

public class Behaviour extends ASTNode{
	private final Condition conditionType;
	private final Action moveActionType;
	private final Action fightActionType;

	public Behaviour(Condition conditionType, Action moveActionType, Action fightActionType) {
		this.conditionType = conditionType;
		this.moveActionType = moveActionType;
		this.fightActionType = fightActionType;
	}
	
	public void addTofightActionTypeer(Fighter fightActionTypeer) {
		fightActionTypeer.addBehavior(this);
	}
	
	public Action getfightActionType() {
		return fightActionType;
	}
	
	public Condition getconditionType() {
		return conditionType;
	}
	
	public Action getmoveActionType() {
		return moveActionType;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
