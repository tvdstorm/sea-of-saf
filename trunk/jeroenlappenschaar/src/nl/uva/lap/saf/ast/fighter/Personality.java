package nl.uva.lap.saf.ast.fighter;

import nl.uva.lap.saf.ast.ASTNode;
import nl.uva.lap.saf.ast.Visitor;

public class Personality extends ASTNode
{
	private final String name;
	private final Integer value;

	public Personality(String string, String string2)
	{
		this.name = string;
		this.value = Integer.parseInt(string2);
	}

	public void addToFighter(Fighter fighter)
	{
		fighter.addPersonality(this);
	}

	public String getName()
	{
		return name;
	}

	public Integer getValue()
	{
		return value;
	}

	public void accept(Visitor visitor)
	{
		visitor.visit(this);
	}
}
