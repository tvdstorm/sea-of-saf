package ast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ConditionAtom extends Atom implements Condition {
	public static final ArrayList<String> TYPES = new ArrayList<String>(Arrays.asList(
		"stronger",
		"weaker",
		"much_stronger",
		"much_weaker",
		"even",
		"near",
		"far",
		"always"
	));
	
	public ConditionAtom(String type) {
		super(type);
	}

	@Override
	public boolean validateType(String type) {
		return TYPES.contains(type);
	}

	@Override
	public boolean evaluate(HashMap<ConditionAtom, Boolean> state) {
		// TODO Auto-generated method stub
		return false;
	}
}
