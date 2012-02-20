package saf.structure;

import java.util.ArrayList;

import saf.Checker.Check;

public class Personality extends Check  {
	
	public Personality(ArrayList<Characteristic> characteristics)
	{
		this.characteristics = characteristics;
	}
	
	private final ArrayList<Characteristic> characteristics;
	
	public ArrayList<Characteristic> getCharacteristics() {
		return characteristics;
	}

	@Override
	public ArrayList<String> check(){
		
		ArrayList<Attribute> foundAttributes = new ArrayList<Attribute>(); 
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
