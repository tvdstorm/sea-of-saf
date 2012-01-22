package saf;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;

import antlrgenerated.*;

public class Fighter
{

	public Fighter(CharStream cs)
	{
		SAFLexer lexer = new SAFLexer(cs);
		CommonTokenStream tokens = new CommonTokenStream();
		tokens.setTokenSource(lexer);
		SAFParser parser = new SAFParser(tokens);
		try
		{
			SAFParser.fighter_return fighter = parser.fighter();
			CommonTree tree = (CommonTree)fighter.getTree();
			System.out.println("tree="+tree.toStringTree());
		}
		catch (RecognitionException e)
        {
            System.out.println(e.getMessage());
        }
	}

	
}
