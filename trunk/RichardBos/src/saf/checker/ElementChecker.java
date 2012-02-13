package saf.checker;

import java.util.ArrayList;
import java.util.List;

import saf.game.GameConstant;
import saf.structure.Action;
import saf.structure.Behavior;
import saf.structure.Bot;
import saf.structure.Bots;
import saf.structure.Characteristic;
import saf.structure.ConditionAnd;
import saf.structure.ConditionClause;
import saf.structure.ConditionOr;
import saf.structure.ConditionSimple;
import saf.structure.intelligence.ActionIntelligence;
import saf.structure.intelligence.ConditionIntelligence;

public class ElementChecker implements ElementVisitor, GameConstant {

	private ElementChecker() {
		this.checkerErrors = new ArrayList<String>();
	}

	public static List<String> check(Bots bots) {
		ElementChecker checker = new ElementChecker();
		bots.accept(checker);
		return checker.checkerErrors;
	}

	private final List<String> checkerErrors;

	public void visit(Bots bots) {
		if (bots.getBots().size() == 0)
			checkerErrors.add("No bots were found.");
	}

	public void visit(Bot bot) {

		if (bot.getName().length() == 0)
			checkerErrors.add("All bots need a name.");

		List<String> foundChars = new ArrayList<String>();
		for (Characteristic characteristic : bot.getCharacteristics()) {
			if (foundChars.contains(characteristic.getName()))
				checkerErrors.add("Duplicate characteristic found: '" + characteristic.getName() + "'.");
			else
				foundChars.add(characteristic.getName());
		}

		if (bot.getBehaviors().size() == 0)
			checkerErrors.add("No behavior rules found in bot: '" + bot.getName()
					+ "'. Atleast one behavior with condition 'always' is required.");

		boolean alwaysBehaviorFound = false;
		for (Behavior behavior : bot.getBehaviors()) {
			if (ConditionIntelligence.checkConditionForAlways(behavior.getCondition()))
				alwaysBehaviorFound = true;
		}

		if (!alwaysBehaviorFound)
			checkerErrors.add("Behavior condition 'always' was not found. Atleast one behavior with condition 'always' is required.");
	}

	public void visit(Characteristic characteristic) {
		if (!CHAR_TYPES.contains(characteristic.getName()))
			checkerErrors.add("The characteristic '" + characteristic.getName() + "' is invalid.");

		int value = characteristic.getValue();
		if (value < 0 || value > 10)
			checkerErrors.add("The characteristic '" + characteristic.getName() + "' has an invalid value:'"
					+ characteristic.getValue() + "'.");

	}

	public void visit(Behavior behavior) {

		for (Action action : behavior.getFightAction()) {
			if (!FIGHT_TYPES.contains(action.getValue()))
				checkerErrors.add("Unknown Fightaction found:'" + action + "'.");
		}
		for (Action action : behavior.getMoveAction()) {
			if (!MOVE_TYPES.contains(action.getValue()))
				checkerErrors.add("Unknown Moveaction found:'" + action + "'.");
		}

		checkerErrors.addAll(ActionIntelligence.checkForDuplicateActions(behavior.getFightAction(), "Fight"));
		checkerErrors.addAll(ActionIntelligence.checkForDuplicateActions(behavior.getMoveAction(), "Move"));
	}

	public void visit(Action action) {
		if (action.getValue().length() == 0) {
			checkerErrors.add("Empty action found.");
		}
	}

	public void visit(ConditionSimple conditionSimple) {
		if (!ConditionTypes.contains(conditionSimple.getValue()))
			checkerErrors.add("The behavior condition '" + conditionSimple.getValue() + "' is invalid.");
	}

	public void visit(ConditionOr conditionOr) {
		checkerErrors.addAll(checkConditionClause(conditionOr));
	}

	public void visit(ConditionAnd conditionAnd) {
		checkerErrors.addAll(checkConditionClause(conditionAnd));
	}
	
	private List<String> checkConditionClause(ConditionClause conditionClause) {
		List<String> errors = new ArrayList<String>();
		
		// Check for "always"-condition inside a clause
		if (conditionClause.getFirstCondition() instanceof ConditionSimple) {
			if (ConditionIntelligence.checkConditionForAlways(conditionClause.getFirstCondition()))
				errors.add("Invalid behavior condition found, 'always' is not a valid option in a clause.");
		}

		if (conditionClause.getSecondCondition() instanceof ConditionSimple) {
			if (ConditionIntelligence.checkConditionForAlways(conditionClause.getSecondCondition()))
				errors.add("Invalid behavior condition found, 'always' is not a valid option in a clause.");
		}
		return errors;
	}
}
