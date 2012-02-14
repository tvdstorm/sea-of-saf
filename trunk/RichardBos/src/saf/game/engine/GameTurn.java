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

	private Random random;
	private BotState botState;
	private GameState gameState;
	private GameController gameController;

	public GameTurn(BotState botState, GameState gameState, GameController gameController) {
		this.botState = botState;
		this.gameState = gameState;
		this.random = new Random();
		this.gameController = gameController;
		doTurn();
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
		// TODO define a diff cost for all actions
		botState.updateCredits(-10);
	}

	private int getRandomIndex(int size) {
		return (int) (random.nextDouble() * size);
	}

	private List<Behavior> collectValidBehaviors() {

		// TODO test this for all cases

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

		FightActionProcessor actionProcessor = new FightActionProcessor(botState, otherBotState, gameState.getDistance(), fightAction, moveAction.equals(MOVE_TYPE_JUMP));
		double attackPower = actionProcessor.getOutcome();

		
		if (DEBUG_STATUS && attackPower > 0) {
			System.out.println();
			System.out.println(botState.getBot().getName() + ", " + moveAction + " - " + fightAction);
			System.out.println("vs " + otherBotState.getLastMoveAction() + " - " + otherBotState.getLastFightAction());
		}
		
		otherBotState.updateHitpoints(attackPower);
		gameController.setHitpoints(otherBotState);
	}
}
