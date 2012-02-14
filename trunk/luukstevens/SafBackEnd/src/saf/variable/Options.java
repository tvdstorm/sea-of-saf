package saf.variable;

//Enum types must be the upercase of the given text value.
public interface Options {
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
	
	public enum Condition {
		ALWAYS("always"),
		NEAR("near"), 
		FAR("far"), 
		MUCH_STRONGER("much_stronger"), 
		STRONGER("stronger"),
		EVEN("even"), 
		WEAKER("weaker"), 
		MUCH_WEAKER("much_weaker");

		private String text;
		
		Condition(String text) {
			this.text = text;
		}

		public String getText() {
			return text;
		}
	}
	
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
}
