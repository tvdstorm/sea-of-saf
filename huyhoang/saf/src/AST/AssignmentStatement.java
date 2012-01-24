package AST;

public class AssignmentStatement extends Statement
{
	protected String variableName;
	protected int value;
	
	public AssignmentStatement(String variableName, int value)
	{
		this.variableName = variableName;
		this.value = value;
	}
}
