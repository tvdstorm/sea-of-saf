package saf.checker.errors;

// please rename to strength
public class VariableNotDefined implements Error
{
	private String variable;
	
	public VariableNotDefined(String variable)
	{
		this.variable = variable;
	}

	public String toString()
	{
		return String.format("Undefined variable '%s'", variable);
	}
}
