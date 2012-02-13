package saf.game.state;

import java.util.ArrayList;
import java.util.List;

import saf.game.GameMain;
import saf.game.gui.GameController;

public class GameState {
	private static final int CONST_DISTANCE = 350;

	public GameState(GameMain gameMain, GameController gameController) {
		this.gameController = gameController;
		this.listBotStates = new ArrayList<BotState>();
		this.distance = CONST_DISTANCE;
		
		gameController.setDistance(distance);
	}

	private List<BotState> listBotStates;
	private GameController gameController;
	private int distance;

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
		gameController.setDistance(distance);
	}

	public void updateDistance(int dAmount) {
		distance += dAmount;
		gameController.setDistance(distance);
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
		gameController.addBotState(botState);
	}

	public void PrepareBattle() {
		//Reload the botstates
		List<BotState> copyBotStates = new ArrayList<BotState>(listBotStates);
		
		for (BotState botState : copyBotStates) {
			addBot(new BotState(botState.getBot(), botState.getSide(), this.gameController));
		}
		
	}

}