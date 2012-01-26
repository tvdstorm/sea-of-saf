package AST;

public class LogicalExpression extends Statement 
{
	public enum ConditionalOperators 
	{ 
		AndOperator, 
		OrOperator 
	}
	
	private Object leftExpression;
	private Object rightExpression;

	public Object getLeftExpression() 
	{
		return leftExpression;
	}
	
	public Object getRightExpression() 
	{
		return rightExpression;
	}
	
	public LogicalExpression(ConditionalOperators operator, Object leftExpression, Object rightExpression )
	{
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}
	
	public String toString()
	{
		return	"LogicalExpression\r\n" +
				"	" + this.leftExpression.toString() + "\r\n" +
				"	" + this.rightExpression.toString() + "\r\n";
	}
}
