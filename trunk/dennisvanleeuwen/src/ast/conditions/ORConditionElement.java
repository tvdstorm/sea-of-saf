package ast.conditions;

import saf.ISAFElementVisitor;
import ast.IConditionElement;

public class ORConditionElement implements IConditionElement{
	private IConditionElement condition1,
	   				   	      condition2;
	
	public ORConditionElement(IConditionElement con1, IConditionElement con2){
		this.condition1 = con1;
		this.condition2 = con2;
	}
	
//	@Override
//	public Boolean isConditionValid() {
//		return this.condition1.isConditionValid() || this.condition2.isConditionValid();
//	}
	
	@Override
	public void accept(ISAFElementVisitor visitor) throws Exception {
		condition1.accept(visitor);
		condition2.accept(visitor);
		visitor.visit(this);		
	}
}