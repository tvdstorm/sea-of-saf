package safAST;

import safAST.action.Action;
import safAST.condition.Condition;
import safVisitor.ISAFVisitable;
import safVisitor.ISAFVisitor;

public class Behaviour implements ISAFVisitable{
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
	public void accept(ISAFVisitor visitor) 
	{
		condition.accept(visitor);
		action.accept(visitor);
		visitor.visit(this);
	}

}
