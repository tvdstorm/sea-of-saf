package saf.game;


import java.io.IOException;
import java.util.List;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import saf.DebugFunctions;
import saf.checker.ElementChecker;
import saf.game.event.NewBotEvent;
import saf.game.event.listener.iGameEventListener;
import saf.game.gui.GameController;
import saf.parser.SAFLexer;
import saf.parser.SAFParser;
import saf.parser.SAFParser.bots_return;
import saf.structure.Bots;

public class GameEventListener implements iGameEventListener {

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
			gameController.DisplayMessage("Invalid file selected, please select a valid bot file.");
			return;
		}

		CommonTokenStream tokens = new CommonTokenStream(lexer);
		SAFParser parser = new SAFParser(tokens);

		DebugFunctions DF = new DebugFunctions();

		try {
			bots_return _bots = parser.bots();
			Bots bots = _bots.bots;

			List<String> errors = ElementChecker.check(bots);

			if (errors.size() != 0) {

				String errorString = "The following errors have been found:";

				for (String error : errors) {
					errorString += "\n" + error;
				}
				gameController.DisplayMessage(errorString);
			} else if (bots.getBots().size() > 1)
				gameController.DisplayMessage("Only one bot is allowed.");
			else {
				gameMain.NewBot(bots.getBots().get(0), e.isBotOne());
				// DF.PrintAST(bots);
			}

		} catch (RecognitionException ex) {
			ex.printStackTrace();
		}
	}
}
