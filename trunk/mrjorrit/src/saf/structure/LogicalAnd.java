package saf.structure;

public class LogicalAnd extends LogicalClause {
	public LogicalAnd(Logical leftHandSide, Logical rightHandSide) {
		super(leftHandSide, rightHandSide);
	}

	@Override
	public boolean computeClause(boolean left, boolean right) {
		return left && right;
	}
}
