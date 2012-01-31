package ast;

import java.util.HashMap;

public class OrCondition extends BooleanCondition {
	public OrCondition() {
		super();
	}

	@Override
	public boolean evaluate(HashMap<ConditionAtom.Type, Boolean> state) {
		for(Condition c : conditions) {
			if (c.evaluate(state)) {
				return true;
			}
		}
		return false;
	}
}
