package saf;

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

public class Arena {
	private final FighterDefinitionParser botParser = new FighterDefinitionParser();
	private final Random random = new Random();
	
	private FighterDefinition[] botDefinitions = new FighterDefinition[2];
	
	private Fighter[] bots = new Fighter[2];
	private float distanceBetweenBots;
	
	public Fighter getFighter(int index) {
		return bots[index];
	}
	
	public String openBotDefinition(int index, String path) {
		try {
			botDefinitions[index] = botParser.parseFighterDefinition(path);
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
		if (botDefinitions[0] != null)
			bots[0] = new Fighter(botDefinitions[0]);
		if (botDefinitions[1] != null)
			bots[1] = new Fighter(botDefinitions[1]);
		distanceBetweenBots = 0.0f;
	}
	
	public void doMoves() {
		if (bots[0] == null || bots[1] == null)
			return;
		if (bots[0].hasWonRound() || bots[1].hasWonRound())
			return;
		
		selectActions(bots[0], bots[1]);
		selectActions(bots[1], bots[0]);
		
		performMoveAction(bots[0]);
		performMoveAction(bots[1]);
		
		performAttackAction(bots[0], bots[1]);
		if (bots[0].hasWonRound())
			return;
		performAttackAction(bots[1], bots[0]);
	}
	
	private void selectActions(Fighter bot1, Fighter bot2) {
		BehaviourRule behaviourRule = pickRule(bot1, bot2);
		
		bot1.setLastFightAction(behaviourRule.getFightAction());
		bot1.setLastMoveAction(behaviourRule.getMoveAction());
	}
	
	public float getDistanceBetweenBots() {
		return distanceBetweenBots;
	}
	
	private void performMoveAction(Fighter bot) {
		float walkspeed = bot.getSpeed() / 0.5f;
		float runspeed = bot.getSpeed();
		
		MoveAction moveAction = bot.getLastMoveAction();
		switch (moveAction) {
			case run_away:
				distanceBetweenBots += runspeed;
				break;
			case walk_away:
				distanceBetweenBots += walkspeed;
				break;
			case run_towards:
				distanceBetweenBots -= runspeed;
				break;
			case walk_towards:
				distanceBetweenBots -= walkspeed;
				break;
		}

		if (distanceBetweenBots < 0.0f)
			distanceBetweenBots = 0.0f;
	}
	
	private void doAttack(Fighter bot1, Fighter bot2, boolean high, boolean kick)
	{
		if (kick && distanceBetweenBots > bot1.getKickReach())
			return;
		else if (!kick && distanceBetweenBots > bot1.getPuchReach())
			return;
		
		if (high && FightAction.block_high.equals(bot2.getLastFightAction()))
			return;
		else if (!high && FightAction.block_low.equals(bot2.getLastFightAction()))
			return;
		
		int power = (kick) ? bot1.getKickPower() : bot1.getPunchPower();
		bot2.subtractHealth(power);
		
		if (bot2.getHealth() == 0)
			bot1.setWonRound(true);
	}
	
	private void performAttackAction(Fighter bot1, Fighter bot2) {
		FightAction action = bot1.getLastFightAction();
		
		switch (action) {
			case kick_high:
				doAttack(bot1, bot2, true, true);				
				break;
			case kick_low:
				doAttack(bot1, bot2, false, true);	
				break;
			case punch_high:
				doAttack(bot1, bot2, true, false);	
				break;
			case punch_low:
				doAttack(bot1, bot2, false, false);	
				break;
		}
	}
	
	private BehaviourRule pickRule(Fighter bot1, Fighter bot2) {
		Set<State> currentStates = new HashSet<State>();
		currentStates.add(State.always);
		currentStates.add(getNearOrFar(bot1));
		currentStates.add(getStrengthComparison(bot1, bot2));
		
		List<BehaviourRule> rules = bot1.getBeheaviourRules(currentStates);
		int index = random.nextInt(rules.size());
		return rules.get(index);
	}

	private State getNearOrFar(Fighter bot) {
		if (bot.getSpeed() > distanceBetweenBots)
			return State.near;
		return State.far;
	}
	
	private State getStrengthComparison(Fighter bot1, Fighter bot2) {
		float strength1 = bot1.getWeight();
		float strength2 = bot2.getWeight();
		float diff = strength1 - strength2;
		
		if (diff > 3)
			return State.much_weaker;
		if (diff > 0.5f)
			return State.weaker;
		if (diff > -0.5f)
			return State.even;
		if (diff > -3.0f)
			return State.stronger;
		return State.much_stronger;
	}
}
