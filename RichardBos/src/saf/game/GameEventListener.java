package saf.game;

import java.io.IOException;
import java.util.List;

import saf.checker.ElementChecker;
import saf.game.event.NewBotEvent;
import saf.game.event.iEventListener;
import saf.game.gui.GameController;
import saf.game.state.BotState;
import saf.parser.FileParser;
import saf.structure.Bots;

public class GameEventListener implements iEventListener {

	private final GameMain gameMain;

	public GameEventListener(GameMain gameMain) {
		this.gameMain = gameMain;
	}

	private GameController getGameController() {
		return gameMain.getGameController();
	}

	@Override
	public void handleNewBot(NewBotEvent e) {

		Bots bots = null;

		try {
			bots = FileParser.consume(e.getPath());
		} catch (IOException ex) {
			getGameController().displayMessage("An error occured while parsing the file: \n" + e.getPath());
			getGameController().displayMessage(ex.toString());
			ex.printStackTrace();
		}

		List<String> errors = ElementChecker.check(bots);

		if (errors.size() != 0) {

			String errorString = "The following errors have been found:";
			for (String error : errors) {
				errorString += "\n" + error;
			}
			getGameController().displayMessage(errorString);
		} else if (bots.getBots().size() > 1)
			getGameController().displayMessage("Only one bot is allowed.");

		BotState botState = new BotState(bots.getBots().get(0), e.getSide(), getGameController());
		gameMain.newBot(botState);
	}

	@Override
	public void handleStartGame() {
		gameMain.startGame();
	}
}
