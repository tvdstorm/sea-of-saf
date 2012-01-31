package ast;

import java.util.HashMap;

public interface Condition extends Validator {
	public boolean evaluate(HashMap<ConditionAtom.Type, Boolean> state);
	public ConditionAtom.Type getType();
}
