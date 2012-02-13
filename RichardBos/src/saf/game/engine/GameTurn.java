package saf.game.engine;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import saf.game.GameConstant;
import saf.game.gui.GameController;
import saf.game.state.BotState;
import saf.game.state.GameState;
import saf.structure.Action;
import saf.structure.Behavior;
import saf.structure.intelligence.BehaviorIntelligence;

public class GameTurn implements GameConstant {

	private static final int CONST_JUMP_PIXELS = 80;
	private static final Map<String, Integer> MOVEACTION_DISTANCE;
	static {
		Map<String, Integer> initMap = new HashMap<String, Integer>();
		initMap.put("walk_towards", 50);
		initMap.put("walk_away", -50);
		initMap.put("run_towards", 100);
		initMap.put("run_away", -100);
		MOVEACTION_DISTANCE = Collections.unmodifiableMap(initMap);
	}

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

		Point dMoves = processMoveAction(moveAction);

		// Update distance, increase if bot is moving away, decrease if bot is
		// moving toward
		gameState.updateDistance(-dMoves.x);
		botState.updateDistanceFromWall(dMoves.x);

		gameController.executeActions(botState.getSide(), dMoves, fightAction);

		processFightAction(moveAction, fightAction);
	}

	private Point processMoveAction(String moveAction) {

		int dXDistance = 0;
		int dYDistance = 0;

		if (moveAction.equals(MOVE_TYPE_WALKTOWARDS) || moveAction.equals(MOVE_TYPE_WALKAWAY)
				|| moveAction.equals(MOVE_TYPE_RUNTOWARDS)
				|| moveAction.equals(MOVE_TYPE_RUNAWAY)) {
			dXDistance = MOVEACTION_DISTANCE.get(moveAction);
		}

		// The distance cannot become negative
		if (gameState.getDistance() < dXDistance)
			dXDistance = gameState.getDistance();

		if (moveAction.equals(MOVE_TYPE_JUMP)) {
			if (!botState.isJumping())
				dYDistance = CONST_JUMP_PIXELS;
		} else {
			if (botState.isJumping())
				dYDistance = -CONST_JUMP_PIXELS;
		}

		if (moveAction.equals(MOVE_TYPE_STAND)) {
			if (botState.isJumping())
				dYDistance = -CONST_JUMP_PIXELS;
		}

		// NOTE: Crouch doesnt have a move

		// check if bot isnt moving outside of the screen
		if (dXDistance < 0 && -dXDistance > botState.getDistanceFromWall())
			dXDistance = -botState.getDistanceFromWall();

		return new Point(dXDistance, dYDistance);
	}

	private void processFightAction(String moveAction, String fightAction) {
		BotState otherBotState = null;
		for (BotState state : gameState.getBotStates()) {
			if (!state.equals(botState)) {
				otherBotState = state;
			}
		}

		ActionProcessor actionProcessor = new ActionProcessor(otherBotState, otherBotState, gameState.getDistance(), moveAction, fightAction);
		double attackPower = actionProcessor.getOutcome();

		
		if (DEBUG_STATUS && attackPower > 0) {
			System.out.println();
			System.out.println(botState.getBot().getName() + ", " + moveAction + " - " + fightAction);
			System.out.println("vs " + otherBotState.getLastMoveAction() + " - " + otherBotState.getLastFightAction());
		}
		otherBotState.updateHitpoints(attackPower);
	}
}
