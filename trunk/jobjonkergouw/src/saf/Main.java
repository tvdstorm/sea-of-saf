package saf;

import saf.Loader;

import saf.bot.GameBot;
import saf.game.Game;

public class Main {

    public static void main(String[] args) {
    	
    	GameBot bot1 = Loader.getBotFromFile("src/saf/tests/chuckNorris.saf");
    	GameBot bot2 = Loader.getBotFromFile("src/saf/tests/jackieChan.saf");

        Game game = new Game(bot1, bot2);
        game.runGUIWithText();  
     }   
}