package Evaluator;

import AST.Function;

public class TypeMismatchError extends EvaluationError
{
	private Class<?> expectedType;

	public TypeMismatchError(Function objectThatCausesError, Class<?> expectedType) 
	{
		super(objectThatCausesError);
		this.expectedType = expectedType;
	}
	
	public String toString()
	{
		Function function = (Function)getObjectThatCausesError();
		return String.format("Type mismatch: '%s' expected while method '%s' returns '%s' type.", 
							 expectedType.toString(),
							 function.getFunctionName(),
							 function.getReturnType().toString());
	}

}
