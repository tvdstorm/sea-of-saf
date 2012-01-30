package model.enums;

public enum CharacteristicType {
	KICK_POWER("kickPower"), 
	KICK_REACH("kickReach"),
	PUNCH_POWER("punchPower"), 
	PUNCH_REACH("punchReach");
	
	private String text;
	
	CharacteristicType(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}
}
