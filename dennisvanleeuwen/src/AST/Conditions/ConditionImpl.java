package AST.Conditions;

import AST.ICondition;

public class ConditionImpl implements ICondition{
	private String condition;
	public ConditionImpl(String condition){
		this.condition = condition;
	}
	
	@Override
	public Boolean isConditionValid() {
		return false;
	}
	
	@Override
	public String toString(){
		return this.condition;
	}
}