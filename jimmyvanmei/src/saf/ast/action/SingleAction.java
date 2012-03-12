package saf.ast.action;

import saf.visitor.IVisitable;
import saf.visitor.IVisitor;

public class SingleAction extends Action implements IVisitable{
	private String action;
	
	public SingleAction()
	{
		action = null;
	}
	
	public SingleAction(String act)
	{
		action = act;
	}
	
	public String getSingleAct()
	{
		return action;
	}
	
	public void setSingleAct(String act)
	{
		action = act;
	}
	
	public String toString()
	{
		return "(" + action + ")";
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
}

