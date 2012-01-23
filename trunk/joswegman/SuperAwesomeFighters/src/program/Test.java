package program;

import org.antlr.runtime.ANTLRStringStream;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import grammar.SafLexer;
import grammar.SafParser;
import grammar.Evaluators.*;


public class Test {

	
	public static void main(String[] args) throws RecognitionException {
		CharStream charStream = new ANTLRStringStream( "Sample \n" +
				"{ \n" +
				"kickPower = 6 " +
				"punchReach = 4 \n" +
				"near [ stand punch_low] \n" +
				"stronger [run_towards block_high] \n" +
				"always [ choose (jump stand) kick_high] \n	"+
				"} \n");
		SafLexer lexer = new SafLexer(charStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SafParser parser = new SafParser(tokenStream);
		//parser.bot();
		Bot b = parser.bot();
		System.out.println("done: " + b.toString());
		System.out.println();

		
		CharStream charStream1 = new ANTLRStringStream( "Test \n" +
				"{ \n" +
				"kickPower = 2 " +
				"punchReach = 8 \n" +
				"near [ walk punch_high] \n" +
				"stronger [run_away block_low] \n" +
				"always [ choose (jump stand) kick_high] \n	"+
				"} \n");
		SafLexer lexer1 = new SafLexer(charStream1);
		TokenStream tokenStream1 = new CommonTokenStream(lexer1);
		SafParser parser1 = new SafParser(tokenStream1);
		//parser1.bot();
		Bot b1 = parser1.bot();
		System.out.println("done: " + b1.toString());
		System.out.println();

		
	}

}
