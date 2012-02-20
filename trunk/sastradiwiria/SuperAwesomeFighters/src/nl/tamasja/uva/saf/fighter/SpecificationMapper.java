package nl.tamasja.uva.saf.fighter;

public class SpecificationMapper {

	public static enum Strength {
		KICK_REACH,
		KICK_POWER,
		PUNCH_REACH,
		PUNCH_POWER
	};

	public static enum Condition {
		STRONGER,
		WEAKER,
		MUCH_STRONGER,
		MUCH_WEAKER,
		EVEN,
		NEAR,
		FAR,
		ALWAYS
	};
	
	public static enum Move {
		JUMP,
		CROUCH,
		STAND,
		RUN_TOWARDS,
		RUN_AWAY,
		WALK_TOWARDS,
		WALK_AWAY
	}
	
	public static enum Attack {
		PUNCH_LOW,
		PUNCH_HIGH,
		KICK_LOW,
		KICK_HIGH,
		BLOCK_LOW,
		BLOCK_HIGH
	}
	
	
	public Strength MapStrength(String name) {
		if(name.equals("kickReach")) {
			return Strength.KICK_REACH;
		} else if(name.equals("kickPower")) {
			return Strength.KICK_POWER;
		} else if(name.equals("punchReach")) {
			return Strength.PUNCH_REACH;
		} else if(name.equals("punchPower")) {
			return Strength.PUNCH_POWER;
		}
		
		return null;
	}
	
	public Condition MapCondition(String name) {
		
		if(name.equals("stronger")) {
			return Condition.STRONGER;
		} else if(name.equals("weaker")) {
			return Condition.WEAKER;
		} else if(name.equals("much_stronger")) {
			return Condition.MUCH_STRONGER;
		} else if(name.equals("much_weaker")) {
			return Condition.MUCH_WEAKER;
		} else if(name.equals("even")) {
			return Condition.EVEN;
		} else if(name.equals("near")) {
			return Condition.NEAR;
		} else if(name.equals("far")) {
			return Condition.FAR;
		} else if(name.equals("always")) {
			return Condition.ALWAYS;
		}

		return null;
	}
	
	public Attack MapAttack(String name) {
		
		if(name.equals("punch_low")) {
			return Attack.PUNCH_LOW;
		} else if(name.equals("punch_high")) {
			return Attack.PUNCH_HIGH;
		} else if(name.equals("kick_low")) {
			return Attack.KICK_LOW;
		} else if(name.equals("kick_high")) {
			return Attack.KICK_HIGH;
		} else if(name.equals("block_low")) {
			return Attack.BLOCK_LOW;
		} else if(name.equals("block_high")) {
			return Attack.BLOCK_HIGH;
		}
		
		return null;
	}
	
	public Move MapMove(String name) {
		if(name.equals("jump")) {
			return Move.JUMP;
		} else if(name.equals("crouch")) {
			return Move.CROUCH;
		} else if(name.equals("stand")) {
			return Move.STAND;
		} else if(name.equals("run_towards")) {
			return Move.RUN_TOWARDS;
		} else if(name.equals("run_away")) {
			return Move.RUN_AWAY;
		} else if(name.equals("walk_towards")) {
			return Move.WALK_TOWARDS;
		} else if(name.equals("walk_away")) {
			return Move.WALK_AWAY;
		}
		
		return null;
	}
	
}
