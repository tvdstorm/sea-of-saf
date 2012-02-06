package saf.game;

import saf.game.gui.GameController;
import saf.structure.Bot;

public class GameMain {
	private final GameController gameController;
	private final GameEventListener gameEventListener;
	private GameState gameState;
	
	public static void Start()
	{
		new GameMain();
	}
	
	private GameMain() {
		gameController = new GameController();
		gameEventListener = new GameEventListener(this);
		gameController.addGameEventListener(gameEventListener);
		gameState = new GameState();
	}

	public GameController getGameController() {
		return gameController;
	}
	
	public void NewBot(Bot bot, boolean isBotOne)
	{
		if(isBotOne)
		{
			gameState.setBotLeft(bot);
			gameController.setBotOne(bot);
		}
		else
		{
			gameState.setBotRight(bot);
			gameController.setBotTwo(bot);
		}
	}
	
}
