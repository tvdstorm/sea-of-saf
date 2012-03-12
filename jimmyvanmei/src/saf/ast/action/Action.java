package saf.ast.action;

import saf.visitor.IVisitable;
import saf.visitor.IVisitor;

public  class Action implements IVisitable{
	private Action move;
	private Action fight;
	
	public Action()
	{
		move = null;
		fight = null;
	}
	
	public Action(Action m, Action f)
	{
		move = m;
		fight = f;
	}
	
	public Action getMoveAction()
	{
		return move;
	}
	
	public Action getFightAction()
	{
		return fight;
	}
	
	public void setMoveAction(Action m)
	{
		move = m;
	}
	
	public void setFightAction(Action f)
	{
		fight = f;
	}
	
	public String toString()
	{
		return "(" + move + " " + fight + ")";
	}

	@Override
	public void accept(IVisitor visitor) 
	{
		visitor.visit(this);
	}
}
