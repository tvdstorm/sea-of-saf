package saf;

import saf.bot.GameBot;
import saf.game.Game;

public class Tester {
	private static void testBadSyntax() {
		@SuppressWarnings("unused")
		GameBot bot = Loader.getBotFromFile("src/saf/tests/bad_syntax.saf");		
	}	
	
	private static void testBadFileName() {
		@SuppressWarnings("unused")
		GameBot bot = Loader.getBotFromFile("src/saf/tests/badfilename.saf");		
	}
	
	private static void testBadBotLoading() {
    	@SuppressWarnings("unused")
		GameBot bot;
    	bot = Loader.getBotFromFile("src/saf/tests/bad_attack.saf");
        bot = Loader.getBotFromFile("src/saf/tests/bad_condition.saf");
        bot = Loader.getBotFromFile("src/saf/tests/bad_everything.saf");
        bot = Loader.getBotFromFile("src/saf/tests/bad_move.saf");
        bot = Loader.getBotFromFile("src/saf/tests/bad_strength.saf");		
	}
		
	private static void testGame() {
		GameBot bot1 = Loader.getBotFromFile("src/saf/tests/jackieChan.saf");
		GameBot bot2 = Loader.getBotFromFile("src/saf/tests/geneticFighter.saf");
        Game game = new Game(bot1, bot2);
        game.runGUIWithText();  
	}
	
    public static void main(String[] args) {
    	testBadBotLoading();
    	testBadFileName();
    	testBadSyntax();
    	testGame();
     }   
}
