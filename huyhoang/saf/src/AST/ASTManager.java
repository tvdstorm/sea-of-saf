package AST;

import java.util.*;

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
}