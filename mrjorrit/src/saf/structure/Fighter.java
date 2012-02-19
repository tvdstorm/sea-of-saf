package saf.structure;

import java.util.List;

import saf.Checker.Check;
import saf.simulation.Arena;

public class Fighter extends Check 
{
	
	//Constructor
	public Fighter(String name, Personality personality, Behaviour behaviour) {
		this.name = name;
		this.personality = personality;
		this.behaviour = behaviour;
	}
	
	//Name
	private final String name;
	
	public String getName() {
		return name;
	}

	//Personality
	private final Personality personality;
	
	public Personality getPersonality() {
		return personality;
	}
	
	//Behaviour
	private final Behaviour behaviour;
	
	public Behaviour getBehaviour() {
		return behaviour;
	}	
	
	@Override
	public List<String> check(){
		if(name == null || name.isEmpty())
		{
			addError("A fighter needs a name!");
		}
		addErrors(personality.check());
		addErrors(behaviour.check());
		return getErrors();
	}

}

