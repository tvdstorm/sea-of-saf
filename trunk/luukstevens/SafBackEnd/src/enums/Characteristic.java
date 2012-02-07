package enums;

public enum Characteristic {
	KICK_POWER("kickPower"), 
	KICK_REACH("kickReach"),
	PUNCH_POWER("punchPower"), 
	PUNCH_REACH("punchReach");
	
	private String text;
	
	Characteristic(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}
}
