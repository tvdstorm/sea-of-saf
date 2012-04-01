package saf.ast.condition;

import saf.ast.INodeVisitor;

public class Or extends Binary{

	public Or(Condition lhs, Condition rhs) {
		super(lhs, rhs);
	}

	@Override
	public void accept(INodeVisitor v) {
		v.visit(this);
		
	}

}
