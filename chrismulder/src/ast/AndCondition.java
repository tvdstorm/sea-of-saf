package ast;

import java.util.HashMap;

public class AndCondition extends BooleanCondition {
	public AndCondition() {
		super();
	}

	@Override
	public boolean evaluate(HashMap<ConditionAtom.Type, Boolean> state) {
		for(Condition c : conditions) {
			if (!c.evaluate(state)) {
				return false;
			}
		}
		return true;
	}
}
