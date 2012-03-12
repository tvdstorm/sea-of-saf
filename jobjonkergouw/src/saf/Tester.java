package saf;

import saf.ast.nodes.Fighter;
//import saf.bot.GameBot;
//import saf.game.Game;

public class Tester {
	private static void testAST() {
		TestLoader.printASTFromFile("src/saf/tests/chicken.saf");
		TestLoader.printASTFromFile("src/saf/tests/chuckNorris.saf");
		TestLoader.printASTFromFile("src/saf/tests/geneticFighter.saf");
		TestLoader.printASTFromFile("src/saf/tests/jackieChan.saf");
		
		TestLoader.printASTFromFile("src/saf/tests/bad_attack.saf");
		TestLoader.printASTFromFile("src/saf/tests/bad_condition.saf");
		TestLoader.printASTFromFile("src/saf/tests/bad_everything.saf");
		TestLoader.printASTFromFile("src/saf/tests/bad_move.saf");
		TestLoader.printASTFromFile("src/saf/tests/bad_strength.saf");

	}
	
	private static void testBadSyntax() {
		@SuppressWarnings("unused")
		Fighter fighter = Loader.getBotFromFile("src/saf/tests/bad_syntax.saf");		
	}	
	
	private static void testBadFileName() {
		@SuppressWarnings("unused")
		Fighter fighter = TestLoader.getBotFromFile("src/saf/tests/badfilename.saf");		
	}
	
	private static void testBadBotLoading() {
    	@SuppressWarnings("unused")
		Fighter bot;
    	bot = TestLoader.getBotFromFile("src/saf/tests/bad_attack.saf");
        bot = TestLoader.getBotFromFile("src/saf/tests/bad_condition.saf");
        bot = TestLoader.getBotFromFile("src/saf/tests/bad_everything.saf");
        bot = TestLoader.getBotFromFile("src/saf/tests/bad_move.saf");
        bot = TestLoader.getBotFromFile("src/saf/tests/bad_strength.saf");		
	}
	
    public static void main(String[] args) {
    	System.out.println("Testing AST:");    	
    	testAST();
    	System.out.println("Testing loading and validating of bad files:");
    	testBadBotLoading();
    	System.out.println("Testing bad file name:");
    	testBadFileName();
    	System.out.println("Testing bad syntax:");
    	testBadSyntax();
     }   
}
