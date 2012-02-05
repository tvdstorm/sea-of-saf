package saf.ast;

import java.util.*;
import java.lang.StringBuilder;

/**
 * The FighterAST class holds the AST of a SAF specification, and serves as the entry point.
 * The AST consists of a list of Statement objects.
 * 
 * @author huyhoang
 */
public class Fighter
{
	private List<Statement> statements;
	public List<Statement> getStatements()
	{
		return statements;
	}

	public Fighter()
	{
		statements = new ArrayList<Statement>();
	}
}