
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.JAXBException;

import ast.Bot;

import state.Game;
import view.Main;
import logic.Fight;

public class Program {

	public static void main(String[] args) {
		
		try {
			Bot left = Bot.deserialize(args[0]);
			Bot right = Bot.deserialize(args[1]);
			Game game = new Game();
			
			game.getLeftBot().update(left.getBehaviourRules(), new LinkedList());
			game.getRightBot().update(right.getBehaviourRules(), new LinkedList());
			
			Main view = new Main(game, left, right);
			
			Fight.start(game, left, right, view);
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}
}
