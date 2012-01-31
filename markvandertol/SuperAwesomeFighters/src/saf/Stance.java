package saf;

public enum Stance {
	jumping(1.25f),
	crouching(1.0f),
	standing(0.75f);
	
	private final float multiplier;
	
	Stance(float multiplier) {
		this.multiplier = multiplier;
	}
	
	public float getMultiplier() {
		return multiplier;
	}
}
