package model;

import util.Visitor;

public class ConditionType extends Condition{

	public ConditionType(String conditionTypeName) {
		this.conditionName = conditionTypeName;
		setAlways();
	}
	
	private void setAlways(){
		if (this.conditionName.equals("always")){
			this.isAlways=true;
		}
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
