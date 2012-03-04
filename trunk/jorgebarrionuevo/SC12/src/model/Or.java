package model;

import util.Visitor;

public class Or extends Logic{
	public Or(Condition leftSide, Condition rightSide) {
		super(leftSide, rightSide);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}