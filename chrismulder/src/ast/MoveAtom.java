package ast;

public class MoveAtom extends Atom implements Move {
	public static enum Type implements AtomType {
		JUMP,
		CROUCH,
		STAND,
		RUN_TOWARDS,
		RUN_AWAY,
		WALK_TOWARDS,
		WALK_AWAY
	}
	
	public MoveAtom(String type) {
		super(type);
	}

	@Override
	public void setTypeFromTypeName() {
		type = Type.valueOf(typeName.toUpperCase());
	}

	@Override
	public Type getType() {
		return (Type) type;
	}
}
