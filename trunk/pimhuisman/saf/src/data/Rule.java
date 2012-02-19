package data;

import core.BaseTreeVisitor;

public class Rule extends BaseData {

	private Condition condition;
	private Actions action;
	
	public Rule(Condition condition, Actions action) {
		this.condition = condition;
		this.action = action;
	}
	
	public Condition getCondition() {
		return condition;
	}
	
	public Actions getAction() {
		return action;
	}

	@Override
	public void acceptTreeVisitor(BaseTreeVisitor treePrinter) {
		treePrinter.visit(this);
		condition.acceptTreeVisitor(treePrinter);
		//action.acc
		//treePrinter.visit(action);
	}
	
}
