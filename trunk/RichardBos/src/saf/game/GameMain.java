package saf.game;

import saf.game.gui.GameController;

public class GameMain {
	private final GameController gameController;
	private final GameEventListener gameEventListener;
	
	private GameState gameState;
	
	public static void start()
	{
		new GameMain();
	}
	
	private GameMain() {
		gameEventListener = new GameEventListener(this);
		gameController = new GameController(gameEventListener);
		gameState = new GameState(this);
	}

	public GameController getGameController() {
		return gameController;
	}
	
	public void newBot(BotState botState)
	{
		gameState.addBot(botState);
	}
	
	public void startGame()
	{
		if(checkLoadedBots())
		{
			gameController.displayMessage("Load two bots before starting.");
			return;
		}
		
	}
	private boolean checkLoadedBots()
	{
		return gameState.getListBotStates().size() != 2;
	}
	
}
