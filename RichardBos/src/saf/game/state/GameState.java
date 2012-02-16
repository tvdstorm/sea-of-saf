package saf.game.state;

import java.util.ArrayList;
import java.util.List;

import saf.game.GameConstant;
import saf.structure.Bot;
import saf.structure.Bots;

public class GameState implements GameConstant {
	
	public GameState() {
		this.listBotStates = new ArrayList<BotState>();
		this.distance = CONST_STARTING_DISTANCE;
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

	public void resetGame()
	{
		this.listBotStates.clear();
		this.distance = CONST_STARTING_DISTANCE;
	}

}