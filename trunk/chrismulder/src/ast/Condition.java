package ast;

import java.util.Map;

public interface Condition extends Validator {
	boolean evaluate(Map<AtomType, Boolean> state);
	//public boolean evaluate(Map<Type, Boolean> conditions);
	public ConditionAtom.Type getType();
}
