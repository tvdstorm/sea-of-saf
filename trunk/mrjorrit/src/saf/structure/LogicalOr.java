package saf.structure;

public class LogicalOr extends LogicalClause {
	public LogicalOr(Logical leftHandSide, Logical rightHandSide) {
		this.leftHandSide = leftHandSide;
		this.rightHandSide = rightHandSide;
	}
}
