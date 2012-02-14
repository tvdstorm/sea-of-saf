package saf;

import java.util.LinkedList;

import saf.ast.Bot;
import saf.logic.Fight;
import saf.state.Game;
import saf.view.Main;

public class Program {

	public static void main(String[] args) {
		
		try {
			Bot left = Bot.deserialize(args[0]);
			Bot right = Bot.deserialize(args[1]);
			Game game = new Game();
			
			//Update the bots according to their behaviour rules for the first time.
			game.getLeftBot().update(left.getBehaviourRules(), new LinkedList());
			game.getRightBot().update(right.getBehaviourRules(), new LinkedList());
			
			Main view = new Main(game, left, right);
			
			Fight.start(game, left, right, view);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
