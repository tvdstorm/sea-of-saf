package saf.astelements.conditions;

import java.util.List;

import saf.ISAFNodeVisitor;
import saf.astelements.ICondition;

public class ANDConnective extends ConnectiveComposite{
	public ANDConnective(ICondition lhsCondition, ICondition rhsCondition){
		super(lhsCondition, rhsCondition);
	}

	@Override
	public void accept(ISAFNodeVisitor visitor){
		visitor.visit(this);			
	}

	@Override
	public String getNodeName() {
		return "and";
	}
}