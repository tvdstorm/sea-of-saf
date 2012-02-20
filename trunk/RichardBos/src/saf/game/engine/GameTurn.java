package saf.game.engine;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import saf.game.GameConstant;
import saf.game.gui.GameController;
import saf.game.state.BotState;
import saf.game.state.GameState;
import saf.structure.Action;
import saf.structure.Behavior;
import saf.structure.intelligence.BehaviorIntelligence;

public class GameTurn implements GameConstant {

	protected BotState botState;
	protected GameState gameState;
	private boolean winner;
	private Random random;
	private GameController gameController;
	
	protected GameTurn()
	{ /*used in GameTurnTest unit test*/ }
	
	public GameTurn(BotState botState, GameState gameState, GameController gameController) {
		this.botState = botState;
		this.gameState = gameState;
		this.random = new Random();
		this.gameController = gameController;
		this.winner = false;
		doTurn();
	}

	public boolean isWinner() {
		return winner;
	}

	private void doTurn() {
		processTurnCost();

		List<Behavior> behaviors = collectValidBehaviors();

		Behavior behavior = (Behavior) choose(behaviors);

		Action moveAction = (Action) choose(behavior.getMoveAction());

		Action fightAction = (Action) choose(behavior.getFightAction());

		executeActions(moveAction.getValue(), fightAction.getValue());

		botState.setLastMoveAction(moveAction.getValue());
		botState.setLastFightAction(fightAction.getValue());
	}

	private void processTurnCost() {
		// TODO wish: define a different cost for all actions
		botState.updateCredits(-10);
	}

	private int getRandomIndex(int size) {
		return (int) (random.nextDouble() * size);
	}

	protected List<Behavior> collectValidBehaviors() {


		List<Behavior> validBehaviors = new ArrayList<Behavior>();

		for (Behavior behavior : botState.getBot().getBehaviors()) {
			if (BehaviorIntelligence.checkBehaviorInGameState(behavior, botState, gameState))
				validBehaviors.add(behavior);
		}

		return validBehaviors;
	}

	private <T> Object choose(List<T> list) {
		int index = getRandomIndex(list.size());

		return list.get(index);
	}

	private void executeActions(String moveAction, String fightAction) {

		MoveActionProcessor actionProcessor = new MoveActionProcessor(gameState.getDistance(), moveAction, botState.getDistanceFromWall(), botState.isJumping());
		Point dMoves = actionProcessor.getOutcome();

		// Update distance, increase if bot is moving away, decrease if bot is
		gameState.updateDistance(-dMoves.x);
		gameController.setDistance(gameState.getDistance());
		
		botState.updateDistanceFromWall(dMoves.x);

		gameController.executeActions(botState.getSide(), dMoves, fightAction);

		processFightAction(moveAction, fightAction);
	}



	private void processFightAction(String moveAction, String fightAction) {
		BotState otherBotState = null;
		for (BotState state : gameState.getBotStates()) {
			if (!state.equals(botState)) {
				otherBotState = state;
			}
		}

		FightActionProcessor actionProcessor = new FightActionProcessor(botState, otherBotState, gameState.getDistance(), fightAction, moveAction.equals(MOVE_ACTION_JUMP));
		double attackPower = actionProcessor.getOutcome();

		otherBotState.updateHitpoints(attackPower);
		gameController.setHitpoints(otherBotState);
		
		if(otherBotState.getHitpoints() <= 0)
			this.winner = true;
	}
}
