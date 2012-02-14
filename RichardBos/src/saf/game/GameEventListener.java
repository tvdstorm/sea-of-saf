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

	@Override
	public void handleNewBot(NewBotEvent e) {
		gameMain.newBot(e);
	}

	@Override
	public void handleStartGame() {
		gameMain.startGame();
	}
}
