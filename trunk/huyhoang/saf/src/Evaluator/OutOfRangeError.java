package Evaluator;

public class OutOfRangeError extends EvaluationError 
{
	public OutOfRangeError(Object objectThatCausesError)
	{
		super(objectThatCausesError);
	}

	public String toString()
	{
		return String.format("The assignment value is out of range for");
	}
}
