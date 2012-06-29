package model;

import util.Visitor;

public class Behaviour extends ASTNode{
	private final Condition condition;
	private final Action action1;
	private final Action action2;

	public Behaviour(Condition condition, Action action1, Action action2) {
		this.condition = condition;
		this.action1 = action1;
		this.action2 = action2;
	}
	public Condition getCondition() {
		return condition;
	}
	public Action getFightAction() {
		return this.action2;
	}
	public Action getMoveAction() {
		return this.action1;
	}
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
