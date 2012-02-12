package saf.game;

import java.util.ArrayList;
import java.util.List;

import saf.game.gui.GameController;

public class GameState {
	public GameState(GameMain gameMain, GameController gameController) {
		this.gameController = gameController;
		this.listBotStates = new ArrayList<BotState>();
		this.distance = 350;
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
		System.out.println(listBotStates.size());
		this.listBotStates.add(botState);
		gameController.addBotState(botState);
	}

}