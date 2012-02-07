package saf.enums;

public enum Attack {
	BLOCK_HIGH("block_high"), 
	BLOCK_LOW("block_low"),
	KICK_HIGH("kick_high"), 
	KICK_LOW("kick_low"),
	PUNCH_HIGH("punch_high"),
	PUNCH_LOW("punch_low");
	
	private String text;
	
	Attack(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}
}
