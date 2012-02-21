package saf;

import test.SafVisitor;

public class ConditionConnective extends Condition {
	private Condition lhs;
	private Condition rhs;
	
	public ConditionConnective(Condition lhs, Condition rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}
	
	public Condition getLhs() {
		return this.lhs;
	}
	
	public Condition getRhs() {
		return this.rhs;
	}

	@Override
	public void accept(SafVisitor visitor) {
		if (lhs instanceof ConditionAction)
			visitor.visit((ConditionAction) lhs);
		
		if (rhs instanceof ConditionAction)
			visitor.visit((ConditionAction) rhs);
	}
}
