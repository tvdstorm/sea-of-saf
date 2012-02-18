package nl.uva.lap.saf.ast.fighter;

import java.util.ArrayList;
import java.util.List;

import nl.uva.lap.saf.ast.ASTNode;
import nl.uva.lap.saf.ast.Visitor;

public class Fighter extends ASTNode
{
	private final String name;
	private List<Personality> personalities = new ArrayList<Personality>();

	public Fighter(String name, List<Personality> personalities, List<Behaviour> behaviours)
	{
		this.name = name;
		this.personalities = personalities;
	}

	public String getName()
	{
		return name;
	}

	@Override
	public void accept(Visitor visitor)
	{
		visitor.visit(this);
	}
	
	public void addPersonality(Personality personality)
	{
		this.personalities.add(personality);
	}

	public List<Personality> getPersonalities()
	{
		return personalities;
	}
}