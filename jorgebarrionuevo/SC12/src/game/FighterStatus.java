package game;

public class FighterStatus {
	private double energy;
	private double yPosition;
	private double xPosition;
	private double speed;
	private String direction;
	private boolean lifeStatus;
	
	public FighterStatus() {
		this.energy = 100.0;
	}

	public void setEnergy(double energy) {
        this.energy = energy;
	}
	
	public double getEnergy() {
		return this.energy;
	}
	
	public void setYPosition(double yPosition) {
        this.yPosition = yPosition;
	}
	
	public double getYPosition() {
		return this.yPosition;
	}
	
	public void setXPosition(double xPosition) {
        this.yPosition = xPosition;
	}
	
	public double getXPosition() {
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

