package nl.uva.lap.saf.ast.fighter;

import java.util.ArrayList;
import java.util.List;

import nl.uva.lap.saf.ast.ASTNode;
import nl.uva.lap.saf.ast.Visitor;

public class Fighter extends ASTNode
{
	private final String name;
	private List<Personality> personalities = new ArrayList<Personality>();
	private List<Behaviour> behaviours = new ArrayList<Behaviour>();

	public Fighter(String name, List<Personality> personalities, List<Behaviour> behaviours)
	{
		this.name = name;
		this.personalities = personalities;
		this.behaviours = behaviours;
	}

	public String getName()
	{
		return name.substring(0,1).toUpperCase() + name.substring(1);
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
	
	public List<Behaviour> getBehaviours()
	{
		return behaviours;
	}
}