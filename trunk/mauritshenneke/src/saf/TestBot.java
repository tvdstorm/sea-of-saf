package saf;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import saf.evaluators.*;


public class TestBot {

	public static void main(String[] args) throws RecognitionException {
		CharStream charStream = new ANTLRStringStream( "JackieChan \n" +
										                "{ \n" +
										                "kickPower = 7 \n" +
										                "punchPower = 5 \n" +
										                "kichReach = 3 \n" +
										                "punchReach = 4 \n" +
										                "far and weaker[run_towards punch_high] \n" +
										                "near[choose(stand crouch) kick_high] \n     "+
										                "much_stronger[walk_towards punch_low] \n     "+
										                "weaker[run_away choose(block_high block_low)] \n     "+
										                "always[walk_toward block_high] \n     "+
										                "} \n");
        BotLexer lexer = new BotLexer(charStream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        BotParser botParser = new BotParser(tokenStream);
        Bot bot = botParser.create();
        System.out.println(bot.toString());
        System.out.println("Done!");
	}

}