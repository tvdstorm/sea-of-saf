package ast;

import java.util.HashMap;

public interface Condition extends Validator {
	public boolean evaluate(HashMap<ConditionAtom, Boolean> state);
}
