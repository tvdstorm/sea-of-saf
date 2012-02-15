package fighter.checker;

import java.util.ArrayList;
import java.util.List;

import main.Config;
import fighter.Behaviour;
import fighter.Bot;
import fighter.Personality;
import fighter.Rule;
import fighter.action.ActionType;
import fighter.action.Actions;
import fighter.condition.AndCondition;
import fighter.condition.ICondition;
import fighter.condition.OrCondition;
import fighter.condition.SimpleCondition;
import fighter.messages.Error;
import fighter.messages.Message;
import fighter.messages.Warning;

public class SemanticChecker implements Visitor {

	private static List<Message> messageList = null;

	public static List<Message> checkBot(Bot bot) {
		bot.accept(new SemanticChecker());
		return messageList;
	}

	public SemanticChecker() {
		if (messageList == null) {
			messageList = new ArrayList<Message>();
		}
	}

	public void visit(Bot bot) {
		bot.getBehaviour().accept(this); // beh visitor
		bot.getPersonality().accept(this); // pers visitor
	}

	@Override
	public void visit(Behaviour behaviour) {
		boolean isAlways = false;
		for (Rule rule : behaviour) {
			rule.accept(this);
			ICondition condition = rule.getCondition();
			if (condition.equals("always")) {
				isAlways = true;
			}

		}
		if (isAlways == false) {
			messageList.add(new Error("No always rule for fighter behaviour."));
		}
	}

	@Override
	public void visit(Personality personality) {

		if (personality.getKickPower() > Config.MAX_STRENGTH) {
			messageList.add(new Error("Kick Power exceeds uper limit"));
		}

		if (personality.getKickPower() < Config.MIN_STRENGTH) {
			messageList.add(new Error("Kick Power exceeds lower limit"));
		}

		if (personality.getKickReach() > Config.MAX_STRENGTH) {
			messageList.add(new Error("Kick Reach exceeds uper limit"));
		}

		if (personality.getKickReach() < Config.MIN_STRENGTH) {
			messageList.add(new Error("Kick Reach exceeds lower limit"));
		}

		if (personality.getPunchPower() > Config.MAX_STRENGTH) {
			messageList.add(new Error("Punch Power exceeds uper limit"));
		}

		if (personality.getPunchPower() < Config.MIN_STRENGTH) {
			messageList.add(new Error("Punch Power exceeds lower limit"));
		}

		if (personality.getPunchReach() > Config.MAX_STRENGTH) {
			messageList.add(new Error("Punch Reach exceeds uper limit"));
		}

		if (personality.getPunchReach() < Config.MIN_STRENGTH) {
			messageList.add(new Error("Punch Reach exceeds lower limit"));
		}

	}

	@Override
	public void visit(Actions<ActionType> actions) {
		int index = 1; // TODO check if this works if the list has 1 element;
		for (ActionType i : actions) {
			for (ActionType j : actions.subList(index, actions.size())) {
				if (i.equals(j))
					messageList.add(new Warning("Action " + i.toString()
							+ " apears multiple times in choose"));
			}

			index++;
		}

	}

	@Override
	public void visit(Rule rule) {
		rule.getCondition().accept(this);
		rule.getMoveActions().accept(this);
		rule.getFightActions().accept(this);

	}

	@Override
	public void visit(SimpleCondition simpleCondition) {
		// have nothing to check.

	}

	@Override
	public void visit(AndCondition andCondition) {
		andCondition.getFirstCond().accept(this);
		andCondition.getSecondCond().accept(this);

	}

	@Override
	public void visit(OrCondition orCondition) {
		orCondition.getFirstCond().accept(this);
		orCondition.getSecondCond().accept(this);
	}
}
