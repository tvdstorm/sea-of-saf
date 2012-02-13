package saf;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import saf.ast.BehaviourRule;
import saf.ast.FightAction;
import saf.ast.FighterDefinition;
import saf.ast.MoveAction;
import saf.ast.State;
import saf.parser.FighterDefinitionParser;
import saf.util.RandomHelper;

/**
 * Hosts the fight between two Fighters. Contains the game logic.
 */
public class Arena {
	private static final float STRONGER_DIFFERENCE = 0.5f;

	private static final float MUCH_STRONGER_DIFFERENCE = 3.0f;

	private FighterDefinition[] playerDefinitions = new FighterDefinition[2];
	
	private Fighter[] player = new Fighter[2];
	private float distanceBetweenPlayers;
	
	public Fighter getFighter(int playerIndex) {
		return player[playerIndex];
	}
	
	public String openFighterDefinition(int playerIndex, File file) {		
		FighterDefinitionParser fighterParser;
		try {
			fighterParser = new FighterDefinitionParser(file);
			
			if (!fighterParser.getErrorList().isEmpty()) {
				StringBuilder builder = new StringBuilder();
				for (String error : fighterParser.getErrorList()) {
					builder.append(error);
					builder.append('\n');
				}
				return builder.toString();
			}
			else {
				playerDefinitions[playerIndex] = fighterParser.getDefinition();
				restartRound();
			}
		} catch (IOException e) {
			return "Error while reading: " + e.toString();
		}
		
		
		return null;
	}
	
	public void restartRound() {
		if (playerDefinitions[0] != null)
			player[0] = new Fighter(playerDefinitions[0]);
		if (playerDefinitions[1] != null)
			player[1] = new Fighter(playerDefinitions[1]);
		distanceBetweenPlayers = 0.0f;
	}
	
	/**
	 * When one of the players isn't initialized, nothing happens.
	 * When one of the players has won, nothing happens.
	 * 
	 * Else:
	 * - First selects the actions the players will perform.
	 * - After that moves the player.
	 * - After that performs the attacks.
	 */
	public void doMoves() {
		if (player[0] == null || player[1] == null)
			return;
		if (player[0].hasWonRound() || player[1].hasWonRound())
			return;
		
		selectActions(player[0], player[1]);
		selectActions(player[1], player[0]);
		
		performMoveAction(player[0]);
		performMoveAction(player[1]);
		
		performAttackAction(player[0], player[1]);
		if (player[0].hasWonRound())
			return;
		performAttackAction(player[1], player[0]);
	}
	
	private void selectActions(Fighter currentPlayer, Fighter opponent) {
		BehaviourRule behaviourRule = pickRule(currentPlayer, opponent);
		
		FightAction fightAction = RandomHelper.getElementFromList(behaviourRule.getFightActions());
		MoveAction moveAction = RandomHelper.getElementFromList(behaviourRule.getMoveActions());
		
		currentPlayer.setLastFightAction(fightAction);
		currentPlayer.setLastMoveAction(moveAction);
	}
	
	public float getDistanceBetweenPlayers() {
		return distanceBetweenPlayers;
	}
	
	private void performMoveAction(Fighter currentPlayer) {
		float walkspeed = 1.5f * (1.0f + currentPlayer.getSpeed()) * currentPlayer.getStance().getMultiplier();
		float runspeed = 3.0f * (1.0f + currentPlayer.getSpeed()) * currentPlayer.getStance().getMultiplier();
		
		float diff = 0.0f;
		MoveAction moveAction = currentPlayer.getLastMoveAction();
		if (moveAction.isRun())
			diff = runspeed;
		else if (moveAction.isWalk())
			diff = walkspeed;
		
		if (moveAction.isAway())
			diff = -diff;

		distanceBetweenPlayers -= diff;
		if (distanceBetweenPlayers < 0.0f)
			distanceBetweenPlayers = 0.0f;
		
		if (moveAction.getNewStance() != null)
			currentPlayer.setStance(moveAction.getNewStance());
	}
	
	private void performAttackAction(Fighter currentPlayer, Fighter opponent) {
		FightAction currentAction = currentPlayer.getLastFightAction();
		FightAction opponentAction = opponent.getLastFightAction();
		
		if (currentAction.isBlock())
			return;
		else if (currentAction.isKick() && distanceBetweenPlayers > currentPlayer.getKickReach())
			return;
		else if (currentAction.isPunch() && distanceBetweenPlayers > currentPlayer.getPuchReach())
			return;
		
		if (opponentAction.isBlock() && currentAction.isHigh() == opponentAction.isHigh())
			return;
		
		float power = currentAction.isKick() ? currentPlayer.getKickPower() : currentPlayer.getPunchPower();
		power *= currentPlayer.getStance().getMultiplier();
		power *= opponent.getStance().getMultiplier();
		opponent.subtractHealth(Math.round(power));
		
		if (opponent.getHealth() == 0)
			currentPlayer.setWonRound(true);
	}
	
	private BehaviourRule pickRule(Fighter currentPlayer, Fighter opponent) {
		Set<State> currentStates = new HashSet<State>();
		currentStates.add(State.always);
		currentStates.add(getNearOrFar(currentPlayer));
		currentStates.add(getStrengthComparison(currentPlayer, opponent));
		
		List<BehaviourRule> rules = currentPlayer.getBeheaviourRules(currentStates);
		return RandomHelper.getElementFromList(rules);
	}

	private State getNearOrFar(Fighter currentPlayer) {
		int smallestReach = Math.min(currentPlayer.getKickReach(), currentPlayer.getPuchReach());
		return (smallestReach >= distanceBetweenPlayers) ? State.near : State.far;
	}
	
	private State getStrengthComparison(Fighter currentPlayer, Fighter opponent) {
		float playerStrength = currentPlayer.getWeight();
		float opponentStrength = opponent.getWeight();
		float difference = playerStrength - opponentStrength;
		
		if (difference > MUCH_STRONGER_DIFFERENCE)
			return State.much_stronger;
		if (difference > STRONGER_DIFFERENCE)
			return State.stronger;
		if (difference > -STRONGER_DIFFERENCE)
			return State.even;
		if (difference > -MUCH_STRONGER_DIFFERENCE)
			return State.weaker;
		return State.much_weaker;
	}
}
