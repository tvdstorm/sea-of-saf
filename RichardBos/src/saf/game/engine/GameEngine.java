package saf.game.engine;

import java.util.Timer;
import java.util.TimerTask;

import saf.game.GameMain;
import saf.game.gui.GameController;
import saf.game.state.BotState;
import saf.game.state.GameState;

public class GameEngine {
	private static final int CONST_MIN_ACTIONCOST = 9;
	private static final int CONST_TIMER_MS = 125;

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
		doTurnCycle();
	}

	private void doTurnCycle() {
		awardCredits();

		doTurns();

		String winner = checkForWinner();

		if (!winner.isEmpty())
			gameMain.battleOver(winner);
		else
			timer.schedule(new AdvanceTurn(), CONST_TIMER_MS);
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
			if (botStateFirst.getCredits() < botState.getCredits()
					|| ((botStateFirst.getCredits() == botState.getCredits() 
						&& botStateFirst.getSpeed() < botState.getSpeed()))) {
				botStateSecond = botStateFirst;
				botStateFirst = botState;
			} else if (botStateFirst.getCredits() == botState.getCredits()
					&& botStateFirst.getSpeed() < botState.getSpeed()) {

			} else {
				botStateSecond = botState;
			}
		}

		// Make the turns if enough credit is present
		if (botStateFirst.getCredits() > CONST_MIN_ACTIONCOST)
			new GameTurn(botStateFirst, gameState, gameController);
		if (botStateSecond.getCredits() > CONST_MIN_ACTIONCOST)
			new GameTurn(botStateSecond, gameState, gameController);
	}

	private String checkForWinner() {
		BotState winnerState = null;
		BotState loserState = null;
		for (BotState botState : gameState.getBotStates()) {
			if (botState.getHitpoints() == 0) {
				loserState = botState;
			} else {
				winnerState = botState;
			}
		}

		if (loserState != null)
			return winnerState.getBot().getName();
		else
			return "";
	}

	class AdvanceTurn extends TimerTask {
		@Override
		public void run() {
			doTurnCycle();
		}
	}

}