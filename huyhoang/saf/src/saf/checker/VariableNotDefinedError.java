package saf.checker;

// please rename to strength
public class VariableNotDefinedError implements EvaluationError
{
	private String variable;
	
	public VariableNotDefinedError(String variable)
	{
		this.variable = variable;
	}

	public String toString()
	{
		return String.format("Undefined variable '%s'", variable);
	}
}
