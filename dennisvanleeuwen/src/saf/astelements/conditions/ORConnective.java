package saf.astelements.conditions;

import saf.ISAFNodeVisitor;
import saf.astelements.ICondition;

public class ORConnective extends ConnectiveComposite{
	public ORConnective(ICondition lhsCondition, ICondition rhsCondition){
		super(lhsCondition, rhsCondition);
	}
	
	@Override
	public void accept(ISAFNodeVisitor visitor){
		visitor.visit(this);
	}

	@Override
	public String getNodeName() {
		return "or";
	}
}