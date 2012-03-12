package saf.ast;

import java.util.ArrayList;
import java.util.List;

import saf.visitor.IVisitable;
import saf.visitor.IVisitor;

public class Bot implements IBot, IVisitable{
	private String name;
	private List<Personality> personal;
	private List<Behaviour> behave;
	
	public Bot()
	{
		name = null;
		personal = null;
		behave = null;
	}
	
	public Bot(String n)
	{
		name = n;
		personal = new ArrayList<Personality>();
		behave = new ArrayList<Behaviour>();
	}
	
	public void setBotName(String n)
	{
		name = n;
	}
	
	public void addPersonality(Personality p)
	{
		personal.add(p);
	}
	
	public void addBehaviour(Behaviour b)
	{
		behave.add(b);
	}
	
	public void removePersonality(Personality p)
	{
		personal.remove(p);
	}
	
	public void removeBehaviour(Behaviour b)
	{
		behave.remove(b);
	}
	
	public String getName()
	{
		return name;
	}
	
	public List<Personality> getPersonality()
	{
		return personal;
	}
	
	public List<Behaviour> getBehaviour()
	{
		return behave;
	}
	
	public String toString() 
	{
		return "(" + name + " " + personal + " " + behave + ")";
	}
	
	@Override
	public void accept(IVisitor visitor) 
	{
		visitor.visit(this);
	}

	@Override
	public Bot getBot() {
		return this;
	}
}
