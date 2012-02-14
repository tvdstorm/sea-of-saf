package saf.astelements.conditions;

import saf.ISAFNodeVisitor;
import saf.astelements.ICondition;

public class ORConditionComposite extends ConnectiveConditionComposite{
	public ORConditionComposite(ICondition lhsCondition, ICondition rhsCondition){
		super(lhsCondition, rhsCondition);
	}
	
	@Override
	public void accept(ISAFNodeVisitor visitor){
		visitor.visit(this);
	}

	@Override
	public Boolean isConditionNodeActive(ICondition con) {
		return this.getLhsCondition().isConditionNodeActive(con) || 
			   this.getRhsCondition().isConditionNodeActive(con);
	}

	@Override
	public String getNodeName() {
		return "or";
	}
}