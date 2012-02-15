package saf;

import saf.ast.Bot;
import saf.logic.Fight;
import saf.state.BotState.Position;
import saf.state.BotState;
import saf.view.MainView;

public class Main {

	public static void main(String[] args) {
		
		try {
			Bot left = Bot.deserialize(args[0]);
			Bot right = Bot.deserialize(args[1]);
			
			BotState leftState = new BotState(Position.LEFT, left.getBehaviourRules());
			BotState rightState = new BotState(Position.RIGHT, right.getBehaviourRules());
			
			MainView view = new MainView(left, leftState, right, rightState);
			
			Fight fight = new Fight(left, leftState, right, rightState, view);
			fight.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
