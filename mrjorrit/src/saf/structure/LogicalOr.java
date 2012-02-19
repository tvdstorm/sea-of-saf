package saf.structure;

public class LogicalOr extends LogicalClause {
	public LogicalOr(Logical leftHandSide, Logical rightHandSide) {
		super(leftHandSide, rightHandSide);
	}

	@Override
	public boolean computeClause(boolean left, boolean right) {
		return left || right;
	}
}
