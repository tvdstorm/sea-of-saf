package saf.ast;

import java.util.*;
import saf.ast.*;
import saf.checker.*;
import Game.Interpreter;

/**
 * This class holds the keyword "choose", condition, action, etc.	
 * 
 * @author huyhoang
 */
public class Function implements Statement 
{
	List<Function> parameters;
	public List<Function> getParameters()
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
		parameters = new ArrayList<Function>();
	}
	
	// Variable may need to be refactored.
	public void addParameter(Function parameter)
	{
		parameters.add(parameter);
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
	public void accept(FighterVisitor visitor) {
		visitor.visit(this);
	}
}
