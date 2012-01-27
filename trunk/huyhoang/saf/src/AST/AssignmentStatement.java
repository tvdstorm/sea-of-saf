package AST;

import Evaluator.EvaluationManager;

public class AssignmentStatement extends Statement
{
	protected String variableName;
	protected int value;
	
	public int getValue()
	{
		return this.value;
	}
	
	public AssignmentStatement(String variableName, int value)
	{
		this.variableName = variableName;
		this.value = value;
	}
	
	public String toString()
	{
		return	"AssignmentStatement\r\n" +
				"\tVariable name: " + this.variableName + "\r\n" +
				"\tValue: " + this.value;
	}

	@Override
	public void accept(EvaluationManager visitor)
	{
		visitor.visit(this);
	}
}
