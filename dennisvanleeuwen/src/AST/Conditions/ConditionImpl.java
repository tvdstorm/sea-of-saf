package AST.Conditions;

import AST.ICondition;

public class ConditionImpl implements ICondition{
	private String condition;
	public ConditionImpl(String con){
		this.condition = con;
	}
	
	@Override
	public Boolean isConditionValid() {
		return false;
	}
	
	@Override
	public String toString(){
		return this.condition + "\n";
	}
}