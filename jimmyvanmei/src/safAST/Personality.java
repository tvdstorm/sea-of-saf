package safAST;

import safVisitor.*;

public class Personality implements ISAFVisitable{
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
	public void accept(ISAFVisitor visitor) 
	{
		visitor.visit(this);	
	}
}
