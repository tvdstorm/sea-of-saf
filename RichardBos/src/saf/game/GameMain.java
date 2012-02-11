package saf.game;

import saf.game.engine.GameEngine;
import saf.game.event.NewBotEvent;
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
		if(checkLoadedBots())
		{
			gameController.displayMessage("Load two bots before starting.");
			return;
		}
		
		GameEngine gameEngine = new GameEngine(gameState, gameController);
		
		String losingSide = gameEngine.battle();
		
		gameController.displayWinnerMessage(losingSide);
	}
	private boolean checkLoadedBots()
	{
		return gameState.getBotStates().size() != 2;
	}
	
}
