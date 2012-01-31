package ast;

import java.util.ArrayList;
import java.util.Arrays;

import ast.MoveAtom.Type;

public class AttackAtom extends Atom implements Attack {
	public static enum Type implements AtomType {
		PUNCH_LOW,
		PUNCH_HIGH,
		KICK_LOW,
		KICK_HIGH,
		BLOCK_LOW,
		BLOCK_HIGH
	}
	
	public AttackAtom(String type) {
		super(type);
	}

	@Override
	public void setTypeFromTypeName() {
		type = Type.valueOf(typeName.toUpperCase());
	}
}
