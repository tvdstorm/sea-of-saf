package saf.ast;

/* Please refactor it and call it Identifier. */
public class Variable 
{
	private String name;
	public String getName()
	{
		return name;
	}
	
	private Object variableValue;
	public Object getVariableValue() 
	{
		return variableValue;
	}

	public void setVariableValue(Object variableValue) 
	{
		this.variableValue = variableValue;
	}

	public Variable(String name, Object initializationValue)
	{
		this.name = name;
		this.variableValue = initializationValue;
	}
	
	// Create uninitialized variable (please use jdoc)
	public Variable(String name)
	{
		this.name = name;
		this.variableValue = null;
	}
}
