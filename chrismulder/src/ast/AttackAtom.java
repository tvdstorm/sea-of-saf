package ast;

public class AttackAtom extends Atom implements Attack {
	public static enum Type implements AtomType {
		BLOCK_HIGH,
		BLOCK_LOW,
		PUNCH_HIGH,
		PUNCH_LOW,
		KICK_LOW,
		KICK_HIGH,
	}
	
	public AttackAtom(String type) {
		super(type);
	}

	@Override
	public void setTypeFromTypeName() {
		type = Type.valueOf(typeName.toUpperCase());
	}
}
