package saf.astelements;

import saf.ISAFNode;

public interface ICondition extends ISAFNode{
	public Boolean isConditionNodeActive(ICondition con);
	public String getNodeName();
}