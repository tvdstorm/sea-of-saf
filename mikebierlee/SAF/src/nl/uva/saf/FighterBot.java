package nl.uva.saf;

import java.util.HashMap;

class FighterBot {
	HashMap<String, Integer> attributes;
	
	public FighterBot() {
		attributes = new HashMap<String, Integer>();
		addDefaults();
	}
	
	protected void addDefaults() {
		attributes.put("punchReach", 5);
		attributes.put("punchPower", 5);
		attributes.put("kickReach", 5);		
		attributes.put("kickPower", 5);
	}
	
	public void setAttribute(String name, int value) {
		attributes.put(name, value);
	}
	
	public int getAttribute(String name) {
		return attributes.get(name);
	}
}