package game;

import java.util.ArrayList;

import model.Action;
import model.Behaviour;
import model.Condition;
import model.FightAction;
import model.Fighter;
import model.MoveAction;

public class FighterStatus {
	protected double energy;
	protected int yPosition;
	protected int xPosition;
	protected double speed;
	protected String direction;
	protected Action lastMoveAction; 
	protected Action lastFightAction;
	protected int distance;
	Fighter fighter;
	
	public FighterStatus(Fighter fighter, String status) {
		this.fighter = fighter;
		this.direction = status;
		this.energy = 100.0;
		this.yPosition = 0;
		this.lastFightAction = new FightAction("block_high");
		this.lastMoveAction = new MoveAction("stand");
		if (this.direction.equals("LEFT")) {this.xPosition = 300;}
		if (this.direction.equals("RIGHT")) {this.xPosition = 400;}
		this.distance=100;
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
	
	public Fighter getFighter() {
		return this.fighter;
	}
	
	public boolean imAlive(){
		if (this.energy>0) { return true;}
		else {return false;}
	}
	
	public ArrayList<Behaviour> getBehaviours(){
		return fighter.getBehaviours();
	}
	
	public Action getLastMoveAction() {
		return lastMoveAction;
	}

	public void setLastMoveAction(Action lastMoveAction) {
		this.lastMoveAction = lastMoveAction;
	}

	public Action getLastFightAction() {
		return lastFightAction;
	}

	public void setLastFightAction(Action lastFightAction) {
		this.lastFightAction = lastFightAction;
	}
	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	public void reduceEnergy(double reduction){
		energy = energy - reduction; 
	}
	
}

