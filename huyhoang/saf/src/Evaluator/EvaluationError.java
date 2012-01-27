package Evaluator;

public abstract class EvaluationError
{
	private Object objectThatCausesError;
	
	public Object getObjectThatCausesError()
	{
		return this.objectThatCausesError;
	}

	public EvaluationError(Object objectThatCausesError)
	{
		this.objectThatCausesError = objectThatCausesError;
	}
}
