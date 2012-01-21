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
		CharStream charStream = new ANTLRStringStream("" + 
			"JackieChan{\r\n" + 
			"	kickPower = 7\r\n" + 
			"	punchPower = 5\r\n" + 
			"	kickReach = 3\r\n" + 
			"	punchReach = 9\r\n" + 
			"	far[run_towards punch_high]\r\n" + 
			"	near[choose(stand crouch) kick_high]\r\n" + 
			"	much_stronger[walk_towards punch_low]\r\n" + 
			"	weaker[run_away choose(block_high block_low)]\r\n" + 
			"	always[walk_towards block_high]\r\n" +
			"}");
		SAFLexer lexer = new SAFLexer(charStream);
		
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SAFParser parser = new SAFParser(tokenStream);
		
		parser.fighter();
		Fighter f = parser.getFighter();
		System.out.println(f.toString());
	}

}