package AST;

public class BoolExpression {
	public enum ComparisonOperators
	{
		equalsOperator
	}
	
	private Object leftOperand;
	private Object rightOperand;
	private ComparisonOperators comparisonOperator;
	
	public BoolExpression(ComparisonOperators comparisonOperator, Object leftOperand, Object rightOperand)
	{
		this.leftOperand 		= leftOperand;
		this.rightOperand		= rightOperand;
		this.comparisonOperator = comparisonOperator;
	}
}
