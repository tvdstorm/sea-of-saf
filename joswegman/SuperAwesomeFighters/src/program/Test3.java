package program;

import org.antlr.runtime.ANTLRStringStream;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import grammar.SafLexer;
import grammar.SafParser;
import grammar.Evaluators.*;


public class Test3 {

	
	public static void main(String[] args) throws RecognitionException {
		CharStream charStream = new ANTLRStringStream( "3  * (5 + 4) * 3");
		SafLexer lexer = new SafLexer(charStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SafParser parser = new SafParser(tokenStream);
		Bot bot = parser.bot();
		System.out.println("done: " + bot.toString());
		System.out.println();
		

	}

}
