package saf;

import test.SafVisitor;

public class Condition extends Type {
	public Condition(String m) {
		super(m);
	}
	
	@Override
	public void accept(SafVisitor visitor) {
		visitor.visit(this);
	}
}