package saf.checker;

public class OutOfRangeError implements EvaluationError 
{
	public OutOfRangeError()
	{
	}

	public String toString()
	{
		return String.format("%d is out of range. You cannot assign this to %s", 0, "");
	}
}
