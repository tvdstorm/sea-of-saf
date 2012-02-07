package enums;

public enum Move {
	CROUCH("crouch"),
	JUMP("jump"), 
	RUN_AWAY("run_away"), 
	RUN_TOWARDS("run_towards"), 
	STAND("stand"),
	WALK_AWAY("walk_away"), 
	WALK_TOWARDS("walk_towards");

	private String text;
	
	Move(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}
}
