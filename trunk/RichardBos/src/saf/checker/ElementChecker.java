package saf.checker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import saf.structure.Action;
import saf.structure.Behavior;
import saf.structure.Bot;
import saf.structure.Bots;
import saf.structure.Characteristic;
import saf.structure.Condition;
import saf.structure.ConditionAnd;
import saf.structure.ConditionClause;
import saf.structure.ConditionOr;
import saf.structure.ConditionSimple;

public class ElementChecker implements ElementVisitor {

	private ElementChecker() {
		this.Errors = new ArrayList<String>();
	}

	public static List<String> check(Bots bots) {
		ElementChecker checker = new ElementChecker();
		bots.accept(checker);
		return checker.Errors;
	}

	private final List<String> Errors;

	private static final String CONDITION_ALWAYS = "always";
	private static final List<String> ConditionTypes = Arrays.asList("always",
			"near", "far", "much_stronger", "stronger", "even", "weaker",
			"much_weaker");
	private static final List<String> MoveTypes = Arrays.asList("walk_towards",
			"walk_away", "run_towards", "run_away", "jump", "crouch", "stand");
	private static final List<String> FightTypes = Arrays.asList("block_low",
			"block_high", "punch_low", "punch_high", "kick_low", "kick_high");
	private static final List<String> CharacteristicTypes = Arrays.asList(
			"punchReach", "punchPower", "kickReach", "kickPower");

	public void visit(Bots bots) {
		if (bots.getBots().size() == 0)
			Errors.add("No bots were found.");
	}

	public void visit(Bot bot) {
		
		if (bot.getName().length() == 0)
			Errors.add("All bots need a name.");

		List<String> foundChars = new ArrayList<String>();
		for (Characteristic characteristic : bot.getCharacteristics()) {
			if (foundChars.contains(characteristic.getName()))
				Errors.add("Duplicate characteristic found: '"
						+ characteristic.getName() + "'.");
			else
				foundChars.add(characteristic.getName());
		}

		if (bot.getBehaviors().size() == 0)
			Errors.add("No behavior rules found in bot: '"
					+ bot.getName()
					+ "'. Atleast one behavior with condition 'always' is required.");
		
		boolean alwaysBehaviorFound = false;
		for (Behavior behavior : bot.getBehaviors()) {
			if ( checkConditionForAlways(behavior.getCondition()) )
				alwaysBehaviorFound = true;
		}
		
		if(!alwaysBehaviorFound)
			Errors.add("Behavior condition 'always' was not found. Atleast one behavior with condition 'always' is required.");
	}

	public void visit(Characteristic characteristic) {
		if (!CharacteristicTypes.contains(characteristic.getName()))
			Errors.add("The characteristic '" + characteristic.getName()
					+ "' is invalid.");

		int value = characteristic.getValue();
		if (value < 0 || value > 10)
			Errors.add("The characteristic '" + characteristic.getName()
					+ "' has an invalid value:'" + characteristic.getValue()
					+ "'.");

	}

	public void visit(Behavior behavior) {
		
		for (Action action : behavior.getFightAction()) {
			if (!FightTypes.contains(action.getValue()))
				Errors.add("Unknown Fightaction found:'" + action + "'.");
		}
		for (Action action : behavior.getMoveAction()) {
			if (!MoveTypes.contains(action.getValue()))
				Errors.add("Unknown Moveaction found:'" + action + "'.");
		}
		
		checkForDuplicateActions(behavior.getFightAction(), "Fight");
		checkForDuplicateActions(behavior.getMoveAction(), "Move");

	}

	public void visit(Action action) {
		if (action.getValue().length() == 0) {
			Errors.add("Empty action found.");
		}
	}

	public void visit(ConditionSimple conditionSimple) {
		if (!ConditionTypes.contains(conditionSimple.getValue()))
			Errors.add("The behavior condition '" + conditionSimple.getValue() + "' is invalid.");
	}

	public void visit(ConditionOr conditionOr) {
		checkConditionClause(conditionOr);
	}

	public void visit(ConditionAnd conditionAnd) {
		checkConditionClause(conditionAnd);
	}

	
	
	//// Helper functions
	
	private boolean checkConditionForAlways(Condition condition)
	{
		if(condition instanceof ConditionSimple)
		{
			if( CONDITION_ALWAYS.equalsIgnoreCase(((ConditionSimple)condition).getValue()) )
				return true;
			else
				return false;
		}
		else
			return false;
	}
	
	private void checkForDuplicateActions(List<Action> actions,
			String actionType) {
		List<String> foundActions = new ArrayList<String>();

		for (Action action : actions) {
			if (foundActions.contains(action.getValue()))
				Errors.add("Duplicate " + actionType
						+ "action found in choose clause: '"
						+ action.getValue()
						+ "', please remove the duplicates.");
			else
				foundActions.add(action.getValue());
		}

	}

	private void checkConditionClause(ConditionClause conditionClause) {
		
		// Check for "always"-condition inside a clause
		if (conditionClause.getFirstCondition() instanceof ConditionSimple) {
			if (checkConditionForAlways(conditionClause.getFirstCondition()))
				Errors.add("Invalid behavior condition found, 'always' is not a valid option in a clause.");
		}

		if (conditionClause.getSecondCondition() instanceof ConditionSimple) {
			if (checkConditionForAlways(conditionClause.getSecondCondition()))
				Errors.add("Invalid behavior condition found, 'always' is not a valid option in a clause.");
		}
	}

}
