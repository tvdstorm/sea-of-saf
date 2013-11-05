package saf.ast.condition;

import saf.ast.util.Visitor;

public class And extends Connective {

	public And(Condition lhs, Condition rhs) {
		super(lhs, rhs);
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	@Override
	public boolean needBracket(And and) {
		if (and.getRhs() == this)
			return true;
		
		return false;
	}

}
