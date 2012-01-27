package Evaluator;

public class FunctionNotDefinedError extends EvaluationError
{
	public FunctionNotDefinedError(AST.Function objectThatCausesError)
	{
		super(objectThatCausesError);
	}

	public String toString()
	{
		return String.format("Function {0} not found", "<FUNCTION_NAME>");
	}

}
