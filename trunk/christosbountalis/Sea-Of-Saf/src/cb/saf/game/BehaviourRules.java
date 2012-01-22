package cb.saf.game;

public class BehaviourRules {

	/**
	 * Necessairy enum
	 */
	public enum Moves {
		jump, crouch, stand, run_towards, run_away, walk_towards, walk_away;
		
		
	}
	public enum Conditions {
		stronger, weaker, much_stronger, much_weaker, even, near, far, always;
	}
	public enum Attacks {
		punch_low, punch_high, kick_low, kick_high, block_low, block_high;
	}
	

}
