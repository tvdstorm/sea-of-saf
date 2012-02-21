package nl.uva.lap.saf;

import java.util.List;

import nl.uva.lap.saf.arena.Arena;
import nl.uva.lap.saf.arena.State;
import nl.uva.lap.saf.ast.evaluator.Evaluator;
import nl.uva.lap.saf.ast.evaluator.Message;
import nl.uva.lap.saf.ast.fighter.Fighter;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

public class Test
{
	private static String pietje = "" + 
			"pietje{\r\n" + 
			"	kickPower = 7\r\n" + 
			"	far [crouch]" +
			"	near [jump]" + 
			"	always [stand]" +
			"}";
	
	private static String jantje = "" + 
			"jantje{\r\n" + 
			"	kickPower = 7\r\n" + 
			"	far [run_towards]" +
			"	near [walk_away]" +
			"	always [stand]" +
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
	
	private static Fighter loadFighter(String fighter)
	{
		CharStream charStream = new ANTLRStringStream(fighter);
		SAFLexer lexer = new SAFLexer(charStream);
		
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SAFParser parser = new SAFParser(tokenStream);
		
		Fighter fighter1 = null;
		try
		{
			return parser.fighter();
		}
		catch (RecognitionException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fighter1;
	}
	
	private static void evaluate(Fighter fighter)
	{
		List<Message> messages = Evaluator.evaluate(fighter);
		for(Message message : messages)
			System.out.println(message.getMessage());
	}

	public static void main(String[] args)
	{
		Fighter fighter1 = loadFighter(Test.pietje);
		Fighter fighter2 = loadFighter(Test.jantje);
		
		evaluate(fighter1);
		evaluate(fighter2);
		System.out.println(fighter1.toString());
		System.out.println(fighter2.toString());
		
		State state = new State(fighter1, fighter2);
		Arena arena = new Arena(state);
		arena.run();
		
	}
}