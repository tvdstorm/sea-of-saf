package saf.checker.errors;

import saf.ast.*;

public class TypeMismatch implements Error
{
	private Function functionCaused;
	private Class<?> expectedType;

	public TypeMismatch(Function functionCaused, Class<?> expectedType) 
	{
		this.functionCaused = functionCaused;
		this.expectedType = expectedType;
	}
	
	public String toString()
	{
		return String.format("Type mismatch: '%s' expected while method '%s' returns '%s' type.", 
							 expectedType.toString(),
							 functionCaused.getFunctionName(),
							 functionCaused.getReturnType().toString());
	}

}
