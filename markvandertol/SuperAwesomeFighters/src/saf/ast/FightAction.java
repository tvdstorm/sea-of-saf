package saf.ast;

/**
 * Fight actions a fighter can perform.
 */
public enum FightAction {
	block_low(true, false, false, false),
	block_high(true, false, false, true),
	punch_low(false, true, false, false),
	punch_high(false, true, false, true),
	kick_low(false, false, true, false),
	kick_high(false, false, true, true);
	
	private final boolean isBlock;
	private final boolean isPunch;
	private final boolean isKick;
	private final boolean isHigh;

	FightAction(boolean isBlock, boolean isPunch, boolean isKick, boolean isHigh) {
		this.isBlock = isBlock;
		this.isPunch = isPunch;
		this.isKick = isKick;
		this.isHigh = isHigh;
	}
	
	public boolean isBlock() {
		return isBlock;
	}
	
	public boolean isHigh() {
		return isHigh;
	}
	
	public boolean isKick() {
		return isKick;
	}
	
	public boolean isPunch() {
		return isPunch;
	}
}
