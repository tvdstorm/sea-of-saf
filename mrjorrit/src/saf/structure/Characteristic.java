package saf.structure;

import saf.Checker.Check;

public class Characteristic extends Node 
{
	
	private final String attributeString;
	private final int power;
	
	public Attribute getAttribute() 
	{
		return Attribute.valueOf(attributeString);
	}
	
	public String getAttributeString() 
	{
		return attributeString;
	}
	
	public int getPower() 
	{
		return power;
	}

	public Characteristic(String attributeString, int power)
	{
		this.attributeString = attributeString;
		this.power = power;
	}

	@Override
	public void check(Check checker) 
	{
		if(power < 1 || power > 10) 
		{
			checker.addError("The power: '" + power + "', is invalid for: '" + attributeString + "'. Power should be in the range of 1-10.");
		}
		
		boolean attributeExists = false;
		for(Attribute attribute : Attribute.values())
		{
			if(attributeString.equals(attribute.name()))
				attributeExists = true;
		}
		
		if(!attributeExists)
			checker.addError("'" + attributeString + "' isn't a valid move action");
		
	}
	
}
