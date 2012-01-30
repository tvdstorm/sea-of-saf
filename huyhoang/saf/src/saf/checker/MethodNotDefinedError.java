package saf.checker;
import saf.ast.*;

public class MethodNotDefinedError implements EvaluationError
{
	private Function function;
	
	public MethodNotDefinedError(Function function)
	{
		this.function = function;
	}

	public String toString()
	{
		return String.format("Function '%s' not found", function.getFunctionName());
	}

}
