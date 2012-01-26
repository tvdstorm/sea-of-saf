package AST;

import java.util.*;

public class IfStatement extends Statement
{
	Object evaluationExpression;
	List<Statement> statements;
	
	public IfStatement( Object expression, List<Statement> statements )
	{
		this.evaluationExpression = expression;
		this.statements = statements;
	}
	
	public String toString()
	{
		return	"IfStatement\r\n" +
				"	Expression: " + evaluationExpression.toString() + "\r\n" +
				"	Statements: " + statements.toString();
	}
	
	/*
	public IfStatement( LogicalExpression expression, List<Statement> statements )
	{
	
	}*/
}
