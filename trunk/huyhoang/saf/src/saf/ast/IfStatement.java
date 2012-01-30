package saf.ast;

import java.util.*;

import saf.checker.*;
import Game.Interpreter;

public class IfStatement implements Statement
{
	private Statement evaluationExpression;
	public Statement getEvaluationExpression()
	{
		return this.evaluationExpression;
	}
	
	private List<Statement> statements;
	public List<Statement> getStatements()
	{
		return this.statements;
	}
	
	public IfStatement(Statement evaluationExpression, List<Statement> statements)
	{
		this.evaluationExpression = evaluationExpression;
		this.statements = statements;
	}

	public String toString()
	{
		return "IfStatement\r\n" +
			   "\tExpression: " + evaluationExpression.toString() + "\r\n" +
			   "\tStatements: " + statements.toString();
	}

	@Override
	public void accept(Checker visitor)
	{
		visitor.visit(this);
		for (Statement statement : statements)
		{
			statement.accept(visitor);
		}
	}

	@Override
	public void accept(Interpreter visitor) 
	{
		visitor.visit(this);
	}
}
