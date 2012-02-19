package nl.uva.lap.saf;

import nl.uva.lap.saf.ast.fighter.Fighter;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

public class Test
{
	@SuppressWarnings("unused")
	private static String pietje = "" + 
			"pietje{\r\n" + 
			"	kickPower = 7\r\n" + 
			"(near and far) and (near and far) [crouch]" + 
			"}";
	
	@SuppressWarnings("unused")
	private static String jackieChan = "" + 
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
			"}";
	
	@SuppressWarnings("unused")
	private static String jetLi= "" + 
		"jetLi{\r\n" + 
		"	kickReach=9\r\n" + 
		"	stronger[choose(jump run_away) choose(kick_low block_low)]\r\n" + 
		"	far or much_weaker[choose(crouch run_towards) choose(punch_low punch_high)]\r\n" + 
		"	always[crouch kick_low]\r\n" + 
		"}";

	public static void main(String[] args) throws RecognitionException
	{
		CharStream charStream = new ANTLRStringStream(Test.pietje);
		SAFLexer lexer = new SAFLexer(charStream);
		
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SAFParser parser = new SAFParser(tokenStream);
		
		Fighter fighter = parser.fighter();
		System.out.println(fighter.toString());
	}
}