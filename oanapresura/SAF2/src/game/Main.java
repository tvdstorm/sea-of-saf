package game;

import java.awt.*;

import java.util.*;
import java.applet.*;
import java.net.*;
import grammar.*;
import draw.*;


public class Main{
	
	public static void main(String[] args) {
		
		FighterGrammar fg = new FighterGrammar();
		fg.run();
		
		//Game state according to fighter states
		GameState gs = new GameState(fg.saf.getBot1(),fg.saf.getBot2());

		//New game - visual part,drawn according to game state		
		Game game = new Game(gs);
		game.start();
		
	}
	
}
