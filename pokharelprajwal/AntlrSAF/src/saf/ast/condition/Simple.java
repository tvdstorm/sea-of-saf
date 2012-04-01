package saf.ast.condition;

import saf.ast.INodeVisitor;

public class Simple extends Condition {

	private final String condition;
	
	public Simple(String condition){
		this.condition = condition;
	}
	
	public String getCondition() {
		return this.condition;
	}
	
	@Override
	public void accept(INodeVisitor v) {
		v.visit(this);
	}

}
