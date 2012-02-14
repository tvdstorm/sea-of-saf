package saf.astelements.conditions;

import saf.astelements.ICondition;
import saf.ISAFNodeVisitor;

public class StringLeaf implements ICondition{
	private String nodeName;
	
	public StringLeaf(String nodeName){
		this.nodeName = nodeName;
	}
	
	@Override
	public Boolean isConditionNodeActive(ICondition con){
		return this.getNodeName().equals(con.getNodeName());
	}
	
	@Override
	public void accept(ISAFNodeVisitor visitor){
		visitor.visit(this);
	}

	@Override
	public String getNodeName() {
		return this.nodeName;
	}
}