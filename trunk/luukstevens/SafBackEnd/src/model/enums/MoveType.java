package model.enums;

public enum MoveType {
	JUMP("jump"), 
	CROUCH("crouch"),
	STAND("stand"), 
	RUN_TOWARDS("run_towards"),
	RUN_AWAY("run_away"), 
	WALK_TOWARDS("walk_towards"), 
	WALK_AWAY("walk_away");
	
	private String text;
	
	MoveType(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}
}
