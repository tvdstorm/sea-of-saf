package saf.ast.condition;

public abstract class Composit extends Condition {
	
	private final Condition lhs;
	private final Condition rhs;

	protected Composit(Condition lhs, Condition rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}

	public Condition getFirstCondition() {
		return lhs;
	}

	public Condition getSecondCondition() {
		return rhs;
	}
	
}
