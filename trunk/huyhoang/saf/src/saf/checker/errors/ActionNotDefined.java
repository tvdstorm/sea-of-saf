package saf.checker.errors;
import saf.ast.*;

public class ActionNotDefined implements Error
{
	private Function function;
	
	public ActionNotDefined(Function function)
	{
		this.function = function;
	}

	public String toString()
	{
		return String.format("Action '%s' not found", function.getFunctionName());
	}

}
