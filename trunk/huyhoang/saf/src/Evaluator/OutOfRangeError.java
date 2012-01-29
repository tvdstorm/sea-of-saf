package Evaluator;

public class OutOfRangeError extends EvaluationError 
{
	public OutOfRangeError(Object objectThatCausesError)
	{
		super(objectThatCausesError);
	}

	public String toString()
	{
		return String.format("%d is out of range. You cannot assign this to %s", 0, "");
	}
}
