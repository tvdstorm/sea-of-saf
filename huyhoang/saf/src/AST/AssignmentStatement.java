package AST;

import Evaluator.EvaluationManager;
import Game.Interpreter;

/**
 * The AssignmentStatement object holds the "variable name" and the "variable value" of an assignment.
 * The object allows an EvaluationManager and Interpreter object to visit.
 * 
 * @author huyhoang
 */
public class AssignmentStatement implements Statement
{
	private String variableName;
	public String getVariableName()
	{
		return this.variableName;
	}
	
	private int value;
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

	@Override
	public void accept(Interpreter visitor)
	{
		try
		{
			visitor.visit(this);
		}
		catch (Exception ex)
		{
		}
	}
}
