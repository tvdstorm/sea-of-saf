package saf.ast.action;

import java.util.*;

import saf.visitor.*;

public class ChooseAction extends Action implements IVisitable{
	private List<Action> actions; 
	
	public ChooseAction()
	{
		actions = new ArrayList<Action>();
	}
	
	public void addActions(Action act)
	{
		actions.add(act);
	}
	
	public List<Action> getActions()
	{
		return actions;
	}
	
	public void removeAction (Action act)
	{
		actions.remove(act);
	} 
	
	@Override
	public void accept(IVisitor visitor)
	{
		visitor.visit(this);
	}
	
	public String toString()
	{
		return "(" + actions + ")";
	}
}
