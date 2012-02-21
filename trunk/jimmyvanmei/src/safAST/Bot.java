package safAST;

import java.util.ArrayList;
import safVisitor.ISAFVisitable;
import safVisitor.ISAFVisitor;

public class Bot implements IBot, ISAFVisitable{
	private String name;
	private ArrayList<Personality> personal;
	private ArrayList<Behaviour> behave;
	
	public Bot()
	{
		name = null;
		personal = new ArrayList<Personality>();
		behave = new ArrayList<Behaviour>();
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
	
	public ArrayList<Personality> getPersonality()
	{
		return personal;
	}
	
	public ArrayList<Behaviour> getBehaviour()
	{
		return behave;
	}
	
	public String toString() 
	{
		return "(" + name + " " + personal + " " + behave + ")";
	}
	
	@Override
	public void accept(ISAFVisitor visitor) 
	{
		for(Personality p : this.personal)
			p.accept(visitor);
		for(Behaviour b : this.behave)
			b.accept(visitor);
		visitor.visit(this);	
	}

	@Override
	public Bot getBot() {
		return this;
	}
}
