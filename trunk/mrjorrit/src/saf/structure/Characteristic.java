package saf.structure;

import java.util.ArrayList;

import saf.Checker.Check;

public class Characteristic extends Check {
	
	//Attribute
	private final Attribute attribute;

	public Attribute getAttribute() {
		return attribute;
	}

	//Power
	private final int power;
		
	public int getPower() {
		return power;
	}

	public Characteristic(String attribute, int power)
	{
		Attribute attribute2;
		
		try
		{
			attribute2 = Attribute.valueOf(attribute);
		}
		catch(Exception e)
		{
			//Set to default attribute
			attribute2 = null;
			addError("Illegal attribute: '" + attribute + "'");
		}
		this.attribute = attribute2;
		this.power = power;
	}

	@Override
	public ArrayList<String> check(){
		if(power < 1 || power > 10) 
		{
			addError("The power: '" + power + "', is invalid for: '" + attribute.toString() + "'. Power should be in the range of 1-10.");
		}
		return getErrors();
	}
	
}
