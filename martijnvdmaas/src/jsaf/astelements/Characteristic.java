package jsaf.astelements;

import jsaf.visitor.SAFElement;
import jsaf.visitor.SAFElementVisitor;

public class Characteristic implements SAFElement
{
	private String name;
	private int value;

	public Characteristic() 
	{
		this.value = 5; //set default value;
	}
	
	public Characteristic(String name, int value) 
	{
		this.name 	= name;
		this.value 	= value;
	}
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getValue() 
	{
		return value;
	}

	public void setValue(int value) 
	{
		this.value = value;
	}

	@Override
	public void accept(SAFElementVisitor visitor) {
		visitor.visit(this);
	}
}
