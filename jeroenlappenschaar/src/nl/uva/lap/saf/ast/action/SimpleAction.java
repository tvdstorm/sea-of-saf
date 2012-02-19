package nl.uva.lap.saf.ast.action;

import nl.uva.lap.saf.ast.Visitor;

public class SimpleAction extends Action
{
	private String action;
	
	public SimpleAction(String action)
	{
		this.action=action;
	}

	@Override
	public void accept(Visitor visitor)
	{
		visitor.visit(this);
	}
	
	public String getAction()
	{
		return action;
	}
}
