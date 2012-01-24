package AST;

import java.util.*;
import java.lang.StringBuilder;

public class ASTManager
{
	private List<Statement> statements;
	
	public List<Statement> getStatements() {
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