package saf.simulation;

import saf.ast.Behaviour;

public final class State {
	private final String fightType;
	private final String moveType;
	private String stance;
	private int damageInflicted = 0;
	private int damageReceived = 0;
	private int distanceMoved = 0;
	
	public State(Behaviour b){
		this.fightType = b.getFightAction().getType();
		this.moveType = b.getMoveAction().getType();
	}
	
	public State(String fightType, String moveType){
		this.fightType = fightType;
		this.moveType = moveType;
	}
	
	public String getFightType() {
		return this.fightType;
	}

	public String getMoveType() {
		return this.moveType;
	}

	public int getDamageInflicted() {
		return this.damageInflicted;
	}

	public void setDamageInflicted(int damageInflicted) {
		this.damageInflicted = damageInflicted;
	}

	public int getDamageReceived() {
		return this.damageReceived;
	}

	public void setDamageReceived(int damageReceived) {
		this.damageReceived = damageReceived;
	}

	public int getDistanceMoved() {
		return this.distanceMoved;
	}

	public void setDistanceMoved(int distanceMoved) {
		this.distanceMoved = distanceMoved;
	}

	public String getStance() {
		return stance;
	}

	public void setStance(String stance) {
		this.stance = stance;
	}
}
