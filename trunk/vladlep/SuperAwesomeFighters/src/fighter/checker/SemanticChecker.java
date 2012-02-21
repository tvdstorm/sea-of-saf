package fighter.checker;

import java.util.ArrayList;
import java.util.List;

import main.Config;
import fighter.Behaviour;
import fighter.Fighter;
import fighter.IFighter;
import fighter.Personality;
import fighter.Rule;
import fighter.action.ActionType;
import fighter.action.Actions;
import fighter.condition.AndCondition;
import fighter.condition.OrCondition;
import fighter.condition.SimpleCondition;
import fighter.messages.Error;
import fighter.messages.Message;
import fighter.messages.Warning;

public class SemanticChecker implements Visitor {

	private static List<Message> messageList = null;

	public static List<Message> checkFighter(IFighter fighter) {
		fighter.accept(new SemanticChecker());
		return messageList;
	}

	public SemanticChecker() {
		if (messageList == null) {
			messageList = new ArrayList<Message>();
		}
	}

	@Override
	public void visit(Fighter fighter) {
		fighter.getBehaviour().accept(this);
		fighter.getPersonality().accept(this);
	}

	@Override
	public void visit(Behaviour behaviour) {
		for (Rule rule : behaviour) {
			rule.accept(this);

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
		int index = 1;
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
