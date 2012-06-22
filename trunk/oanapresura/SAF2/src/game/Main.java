package game;

import grammar.FighterGrammar;
import draw.Game;


public class Main{
	
	public static void main(String[] args) {
		
		FighterGrammar fg = new FighterGrammar();
		int result = fg.run();
		
		if (result == 0){
			/*Game state according to fighter states*/
			GameState gs = new GameState(fg.getSaf().getBot1(),fg.getSaf().getBot2());
	
			/*New game - visual part,drawn according to game state*/		
			Game game = new Game(gs);
			game.start();
		}
	}
	
}
