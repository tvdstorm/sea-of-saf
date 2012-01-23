package saf;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import saf.classes.*;

public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws RecognitionException {
		// TODO Auto-generated method stub
		CharStream charStream = new ANTLRStringStream(
				"JackieChan\n" +
				"{\n" +
				  "kickPower = 7\n" +
				  "punchPower = 5\n" +
				  "kickReach = 3\n" +
				  "punchReach = 9\n" +
				  "far[run_towards punch_high]\n" +
				  "near[choose(stand crouch) kick_high]\n" +
				  "much_stronger[walk_towards punch_low]\n" +
				  "weaker[run_away choose(block_high block_low)]\n" +
				  "always[walk_towards block_high]\n" +
				"}"
				);
		
		SAFLexer lexer = new SAFLexer(charStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SAFParser botParser = new SAFParser(tokenStream);
		Bot bot = botParser.bot();
		System.out.println("Done!");
	}

}
