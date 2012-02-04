package saf.checker.errors;

public class ConditionNotDefined implements Error
{
	public String toString()
	{
		return "Condition %s needs to be defined";
	}
}
