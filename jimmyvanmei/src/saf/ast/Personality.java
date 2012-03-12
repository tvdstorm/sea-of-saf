package saf.ast;

import saf.visitor.*;

public class Personality implements IVisitable{
	private String characName;
	private int value;
	
	public Personality()
	{
		characName = null;
		value =  -1;
	}
	
	public Personality(String n)
	{
		characName = n;
		value = -1;
	}
	
	public Personality(String n, int v)
	{
		characName = n;
		value = v;
	}
	
	public String toString() 
	{
		return "(" + characName + " " + value + ")";
	}
	
	public String getCharacterName()
	{
		return characName;
	}
	
	public int getCharacterValue()
	{
		return value;
	}
	
	public void setCharacterValue(int v)
	{
		value = v;
	}
	
	public void setCharacterName(String n)
	{
		characName = n;
	}
	
	@Override
	public void accept(IVisitor visitor) 
	{
		visitor.visit(this);	
	}
}
