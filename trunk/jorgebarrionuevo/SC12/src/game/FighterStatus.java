package game;

import model.Fighter;

public class FighterStatus {
	protected double energy;
	protected int yPosition;
	protected int xPosition;
	protected double speed;
	protected String direction;
	protected boolean lifeStatus;
	Fighter fighter;
	
	public FighterStatus(Fighter fighter) {
		this.fighter = fighter;
	}

	public void setEnergy(double energy) {
        this.energy = energy;
	}
	
	public double getEnergy() {
		return this.energy;
	}
	
	public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
	}
	
	public int getYPosition() {
		return this.yPosition;
	}
	
	public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
	}
	
	public int getXPosition() {
		return this.xPosition;
	}
	public void setSpeed(double speed) {
        this.speed = speed;
	}
	
	public double getSpeed() {
		return this.speed;
	}
	
	public void setDirection(String direction) {
        this.direction = direction;
	}
	
	public String getDirection() {
		return this.direction;
	}
	
	public void setLifeStatus(boolean lifeStatus) {
        this.lifeStatus = lifeStatus;
	}
	
	public boolean getLifeStatus() {
		return this.lifeStatus;
	}
	
}

