package ast;

import java.util.Map;

public class OrCondition extends BooleanCondition {
	public OrCondition() {
		super();
	}

	@Override
	public boolean evaluate(Map<AtomType, Boolean> state) {
		for(Condition c : conditions) {
			if (c.evaluate(state)) {
				return true;
			}
		}
		return false;
	}
}
