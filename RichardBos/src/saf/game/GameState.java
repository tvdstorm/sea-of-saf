package saf.game;

import java.util.ArrayList;
import java.util.List;

import saf.game.gui.GameController;

public class GameState {
	public GameState(GameMain gameMain)
	{
		this.gameController = gameMain.getGameController();
		this.listBotStates = new ArrayList<BotState>();
	}
	
	private List<BotState> listBotStates;
	private int Distance;
	private GameController gameController;
	
	
	public int getDistance() {
		return Distance;
	}
	public void setDistance(int distance) {
		Distance = distance;
		gameController.setDistance(Distance);
	}
	public void updateDistance(int dAmount)
	{
		Distance += dAmount;
		gameController.setDistance(Distance);
	}	

	public List<BotState> getListBotStates()
	{
		return this.listBotStates;
	}
	
	public void addBot(BotState botState) {
		this.listBotStates.add(botState);
		gameController.addBotState(botState);
	}

}