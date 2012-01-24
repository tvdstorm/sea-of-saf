package AST;

import java.util.*;

public class Function extends Statement {
	List<Variable> parameters;
	String functionName;
	
	public Function(String functionName)
	{
		this.functionName = functionName;
		parameters = new ArrayList<Variable>();
	}
	
	public void AddParameter(Variable parameter)
	{
		parameters.add(parameter);
	}
}
