package fighter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import fighter.checker.Visitor;
import fighter.condition.ConditionType;

@SuppressWarnings("serial")
public class Behaviour extends ArrayList<Rule> implements ASTNode {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);

	}

	public Rule getNextRule(List<ConditionType> acceptedConditions) {

		Rule selectedRule;
		int index;
		do {
			index = generatRandomIndex();
			selectedRule = this.get(index);
			if (selectedRule.checkCondition(acceptedConditions) == true) {
				return selectedRule;
			}
		} while (true);

	}

	private int generatRandomIndex() {
		Random randomGenerator = new Random();
		return randomGenerator.nextInt(this.size());
	}
}
