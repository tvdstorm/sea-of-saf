package nl.uva.lap.saf;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

public class Test
{

	public static void main(String[] args) throws RecognitionException
	{
		CharStream charStream = new ANTLRStringStream("3//..." +
				"\r\n" +
				"") ;
		SAFLexer lexer = new SAFLexer(charStream);
		
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SAFParser parser = new SAFParser(tokenStream);
		
		parser.statement();
		System.out.println("done");
	}

}