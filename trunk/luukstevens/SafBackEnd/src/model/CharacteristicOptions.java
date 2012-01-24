package model;

public enum CharacteristicOptions {
	KICK_POWER("kickPower"), 
	KICK_REACH("kickReach"),
	PUNCH_POWER("punchPower"), 
	PUNCH_REACH("punchReach");
	
	private String text;
	
	CharacteristicOptions(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}
}
