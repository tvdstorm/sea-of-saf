package AST;

import java.util.*;

public class IfStatement extends Statement
{
	Object evaluationExpression;
	List<Statement> statements;
	
	public IfStatement( BoolExpression expression, List<Statement> statements )
	{
		this.evaluationExpression = expression;
		this.statements = statements;
	}
	
	/*
	public IfStatement( LogicalExpression expression, List<Statement> statements )
	{
	
	}*/
}
