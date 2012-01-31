package saf;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import saf.ast.BehaviourRule;
import saf.ast.FightAction;
import saf.ast.FighterDefinition;
import saf.ast.MoveAction;
import saf.ast.State;
import saf.parser.BotDefinitionMalformedException;
import saf.parser.FighterDefinitionParser;

/**
 * Hosts the fight between two Fighters. Contains the game logic.
 */
public class Arena {
	private final FighterDefinitionParser fighterParser = new FighterDefinitionParser();
	private final Random random = new Random();
	
	private FighterDefinition[] playerDefinitions = new FighterDefinition[2];
	
	private Fighter[] player = new Fighter[2];
	private float distanceBetweenPlayers;
	
	public Fighter getFighter(int index) {
		return player[index];
	}
	
	public String openBotDefinition(int index, File file) {
		try {
			playerDefinitions[index] = fighterParser.parseFighterDefinition(file);
		} catch (IOException e) {
			return e.toString();
		} catch (BotDefinitionMalformedException e) {
			StringBuilder builder = new StringBuilder();
			builder.append(e.toString());
			builder.append("\n\n");
			for (String error : e.getErrorList()) {
				builder.append(error);
				builder.append('\n');
			}
			return builder.toString();
		}
		restartRound();
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
		
		currentPlayer.setLastFightAction(behaviourRule.getFightAction());
		currentPlayer.setLastMoveAction(behaviourRule.getMoveAction());
	}
	
	public float getDistanceBetweenBots() {
		return distanceBetweenPlayers;
	}
	
	private void performMoveAction(Fighter currentPlayer) {
		float walkspeed = 1.5f * (1.0f + currentPlayer.getSpeed()) * currentPlayer.getCurrentStance().getMultiplier();
		float runspeed = 3.0f * (1.0f + currentPlayer.getSpeed()) * currentPlayer.getCurrentStance().getMultiplier();
		
		MoveAction moveAction = currentPlayer.getLastMoveAction();
		switch (moveAction) {
			case run_away:
				distanceBetweenPlayers += runspeed;
				break;
			case walk_away:
				distanceBetweenPlayers += walkspeed;
				break;
			case run_towards:
				distanceBetweenPlayers -= runspeed;
				break;
			case walk_towards:
				distanceBetweenPlayers -= walkspeed;
				break;
			case jump:
				currentPlayer.setCurrentStance(Stance.jumping);
				break;
			case crouch:
				currentPlayer.setCurrentStance(Stance.crouching);
				break;
			case stand:
				currentPlayer.setCurrentStance(Stance.standing);
				break;
		}

		if (distanceBetweenPlayers < 0.0f)
			distanceBetweenPlayers = 0.0f;
	}
	
	private void doAttack(Fighter currentPlayer, Fighter opponent, boolean high, boolean kick)
	{
		if (kick && distanceBetweenPlayers > currentPlayer.getKickReach())
			return;
		else if (!kick && distanceBetweenPlayers > currentPlayer.getPuchReach())
			return;
		
		if (high && FightAction.block_high.equals(opponent.getLastFightAction()))
			return;
		else if (!high && FightAction.block_low.equals(opponent.getLastFightAction()))
			return;
		
		float power = (kick) ? currentPlayer.getKickPower() : currentPlayer.getPunchPower();
		power *= currentPlayer.getCurrentStance().getMultiplier();
		power *= opponent.getCurrentStance().getMultiplier();
		opponent.subtractHealth(Math.round(power));
		
		if (opponent.getHealth() == 0)
			currentPlayer.setWonRound(true);
	}
	
	private void performAttackAction(Fighter currentPlayer, Fighter opponent) {
		FightAction action = currentPlayer.getLastFightAction();
		
		switch (action) {
			case kick_high:
				doAttack(currentPlayer, opponent, true, true);				
				break;
			case kick_low:
				doAttack(currentPlayer, opponent, false, true);	
				break;
			case punch_high:
				doAttack(currentPlayer, opponent, true, false);	
				break;
			case punch_low:
				doAttack(currentPlayer, opponent, false, false);	
				break;
		}
	}
	
	private BehaviourRule pickRule(Fighter currentPlayer, Fighter opponent) {
		Set<State> currentStates = new HashSet<State>();
		currentStates.add(State.always);
		currentStates.add(getNearOrFar(currentPlayer));
		currentStates.add(getStrengthComparison(currentPlayer, opponent));
		
		List<BehaviourRule> rules = currentPlayer.getBeheaviourRules(currentStates);
		int index = random.nextInt(rules.size());
		return rules.get(index);
	}

	private State getNearOrFar(Fighter currentPlayer) {
		return (Math.min(currentPlayer.getKickReach(), currentPlayer.getPuchReach()) >= distanceBetweenPlayers) ? State.near : State.far;
	}
	
	private State getStrengthComparison(Fighter currentPlayer, Fighter opponent) {
		float playerStrength = currentPlayer.getWeight();
		float opponentStrength = opponent.getWeight();
		float difference = playerStrength - opponentStrength;
		
		if (difference > 3.0f)
			return State.much_stronger;
		if (difference > 0.5f)
			return State.stronger;
		if (difference > -0.5f)
			return State.even;
		if (difference > -3.0f)
			return State.weaker;
		return State.much_weaker;
	}
}
