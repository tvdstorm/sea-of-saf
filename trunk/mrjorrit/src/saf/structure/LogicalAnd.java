package saf.structure;

public class LogicalAnd extends LogicalClause {
	public LogicalAnd(Logical leftHandSide, Logical rightHandSide) {
		this.leftHandSide = leftHandSide;
		this.rightHandSide = rightHandSide;
	}
}
