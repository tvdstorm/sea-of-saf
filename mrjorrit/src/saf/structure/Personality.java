package saf.structure;

import java.util.ArrayList;
import java.util.List;

public class Personality extends Check  {
	
	public Personality(List<Characteristic> personality)
	{
		this.personality = personality;
	}
	
	//Behaviour
	private final List<Characteristic> personality;
	
	public List<Characteristic> getBehaviour() {
		return personality;
	}

	@Override
	public List<String> check(){
		
		List<Attribute> foundAttributes = new ArrayList<Attribute>(); 
		for(Characteristic character : personality)
		{
			addErrors(character.check());
			if(foundAttributes.contains(character.getAttribute()))
				addError("'" + character.getAttribute().toString() + "' already defined, this is a dupe.");
			else
				foundAttributes.add(character.getAttribute());
		}
		return getErrors();
	}
}
