package saf.structure;

import java.util.List;

import saf.Checker.Check;

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
	
	public int getAttributePower(Attribute attribute)
	{
		for(Characteristic characteristic : personality.getCharacteristics())
		{
			if(characteristic.getAttribute() == attribute)
				return characteristic.getPower();
		}
		return 5;
	}
	
	public List<Rule> getRules()
	{
		return behaviour.getRules();
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

