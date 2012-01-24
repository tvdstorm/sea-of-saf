package ast;

import java.util.ArrayList;
import java.util.Arrays;


public class Strength implements Validator {
	private String type;
	private int value;
	public static final ArrayList<String> TYPES = new ArrayList<String>(Arrays.asList(
		"punchReach",
		"kickReach",
		"kickPower",
		"punchPower"
	));
	
	public Strength(String type, int value) {
		this.type = type;
		this.value= value;
	}

	@Override
	public boolean validate() {
		if (!TYPES.contains(type)) {
			return false;
		}
		if (value < 1 || value > 10) {
			return false;
		}
		return true;
	}
	
	public String toString() {
		return type + ":" + value;
	}
}
