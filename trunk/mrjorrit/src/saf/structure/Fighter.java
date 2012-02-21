package saf.structure;

import java.util.ArrayList;

import saf.Checker.Check;
import saf.simulation.Arena;

public class Fighter extends Node 
{
	
	private final String name;
	private final Personality personality;
	private final Behaviour behaviour;
	
	public Fighter(String name, Personality personality, Behaviour behaviour) 
	{
		this.name = name;
		this.personality = personality;
		this.behaviour = behaviour;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public Personality getPersonality() 
	{
		return personality;
	}
	
	public Behaviour getBehaviour() 
	{
		return behaviour;
	}	
	

	@Override
	public void check(Check checker) 
	{
		if(name == null || name.isEmpty())
		{
			checker.addError("A fighter needs a name!");
		}
		
		personality.check(checker);
		behaviour.check(checker);
	}

}

