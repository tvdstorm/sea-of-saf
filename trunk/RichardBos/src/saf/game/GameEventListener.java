package saf.game;

import saf.game.event.NewBotEvent;
import saf.game.event.iEventListener;

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
