package nl.uva.lap.saf.ast.fighter;

import java.util.ArrayList;
import java.util.List;

import nl.uva.lap.saf.ast.ASTNode;
import nl.uva.lap.saf.ast.Visitor;
import nl.uva.lap.saf.ast.action.Action;
import nl.uva.lap.saf.ast.condition.Condition;
import nl.uva.lap.saf.ast.condition.SimpleCondition;

public class Behaviour extends ASTNode
{
	private final Condition condition;
	private List<Action> actions = new ArrayList<Action>();

	public Behaviour(Condition condition, Action action)
	{
		this.condition = condition;
		this.actions.add(action);
	}
	
	public Behaviour(Condition condition, Action action1, Action action2)
	{
		this.condition = condition;
		this.actions.add(action1);
		this.actions.add(action2);
	}

	@Override
	public void accept(Visitor visitor)
	{
		visitor.visit(this);
	}
	
	public Condition getCondition()
	{
		return condition;
	}
	
	public List<Action> getActions()
	{
		return actions;
	}

	public boolean isAlways()
	{
		if(!(condition instanceof SimpleCondition))
			return false;
		SimpleCondition simple = (SimpleCondition) condition;
		return simple.getCondition().equals("always");
	}
}
