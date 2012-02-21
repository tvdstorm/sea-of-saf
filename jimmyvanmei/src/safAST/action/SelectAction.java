package safAST.action;

import java.util.*;

import safVisitor.*;

public class SelectAction extends Action implements ISAFVisitable{
	private ArrayList<Action> actions; 
	
	public SelectAction()
	{
		actions = new ArrayList<Action>();
	}
	
	public void addActions(Action act)
	{
		actions.add(act);
	}
	
	public ArrayList<Action> getActions()
	{
		return actions;
	}
	
	public void removeAction (Action act)
	{
		actions.remove(act);
	} 
	
	@Override
	public void accept(ISAFVisitor visitor)
	{
		for (Action a : actions)
			a.accept(visitor);
		visitor.visit(this);
	}
	
	public String toString()
	{
		return "(" + actions + ")";
	}
}
