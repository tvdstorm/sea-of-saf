package saf;

import test.SafVisitor;

public class ConditionAction extends Condition {
	private final String condition;

	public ConditionAction(String condition) {
		this.condition = condition;
	} 
	
	public String getCondition() {
		return condition;
	}
	
	@Override
	public void accept(SafVisitor visitor) {
		visitor.visit(this);
	}
}