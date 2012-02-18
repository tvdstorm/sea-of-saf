package saf.structure;

public abstract class LogicalClause extends Logical {
	protected Logical leftHandSide = null;
	protected Logical rightHandSide = null;
	
	public Logical getLeftHandSide() {
		return leftHandSide;
	}
	public Logical getRightHandSide() {
		return rightHandSide;
	}
}
