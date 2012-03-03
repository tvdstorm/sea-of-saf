package model;

import util.Visitor;

public class ConditionType extends Condition{

	private final String conditionTypeName;

	public ConditionType(String conditionTypeName) {
		this.conditionTypeName = conditionTypeName;
	}
	
	public String getName() {
		return conditionTypeName;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
