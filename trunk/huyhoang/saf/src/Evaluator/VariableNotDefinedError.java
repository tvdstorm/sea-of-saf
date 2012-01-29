package Evaluator;

public class VariableNotDefinedError extends EvaluationError
{
	public VariableNotDefinedError(String objectThatCausesError)
	{
		super(objectThatCausesError);
	}

	public String toString()
	{
		return String.format("Undefined variable '%s'", getObjectThatCausesError().toString());
	}
}
