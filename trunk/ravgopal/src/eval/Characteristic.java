package eval;

import java.util.ArrayList;
import java.util.Arrays;

public class Characteristic {
	private String name;
	private int value;
	private ArrayList<String> safCharacteristics = new ArrayList<String>(
			Arrays.asList("punchReacher", "punchPower", "kickReach", "kickPower")
	);
	
	public Characteristic(String name, int value) {
		this.name = name;
		this.value = value;
	}
	
	
}
