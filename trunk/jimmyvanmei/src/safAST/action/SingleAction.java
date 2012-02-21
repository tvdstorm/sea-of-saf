package safAST.action;

import safVisitor.ISAFVisitable;
import safVisitor.ISAFVisitor;

public class SingleAction extends Action implements ISAFVisitable{
	private String action;
	
	public SingleAction()
	{
		action = null;
	}
	
	public SingleAction(String actName)
	{
		action = actName;
	}
	
	public String getActionName()
	{
		return action;
	}
	
	public void setActionName(String actName)
	{
		action = actName;
	}
	
	public String toString()
	{
		return "(" + action + ")";
	}

	@Override
	public void accept(ISAFVisitor visitor) {
		visitor.visit(this);
	}
}

