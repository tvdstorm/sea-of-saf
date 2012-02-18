package nl.uva.lap.saf.ast;

import nl.uva.lap.saf.ast.action.Action;
import nl.uva.lap.saf.ast.action.Ident;
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
	public void visit(Ident ident)
	{
		builder.append(ident.toString());
	}

	@Override
	public void visit(Action action)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Personality personality)
	{
		builder.append(personality.getName());
		builder.append("=");
		builder.append(personality.getValue());
		
	}

	@Override
	public void visit(Fighter fighter)
	{
		builder.append(fighter.getName());
		builder.append("\n");
		for(Personality personality : fighter.getPersonalities())
			builder.append(personality);
		builder.append("\n");
	}

	@Override
	public void visit(Behaviour behaviour)
	{
		// TODO Auto-generated method stub
		
	}
}
