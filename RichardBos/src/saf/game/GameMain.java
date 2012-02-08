package saf.game;

import saf.game.gui.GameController;

public class GameMain {
	private final GameController gameController;
	private final GameEventListener gameEventListener;
	
	private GameState gameState;
	
	public static void Start()
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
	
	public void NewBot(BotState botState)
	{
		gameState.addBot(botState);
	}
	
}
