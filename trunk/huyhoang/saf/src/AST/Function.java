package AST;

import java.util.*;

import Evaluator.EvaluationManager;

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
	
	public String toString()
	{
		return String.format("Function: %s", this.functionName);
	}

	@Override
	public void accept(EvaluationManager visitor) 
	{
		visitor.visit(this);
	}
	
	public boolean equals(Object obj)
	{
		if (obj instanceof Function)
		{
			Function function = (Function)obj;
			return this.functionName.equals(function.functionName);
		}
		else
		{
			return false;
		}
	}
}
