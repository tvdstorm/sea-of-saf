package saf.ast;

import java.util.*;
import saf.checker.*;
import Game.Interpreter;

/**
 * The Behaviour class represents the Behaviour node in the Fighter AST.
 * 
 * @author huyhoang
 *
 */
public class Behaviour implements Statement
{
	private Statement condition;
	public Statement getCondition()
	{
		return this.condition;
	}
	
	private List<Statement> statements;
	public List<Statement> getStatements()
	{
		return this.statements;
	}
	
	// condition = expression
	public Behaviour(Statement condition, List<Statement> statements)
	{
		this.condition = condition;
		this.statements = statements;
	}

	@Override
	public void accept(FighterVisitor visitor)
	{
		visitor.visit(this);
		acceptChildren(visitor);
	}
	
	protected void acceptChildren(FighterVisitor visitor)
	{
		for (Statement statement : statements)
		{
			statement.accept(visitor);
		}
	}
}
