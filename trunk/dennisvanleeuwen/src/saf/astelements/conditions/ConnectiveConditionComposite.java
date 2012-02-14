package saf.astelements.conditions;

import saf.astelements.ICondition;

public abstract class ConnectiveConditionComposite implements ICondition{
	private ICondition lhsCondition;
	private ICondition rhsCondition;
	
	public ConnectiveConditionComposite(ICondition lhsCondition, ICondition rhsCondition){
		this.lhsCondition = lhsCondition;
		this.rhsCondition = rhsCondition;
	}

	public ICondition getLhsCondition() {
		return lhsCondition;
	}

	public ICondition getRhsCondition() {
		return rhsCondition;
	}
}