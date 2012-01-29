package Evaluator;

public class MethodNotDefinedError extends EvaluationError
{
	public MethodNotDefinedError(AST.Function objectThatCausesError)
	{
		super(objectThatCausesError);
	}

	public String toString()
	{
		return String.format("Function '%s' not found", ((AST.Function)(getObjectThatCausesError())).getFunctionName());
	}

}
