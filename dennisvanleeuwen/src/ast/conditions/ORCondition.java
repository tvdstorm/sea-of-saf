package ast.conditions;

import ast.ICondition;

public class ORCondition implements ICondition{
	private ICondition condition1,
	   				   condition2;
	
	public ORCondition(ICondition con1, ICondition con2){
		this.condition1 = con1;
		this.condition2 = con2;
	}
	
	@Override
	public Boolean isConditionValid() {
		return this.condition1.isConditionValid() || this.condition2.isConditionValid();
	}
	
	@Override
	public String toString(){
		return this.condition1 + " || " + this.condition2;
	}
}