package saf.ast;

import java.util.*;

import saf.ast.*;
import saf.checker.*;
import Game.Interpreter;

/**
 * This class holds a procedure call, and its parameters.
 * 
 * @author huyhoang
 */
public class Function implements Statement 
{
	List<Variable> parameters;
	public List<Variable> getParameters()
	{
		return this.parameters;
	}
	
	private String functionName;
	public String getFunctionName()
	{
		return functionName;
	}
	
	private Class<?> returnType;
	public Class<?> getReturnType()
	{
		return this.returnType;
	}
	
	public void setReturnType(Class<?> returnType)
	{
		this.returnType = returnType;
	}
	
	public Function(String functionName)
	{
		this.functionName = functionName;
		parameters = new ArrayList<Variable>();
	}
	
	// Variable may need to be refactored.
	public void AddParameter(Variable parameter)
	{
		parameters.add(parameter);
	}
	
	public String toString()
	{
		return String.format("Function: %s", this.functionName);
	}
	
	public boolean equals(Object obj)
	{
		if (obj instanceof Function)
		{
			Function function = (Function)obj;
			return this.functionName.equals(function.functionName);
		}
		else
		{
			return false;
		}
	}

	@Override
	public void accept(Checker visitor) 
	{
		visitor.visit(this);
	}

	@Override
	public void accept(Interpreter visitor) 
	{
		visitor.visit(this);
	}
}
