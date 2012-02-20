package saf.game.engine;

import java.util.Timer;
import java.util.TimerTask;

import saf.game.GameConstant;
import saf.game.GameMain;
import saf.game.gui.GameController;
import saf.game.state.BotState;
import saf.game.state.GameState;

public class GameEngine implements GameConstant {

	protected GameEngine() {
		// Used in unitTest: "GameEngineTest"
		this.gameMain = null;
		this.gameState = new GameState();
		this.gameController = null;
		this.timer = null;
	}

	public GameEngine(GameState gameState, GameController gameController,
			GameMain gameMain) {
		this.gameMain = gameMain;
		this.gameState = gameState;
		this.gameController = gameController;
		this.timer = new Timer();
	}

	protected final GameState gameState;
	protected final GameMain gameMain;
	private final GameController gameController;
	private final Timer timer;

	private BotState botStateFirst = null;
	private BotState botStateSecond = null;

	public void battle() {
		doTurnCycle();
	}

	private void doTurnCycle() {
		awardCredits();

		String winner = doTurns();

		if (!winner.isEmpty())
			gameMain.battleOver(winner);
		else
			timer.schedule(new AdvanceTurn(), CONST_TIMER_MS);
	}

	protected void awardCredits() {
		for (BotState botState : gameState.getBotStates()) {
			botState.updateCredits();
		}
	}

	private String doTurns() {

		getFirstAndSecondBotState();

		// Make the turns if enough credit is present
		if (makeTurn(botStateFirst))
			return botStateFirst.getBot().getName();

		if (makeTurn(botStateSecond))
			return botStateSecond.getBot().getName();

		return ""; // No winner yet
	}

	private void getFirstAndSecondBotState() {

		// Determine which bot has the most credits, this bot moves first
		for (BotState botState : gameState.getBotStates()) {
			if (botStateFirst == null) {
				botStateFirst = botState;
				continue;
			}
			if (botStateFirst.getCredits() < botState.getCredits()
					|| ((botStateFirst.getCredits() == botState.getCredits() && botStateFirst
							.getSpeed() < botState.getSpeed()))) {
				botStateSecond = botStateFirst;
				botStateFirst = botState;
			} else if (botStateFirst.getCredits() == botState.getCredits()
					&& botStateFirst.getSpeed() < botState.getSpeed()) {

			} else {
				botStateSecond = botState;
			}
		}

	}

	private boolean makeTurn(BotState botState) {
		if (botState.getCredits() > CONST_MIN_ACTIONCOST) {
			GameTurn gameTurn = new GameTurn(botState, gameState,
					gameController);
			if (gameTurn.isWinner())
				return true;
		}
		return false;
	}

	public void resetGame() {
		gameState.resetGame();
		gameController.resetGame();
	}

	class AdvanceTurn extends TimerTask {
		@Override
		public void run() {
			doTurnCycle();
		}
	}

}