package AST;

public class LogicalExpression extends Statement {
	public enum ConditionalOperators 
	{ 
		AndOperator, 
		OrOperator 
	}
	
	private LogicalExpression leftExpression;
	private LogicalExpression rightExpression;
	
	public LogicalExpression(ConditionalOperators operator, BoolExpression x, BoolExpression y)
	{
		
	}
	
	public LogicalExpression(ConditionalOperators operator, BoolExpression x, LogicalExpression leftExpression )
	{
		
	}
}
