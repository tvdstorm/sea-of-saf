package saf.game;

import java.util.List;

import saf.checker.ElementChecker;
import saf.game.engine.GameEngine;
import saf.game.event.NewBotEvent;
import saf.game.gui.GameController;
import saf.game.state.BotState;
import saf.game.state.GameState;
import saf.parser.FileParser;
import saf.structure.Bot;
import saf.structure.Bots;

public class GameMain implements GameConstant {
	private GameController gameController;
	private GameEventListener gameEventListener;
	private GameState gameState;

	public static void start() {
		new GameMain();
	}

	private GameMain() {
		gameEventListener = new GameEventListener(this);
		gameController = new GameController(gameEventListener);
		gameState = new GameState();
		
		if (DEBUG_STATUS) {
			NewBotEvent e = new NewBotEvent(this,
					"src\\saf\\tests\\ChuckNorris.txt", CONST_LEFT);
			gameEventListener.handleNewBot(e);

			e = new NewBotEvent(this, "src\\saf\\tests\\ChuckNorris.txt",
					CONST_RIGHT);
			gameEventListener.handleNewBot(e);
		}

	}

	public void newBot(NewBotEvent e) {
		Bots bots = null;

		bots = FileParser.consume(e.getPath());

		List<String> errors = ElementChecker.check(bots);

		if (errors.size() != 0) {

			String errorString = "The following errors have been found:";
			for (String error : errors) {
				errorString += "\n" + error;
			}
			gameController.displayMessage(errorString);
			return;
		} else if (bots.getBots().size() > 1) {
			gameController.displayMessage("Only one bot is allowed.");
			return;
		}

		//We're sure it has one, and only one.
		BotState botState = new BotState(bots.getBots().get(0), e.getSide());

		gameState.addBot(botState);
		gameController.addBotState(botState);
	}

	public void startGame() {
		if (checkLoadedBots()) {
			gameController.displayMessage("Load two bots before starting.");
			return;
		}
		gameController.setButtonsEnabled(false);
		GameEngine gameEngine = new GameEngine(gameState, gameController, this);
		gameEngine.battle();
	}

	private boolean checkLoadedBots() {
		return gameState.getBotStates().size() != 2;
	}

	public void battleOver(String winnerName) {
		gameController.displayMessage(WINNER_MESSAGE + winnerName);
		gameController.resetGame();
		
		//remember the current bots
		BotState[] botStates = {};
		botStates = gameState.getBotStates().toArray(botStates);
		gameState.resetGame();
		
		for (BotState botState : botStates) {
			BotState newBotState = new BotState(botState.getBot(), botState.getSide());

			gameState.addBot(newBotState);
			gameController.addBotState(newBotState);
		}
		
		gameController.setButtonsEnabled(true);
	}

}
