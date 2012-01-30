package saf.checker;

import saf.ast.*;

public class TypeMismatchError implements EvaluationError
{
	private Function functionCaused;
	private Class<?> expectedType;

	public TypeMismatchError(Function functionCaused, Class<?> expectedType) 
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
