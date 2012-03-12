package saf.ast;

import saf.ast.action.Action;
import saf.ast.condition.Condition;
import saf.visitor.IVisitable;
import saf.visitor.IVisitor;

public class Behaviour implements IVisitable{
	private Condition condition;
	private Action action;
	
	public Behaviour()
	{
		condition = null;
		action = null;
	}
	
	public Behaviour(Condition c, Action a)
	{
		condition = c;
		action = a;
	}
	
	public Condition getCondition()
	{
		return condition;
	}
	
	public Action getAction()
	{
		return action;
	}
	
	public void setCondition(Condition cond)
	{
		condition = cond;
	}
	
	public void setAction(Action act)
	{
		action = act;
	}
	
	public String toString() 
	{
		return "(" + condition + " " + action + ")";
	}
	
	@Override
	public void accept(IVisitor visitor) 
	{
		visitor.visit(this);
	}

}
