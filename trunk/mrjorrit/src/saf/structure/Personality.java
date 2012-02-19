package saf.structure;

import java.util.ArrayList;
import java.util.List;

import saf.Checker.Check;

public class Personality extends Check  {
	
	public Personality(List<Characteristic> characteristics)
	{
		this.characteristics = characteristics;
	}
	
	private final List<Characteristic> characteristics;
	
	public List<Characteristic> getCharacteristics() {
		return characteristics;
	}

	@Override
	public List<String> check(){
		
		List<Attribute> foundAttributes = new ArrayList<Attribute>(); 
		for(Characteristic character : characteristics)
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
