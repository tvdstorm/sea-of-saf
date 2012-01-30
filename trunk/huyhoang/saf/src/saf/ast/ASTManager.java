package saf.ast;

import java.util.*;
import java.lang.StringBuilder;

/**
 * The ASTManager class holds the AST of a SAF specification. The AST consists of a list of Statement objects.
 * 
 * @author huyhoang
 */
public class ASTManager
{
	private List<Statement> statements;
	public List<Statement> getStatements()
	{
		return statements;
	}

	public ASTManager()
	{
		statements = new ArrayList<Statement>();
	}
	
	public String toString()
	{
		StringBuilder result = new StringBuilder();
		for ( Statement statement : statements )
		{
			result.append(statement.toString()).append("\r\n");
		}
		
		return result.toString();
	}
}