package ast.conditions;

import saf.ISAFElementVisitor;
import ast.IConditionElement;
/* TODO: Nog een andere super class maken die 2 condities bevat. */ 
public class ORConditionElement implements IConditionElement{
	private IConditionElement condition1,
	   				   	      condition2;
	
	public ORConditionElement(IConditionElement con1, IConditionElement con2){
		this.condition1 = con1;
		this.condition2 = con2;
	}
	
	public IConditionElement getFirstCondition() {
		return this.condition1;
	}

	public void setFirstCondition(IConditionElement condition) {
		this.condition1 = condition;
	}

	public IConditionElement getSecondCondition() {
		return this.condition2;
	}

	public void setSecondCondition(IConditionElement condition) {
		this.condition2 = condition;
	}

	
//	@Override
//	public Boolean isConditionValid() {
//		return this.condition1.isConditionValid() || this.condition2.isConditionValid();
//	}
	
	@Override
	public void accept(ISAFElementVisitor visitor){
		visitor.visit(this);
		condition1.accept(visitor);
		condition2.accept(visitor);	
	}
}