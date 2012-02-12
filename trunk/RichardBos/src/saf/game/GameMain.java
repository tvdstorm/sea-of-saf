package saf.game;

import saf.game.engine.GameEngine;
import saf.game.event.NewBotEvent;
import saf.game.gui.GameController;

public class GameMain {
	private GameController gameController;
	private GameEventListener gameEventListener;
	private GameState gameState;
	private boolean GamePlayedBefore = false;;

	public static void start()
	{
		new GameMain();
	}
	
	private GameMain() {
		gameEventListener = new GameEventListener(this);
		gameController = new GameController(gameEventListener);
		gameState = new GameState(this, gameController);
		
		if(GameConstant.DEBUG_STATUS)
		{
			NewBotEvent e = new NewBotEvent(this, "C:\\Users\\Richard\\Documents\\AAwesome BOTS\\chicken.txt", "left");
			gameEventListener.handleNewBot(e);
			
			e = new NewBotEvent(this, "C:\\Users\\Richard\\Documents\\AAwesome BOTS\\ChuckNorris.txt", "right");
			gameEventListener.handleNewBot(e);
		}
		
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
		if(GamePlayedBefore)
		{
			return;
		}
		
		if(checkLoadedBots())
		{
			gameController.displayMessage("Load two bots before starting.");
			return;
		}

		GameEngine gameEngine = new GameEngine(gameState, gameController,this);
		gameEngine.battle();
		GamePlayedBefore = true;
	}
	private boolean checkLoadedBots()
	{
		return gameState.getBotStates().size() != 2;
	}
	
	public void battleOver(String winnerName)
	{
		gameController.displayMessage(GameConstant.WINNER_MESSAGE + winnerName);
	}
	
}
