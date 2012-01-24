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
	
	public String toString()
	{
		return	"\t" + this.variableName + "\r\n" +
				"\t" + this.value;
	}
}
