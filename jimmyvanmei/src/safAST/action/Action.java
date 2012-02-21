package safAST.action;

import safVisitor.ISAFVisitable;
import safVisitor.ISAFVisitor;

public  class Action implements ISAFVisitable{
	private Action moveAction;
	private Action fightAction;
	
	public Action()
	{
		moveAction = null;
		fightAction = null;
	}
	
	public Action(Action ma, Action fa)
	{
		moveAction = ma;
		fightAction = fa;
	}
	
	public Action getMoveAction()
	{
		return moveAction;
	}
	
	public Action getFightAction()
	{
		return fightAction;
	}
	
	public void setMoveAction(Action moveAct)
	{
		moveAction = moveAct;
	}
	
	public void setFightAction(Action fightAct)
	{
		fightAction = fightAct;
	}
	
	public String toString()
	{
		return "(" + moveAction + " " + fightAction + ")";
	}

	@Override
	public void accept(ISAFVisitor visitor) 
	{
		moveAction.accept(visitor);
		fightAction.accept(visitor);
		visitor.visit(this);
	}
}
