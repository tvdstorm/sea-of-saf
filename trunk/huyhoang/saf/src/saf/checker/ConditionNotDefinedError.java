package saf.checker;

public class ConditionNotDefinedError implements EvaluationError
{
	public String toString()
	{
		return "Condition %s needs to be defined";
	}
}
