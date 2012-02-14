package saf.game.state;

import java.util.ArrayList;
import java.util.List;

import saf.game.GameMain;
import saf.game.gui.GameController;

public class GameState {
	
	public GameState(int startingDistance) {
		this.listBotStates = new ArrayList<BotState>();
		this.distance = startingDistance;
	}

	private List<BotState> listBotStates;
	private int distance;

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public void updateDistance(int dAmount) {
		distance += dAmount;
	}

	public List<BotState> getBotStates() {
		return this.listBotStates;
	}

	public void addBot(BotState botState) {
		for (BotState state : listBotStates) {
			if (state.getSide().equals(botState.getSide())) {
				listBotStates.remove(state);
				break;
			}
		}
		this.listBotStates.add(botState);
	}

}