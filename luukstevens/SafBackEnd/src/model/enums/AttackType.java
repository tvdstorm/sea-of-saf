package model.enums;

public enum AttackType {
	PUNCH_LOW("punch_low"), 
	PUNCH_HIGH("punch_high"),
	KICK_LOW("kick_low"), 
	KICK_HIGH("kick_high"), 
	BLOCK_LOW("block_low"), 
	BLOCK_HIGH("block_high");
	
	private String text;
	
	AttackType(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}
}
