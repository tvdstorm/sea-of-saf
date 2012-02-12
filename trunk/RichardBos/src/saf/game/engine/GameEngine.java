package saf.game.engine;

import java.util.Timer;
import java.util.TimerTask;

import saf.game.BotState;
import saf.game.GameMain;
import saf.game.GameState;
import saf.game.gui.GameController;

public class GameEngine {

	public GameEngine(GameState gameState, GameController gameController, GameMain gameMain) {
		this.gameMain = gameMain;
		this.gameState = gameState;
		this.gameController = gameController;
		this.timer = new Timer();
	}

	private final GameState gameState;
	private final GameController gameController;
	private final GameMain gameMain;
	private final Timer timer;
	
	public void battle() {
		timer.schedule(new AdvanceTurn(), 1);
	}
	
		private void awardCredits() {
		for (BotState botState : gameState.getBotStates()) {
			botState.updateCredits();
		}
	}

	private void doTurns() {
		BotState botStateFirst = null;
		BotState botStateSecond = null;

		// Determine which bot has the most credits, this bot moves first
		for (BotState botState : gameState.getBotStates()) {
			if (botStateFirst == null) {
				botStateFirst = botState;
				continue;
			}
			if (botStateFirst.getCredits() < botState.getCredits()) {
				botStateSecond = botStateFirst;
				botStateFirst = botState;
			} else {
				botStateSecond = botState;
			}
		}

		// Make the turns if enough credit is present
		if (botStateFirst.getCredits() > 9)
			new GameTurn(botStateFirst, gameState, gameController);
		if (botStateSecond.getCredits() > 9)
			new GameTurn(botStateSecond, gameState, gameController);
	}

	private String checkForWinner() {
		BotState winnerState = null;
		BotState loserState = null;
		for (BotState botState : gameState.getBotStates()) {
			if (botState.getHitpoints() == 0) {
				loserState = botState;
			}
			else
			{
				winnerState = botState;
			}
		}
		if(loserState != null)
			return winnerState.getBot().getName();
		else
			return "";
	}

	class AdvanceTurn extends TimerTask
	{
		@Override
		public void run() {
			awardCredits();

			doTurns();

			String winner = checkForWinner();
			
			if(!winner.isEmpty())
				gameMain.battleOver(winner);
			else
				timer.schedule(new AdvanceTurn(), 25);
		}		
	}
}