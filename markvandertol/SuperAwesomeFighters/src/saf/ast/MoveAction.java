package saf.ast;

import saf.Stance;

/**
 * Move actions a fighter can perform.
 */
public enum MoveAction {
	walk_towards(false, true, false),
	walk_away(false, true, true),
	run_towards(true, false, false),
	run_away(true, false, true),
	jump(Stance.jumping),
	crouch(Stance.crouching),
	stand(Stance.standing);
	
	private final boolean isRun;
	private final boolean isWalk;
	private final boolean isAway;
	private final Stance newStance;
	
	MoveAction(Stance newStance) {
		this.isRun = this.isWalk = this.isAway = false;
		this.newStance = newStance;
	}

	MoveAction(boolean isRun, boolean isWalk, boolean isAway) {
		this.isRun = isRun;
		this.isWalk = isWalk;
		this.isAway = isAway;
		this.newStance = null;
	}
	
	public boolean isAway() {
		return isAway;
	}
	
	public boolean isRun() {
		return isRun;
	}
	
	public boolean isWalk() {
		return isWalk;
	}
	
	public Stance getNewStance() {
		return newStance;
	}
}
