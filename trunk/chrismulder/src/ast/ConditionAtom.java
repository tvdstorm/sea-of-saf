package ast;

import java.util.HashMap;


public class ConditionAtom extends Atom implements Condition {
	public static enum Type implements AtomType {
		STRONGER,
		WEAKER,
		MUCH_STRONGER,
		MUCH_WEAKER,
		EVEN,
		NEAR,
		FAR,
		ALWAYS
	}
	
	public ConditionAtom(String type) {
		super(type);
	}

	@Override
	public void setTypeFromTypeName() {
		type = Type.valueOf(typeName.toUpperCase());
	}

	@Override
	public boolean evaluate(HashMap<ConditionAtom.Type, Boolean> state) {
		return state.get(type);
	}
	
	public Type getType() {
		return (Type) type;
	}
}
