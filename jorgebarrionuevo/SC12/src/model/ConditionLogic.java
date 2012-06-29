package model;

public abstract class ConditionLogic extends Condition{
	private final Condition leftSide;
	private final Condition rightSide;

	public ConditionLogic(Condition leftSide, Condition rightSide) {
		this.leftSide = leftSide;
		this.rightSide = rightSide;
		this.conditionName = "CONNECTIVE";
	}
	public Condition getLeftSide() {
		return leftSide;
	}
	public Condition getRightSide() {
		return rightSide;
	}
}

