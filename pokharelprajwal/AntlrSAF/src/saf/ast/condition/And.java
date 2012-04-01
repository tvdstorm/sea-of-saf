package saf.ast.condition;

import saf.ast.INodeVisitor;

public class And extends Binary {

	public And(Condition lhs, Condition rhs){
		super(lhs,rhs);
	}

	@Override
	public void accept(INodeVisitor v) {
		v.visit(this);
		
	}
	
}
