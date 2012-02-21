package data;

import core.BaseTreeVisitor;

public class Rule extends BaseData {

	private final Condition condition;
	private final Actions actions;
	
	public Rule(Condition condition, Actions action) {
		this.condition = condition;
		this.actions = action;
	}
	
	public Condition getCondition() {
		return condition;
	}
	
	public Actions getAction() {
		return actions;
	}

	@Override
	public void acceptTreeVisitor(BaseTreeVisitor treeVisitor) {
		treeVisitor.visitRule(this);
		condition.acceptTreeVisitor(treeVisitor);
		actions.acceptTreeVisitor(treeVisitor);
	}
	
}
