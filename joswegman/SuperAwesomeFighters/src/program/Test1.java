package program;

import org.antlr.runtime.ANTLRStringStream;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import grammar.Saf1Lexer;
import grammar.Saf1Parser;


public class Test1 {

	
	public static void main(String[] args) throws RecognitionException {
		CharStream charStream = new ANTLRStringStream( "3  * (5 + 4) * 3");
		Saf1Lexer lexer = new Saf1Lexer(charStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		Saf1Parser parser = new Saf1Parser(tokenStream);
		parser.bot();
		System.out.println("done: ");
		System.out.println();
		

	}

}
