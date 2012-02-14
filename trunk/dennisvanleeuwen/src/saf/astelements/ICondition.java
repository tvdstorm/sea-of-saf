package saf.astelements;

import saf.ISAFElement;

public interface ICondition extends ISAFElement{
	public Boolean isConditionNodeActive(ICondition con);
	public String getNodeName();
}