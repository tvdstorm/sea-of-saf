package game;

import game.controller.FighterController;

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
	protected boolean near;
	protected boolean far;
	protected boolean stronger;
	protected boolean muchStronger;
	protected boolean even;
	protected boolean weaker;
	protected boolean muchWeaker;	
	protected int distance;
	Fighter fighter;
	
	public FighterStatus(Fighter fighter, String direction) {
		this.fighter = fighter;
		this.direction = direction;
		this.energy = 100.0;
		this.yPosition = 0;
		this.lastFightAction = new FightAction("block_high");
		this.lastMoveAction = new MoveAction("stand");
		if (this.direction.equals("LEFT")) {this.xPosition = -100;}
		if (this.direction.equals("RIGHT")) {this.xPosition = 100;}
		this.distance=200;
	}
	
	public void resetStatus(){
		near=false;
		far=false;
		stronger=false;
		muchStronger=false;
		even=false;
		weaker=false;
		muchWeaker=false;
		
	}
	
	public void updateStatus(){
		
		
		//notify
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
	
	public void reduceEnergy(double oponentHitPower){
		energy = energy - oponentHitPower; 
	}
	
	public boolean isNear() {
		return near;
	}

	public void setNear(boolean near) {
		this.near = near;
	}

	public boolean isFar() {
		return far;
	}

	public void setFar(boolean far) {
		this.far = far;
	}

	public boolean isStronger() {
		return stronger;
	}

	public void setStronger(boolean stronger) {
		this.stronger = stronger;
	}

	public boolean isMuchStronger() {
		return muchStronger;
	}

	public void setMuchStronger(boolean muchStronger) {
		this.muchStronger = muchStronger;
	}

	public boolean isEven() {
		return even;
	}

	public void setEven(boolean even) {
		this.even = even;
	}

	public boolean isWeaker() {
		return weaker;
	}

	public void setWeaker(boolean weaker) {
		this.weaker = weaker;
	}

	public boolean isMuchWeaker() {
		return muchWeaker;
	}

	public void setMuchWeaker(boolean muchWeaker) {
		this.muchWeaker = muchWeaker;
	}
	
	public void moveForward(int steps){
		if (this.direction.equals("LEFT")) {this.xPosition = this.xPosition + steps;}
		if (this.direction.equals("RIGHT")) {this.xPosition = this.xPosition - steps;}
	}
	
	public void moveBackwards(int steps){
		if (this.direction.equals("LEFT")) {this.xPosition = this.xPosition - steps;}
		if (this.direction.equals("RIGHT")) {this.xPosition = this.xPosition + steps;}
	}
	
	public int getKickPower(){
		return fighter.getCharacteristic("kickPower");
	}
	
	public int getPunchPower(){
		return fighter.getCharacteristic("punchPower");
	}
	
	public int getKickReach(){
		return fighter.getCharacteristic("kickReach");
	}
	
	public int getPunchReach(){
		return fighter.getCharacteristic("punchReach");
	}

	public void setDistance(int positionDelta) {
		this.distance=positionDelta;
	}

	public int getDistance() {
		return distance;
	}
	
	
}

