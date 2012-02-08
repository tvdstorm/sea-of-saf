package saf.game;


import java.io.IOException;
import java.util.List;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import saf.checker.ElementChecker;
import saf.game.event.NewBotEvent;
import saf.game.event.iEventListener;
import saf.game.gui.GameController;
import saf.parser.SAFLexer;
import saf.parser.SAFParser;
import saf.parser.SAFParser.bots_return;
import saf.structure.Bots;

public class GameEventListener implements iEventListener {

	private final GameController gameController;
	private final GameMain gameMain;

	public GameEventListener(GameMain gameMain) {
		this.gameMain = gameMain;
		this.gameController = gameMain.getGameController();
	}

	@Override
	public void handleNewBot(NewBotEvent e) {

		SAFLexer lexer;

		try {
			lexer = new SAFLexer(new ANTLRFileStream(e.getPath()));
		} catch (IOException e1) {
			gameController.displayMessage("Invalid file selected, please select a valid bot file.");
			return;
		}

		CommonTokenStream tokens = new CommonTokenStream(lexer);
		SAFParser parser = new SAFParser(tokens);

		try {
			bots_return _bots = parser.bots();
			Bots bots = _bots.bots;

			List<String> errors = ElementChecker.check(bots);

			if (errors.size() != 0) {

				String errorString = "The following errors have been found:";

				for (String error : errors) {
					errorString += "\n" + error;
				}
				gameController.displayMessage(errorString);
			} 
			else if (bots.getBots().size() > 1)
				gameController.displayMessage("Only one bot is allowed.");
			else {
				BotState botState = new BotState(bots.getBots().get(0), e.getSide(),gameController);
				gameMain.NewBot(botState);
			}

		} catch (RecognitionException ex) {
			ex.printStackTrace();
		}
	}
}
