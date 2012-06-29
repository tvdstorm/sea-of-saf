package model;

import util.Visitor;

public class And extends ConditionLogic{
	public And(Condition leftSide, Condition rightSide) {
		super(leftSide, rightSide);
	}
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
