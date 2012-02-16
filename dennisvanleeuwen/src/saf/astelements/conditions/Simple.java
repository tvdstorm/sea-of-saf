package saf.astelements.conditions;

import saf.astelements.ICondition;
import saf.ISAFNodeVisitor;

public class Simple implements ICondition{
	private String nodeName;
	
	public Simple(String nodeName){
		this.nodeName = nodeName;
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