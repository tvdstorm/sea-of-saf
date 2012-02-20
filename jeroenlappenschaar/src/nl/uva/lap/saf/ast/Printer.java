package nl.uva.lap.saf.ast;

import java.util.List;

import nl.uva.lap.saf.ast.action.Action;
import nl.uva.lap.saf.ast.action.Choose;
import nl.uva.lap.saf.ast.action.SimpleAction;
import nl.uva.lap.saf.ast.condition.And;
import nl.uva.lap.saf.ast.condition.Condition;
import nl.uva.lap.saf.ast.condition.Or;
import nl.uva.lap.saf.ast.condition.SimpleCondition;
import nl.uva.lap.saf.ast.fighter.Behaviour;
import nl.uva.lap.saf.ast.fighter.Fighter;
import nl.uva.lap.saf.ast.fighter.Personality;

public class Printer implements Visitor
{
	private StringBuilder builder;
	
	private Printer()
	{
		builder = new StringBuilder();
	}
	
	public static String print(ASTNode node)
	{
		Printer printer = new Printer();
		node.accept(printer);
		return printer.builder.toString();
	}

	@Override
	public void visit(Personality personality)
	{
		builder.append(personality.getName());
		builder.append("=");
		builder.append(personality.getValue());
		builder.append("\n");
	}

	@Override
	public void visit(Fighter fighter)
	{
		builder.append(fighter.getName());
		builder.append("\n\n");
		for(Personality personality : fighter.getPersonalities())
			personality.accept(this);
		builder.append("\n");
		for(Behaviour behaviour : fighter.getBehaviours())
			behaviour.accept(this);
		builder.append("\n");
	}

	@Override
	public void visit(Behaviour behaviour)
	{
		builder.append("condition: ");
		Condition condition = behaviour.getCondition();
		condition.accept(this);
		builder.append("\n");
		builder.append("actions: ");
		List<Action> actions = behaviour.getActions();
		for(Action action : actions)
			action.accept(this);
		builder.append("\n");
	}

	@Override
	public void visit(Choose choose)
	{
		builder.append("choose(");
		for(Action action : choose.getOptions())
			action.accept(this);
		builder.append(")");
	}

	@Override
	public void visit(And andCondition)
	{
		builder.append("(");
		builder.append(andCondition.getLhs());
		builder.append(" and ");
		builder.append(andCondition.getRhs());
		builder.append(")");
	}

	@Override
	public void visit(Or orCondition)
	{
		builder.append("(");
		builder.append(orCondition.getLhs());
		builder.append(" or ");
		builder.append(orCondition.getRhs());
		builder.append(")");
	}

	@Override
	public void visit(SimpleCondition simple)
	{
		builder.append(simple.getCondition());
	}

	@Override
	public void visit(SimpleAction simple)
	{
		builder.append(simple.getAction());
	}
}
