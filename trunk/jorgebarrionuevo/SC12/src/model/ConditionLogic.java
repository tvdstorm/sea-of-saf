package model;

public abstract class ConditionLogic extends Condition{

	private final Condition leftSide;
	private final Condition rightSide;
	
	public ConditionLogic(Condition leftSide, Condition rightSide) {
		this.leftSide = leftSide;
		this.rightSide = rightSide;
		this.conditionName = "CONNECTIVE";
	}
}

