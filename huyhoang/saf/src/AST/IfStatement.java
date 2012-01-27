package AST;

import java.util.*;

import Evaluator.EvaluationManager;

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
		return "IfStatement\r\n" +
			   "\tExpression: " + evaluationExpression.toString() + "\r\n" +
			   "\tStatements: " + statements.toString();
	}

	@Override
	public void accept(EvaluationManager visitor)
	{
		visitor.visit(this);
		for (Statement statement : statements)
		{
			System.out.println(statement.toString());
			statement.accept(visitor);
		}
	}
}
