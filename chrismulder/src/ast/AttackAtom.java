package ast;

import java.util.ArrayList;
import java.util.Arrays;

public class AttackAtom extends Atom implements Attack {
	public static final ArrayList<String> TYPES = new ArrayList<String>(Arrays.asList(
		"punch_low",
		"punch_high",
		"kick_low",
		"kick_high",
		"block_low",
		"block_high"
	));	

	public AttackAtom(String type) {
		super(type);
	}
	
	@Override
	protected boolean validateType(String type) {
		return TYPES.contains(type);
	}
}
