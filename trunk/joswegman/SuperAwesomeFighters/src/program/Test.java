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
				"kickPower = 6 \n" +
				"punchReach = 4 \n" +
				"near [ stand punch_low] \n" +
				"stronger [run_towards block_high] \n" +
				"always [ choose (jump stand) kick_high] \n	"+
				"} \n");
		SafLexer lexer = new SafLexer(charStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SafParser parser = new SafParser(tokenStream);
		Bot bot = parser.bot();
		System.out.println("done: " + bot.toString());
		System.out.println();
		
	}

}
