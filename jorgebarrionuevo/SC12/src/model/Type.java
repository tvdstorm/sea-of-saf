package model;

import util.Visitor;

public class Type extends Condition{
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
