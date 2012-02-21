package saf.structure;

import java.util.ArrayList;
import java.util.List;

import saf.Checker.Check;

public class Personality extends Node  
{
	
	private final List<Characteristic> characteristics;
	
	public Personality(List<Characteristic> characteristics)
	{
		this.characteristics = characteristics;
	}
	
	public List<Characteristic> getCharacteristics() 
	{
		return characteristics;
	}

	@Override
	public void check(Check checker) 
	{
		List<String> foundAttributes = new ArrayList<String>();
		for(Characteristic character : characteristics)
		{
			character.check(checker);
			if(foundAttributes.contains(character.getAttributeString()))
				checker.addError("'" + character.getAttributeString() + "' already defined, this is a dupe.");
			else
				foundAttributes.add(character.getAttributeString());
		}
		
	}
}
