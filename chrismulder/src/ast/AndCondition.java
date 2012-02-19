package ast;

import java.util.Map;

public class AndCondition extends BooleanCondition {
	public AndCondition() {
		super();
	}

	@Override
	public boolean evaluate(Map<AtomType, Boolean> state) {
		for(Condition c : conditions) {
			if (!c.evaluate(state)) {
				return false;
			}
		}
		return true;
	}
}
