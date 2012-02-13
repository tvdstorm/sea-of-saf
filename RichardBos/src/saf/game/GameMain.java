package saf.game;

import saf.game.engine.GameEngine;
import saf.game.event.NewBotEvent;
import saf.game.gui.GameController;
import saf.game.state.BotState;
import saf.game.state.GameState;

public class GameMain implements GameConstant {
	private GameController gameController;
	private GameEventListener gameEventListener;
	private GameState gameState;

	public static void start()
	{
		new GameMain();
	}
	
	private GameMain() {
		gameEventListener = new GameEventListener(this);
		gameController = new GameController(gameEventListener);
		gameState = new GameState(this, gameController);
		
		if(DEBUG_STATUS)
		{
			NewBotEvent e = new NewBotEvent(this, "\\\\Srv-file\\users\\r.bos\\Documenten\\Bots\\chicken.txt", "left");
			gameEventListener.handleNewBot(e);
			
			e = new NewBotEvent(this, "\\\\Srv-file\\users\\r.bos\\Documenten\\Bots\\ChuckNorris.txt", "right");
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
		gameController.disableButtons();
		GameEngine gameEngine = new GameEngine(gameState, gameController,this);
		gameEngine.battle();
	}
	private boolean checkLoadedBots()
	{
		return gameState.getBotStates().size() != 2;
	}
	
	public void battleOver(String winnerName)
	{
		gameController.displayMessage(WINNER_MESSAGE + winnerName);
	}
	
}
