package ast;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveAtom extends Atom implements Move {
	public static final ArrayList<String> TYPES = new ArrayList<String>(Arrays.asList(
		"jump",
		"crouch",
		"stand",
		"run_towards",
		"run_away",
		"walk_towards",
		"walk_away"
	));
	
	public MoveAtom(String type) {
		super(type);
	}

	@Override
	public boolean validateType(String type) {
		return TYPES.contains(type);
	}
}
