package data;

import core.BaseTreeVisitor;

public class OrStatement extends BaseData implements Condition {

	private final Condition condition1;
	private final Condition condition2;
	
	public OrStatement(Condition condition1, Condition condition2) {
		this.condition1 = condition1;
		this.condition2 = condition2;
	}
	
	public Condition getCondition1() {
		return condition1;
	}
	
	public Condition getCondition() {
		return condition2;
	}
	
	@Override
	public Boolean evaluateCondition() {
		return condition1.evaluateCondition() || condition2.evaluateCondition();
	}

	@Override
	public void acceptTreeVisitor(BaseTreeVisitor treePrinter) {
		System.out.println("or statement");
		if ( condition1 instanceof BaseData ) {
			((BaseData)condition1).acceptTreeVisitor(treePrinter);
		}
		if ( condition2 instanceof BaseData ) {
			((BaseData)condition2).acceptTreeVisitor(treePrinter);
		}
	}
	
}
