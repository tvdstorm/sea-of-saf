package game;

import java.util.ArrayList;
import model.Behaviour;
import model.Fighter;

public class FighterStatus {
	protected double energy;
	protected int yPosition;
	protected int xPosition;
	protected String direction;
	protected int distance;
	private ArrayList<Behaviour> actualBehaviours;
	Fighter fighter;

	public FighterStatus(Fighter fighter, String direction) {
		this.fighter = fighter;
		this.direction = direction;
		this.energy = 100.0;
		this.yPosition = 0;
		if (this.direction.equals("LEFT")) {this.xPosition = -100;}
		if (this.direction.equals("RIGHT")) {this.xPosition = 100;}
		this.distance=200;
		actualBehaviours = new ArrayList<Behaviour>();
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

	public void reduceEnergy(double oponentHitPower){
		energy = energy - oponentHitPower; 
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

	public ArrayList<Behaviour> getActualBehaviours() {
		return actualBehaviours;
	}

	public void setActualBehaviours(ArrayList<Behaviour> actualBehaviours) {
		this.actualBehaviours.clear();
		this.actualBehaviours = actualBehaviours;
	}

	public boolean isFightActionAvailable(String actionName){
		boolean ret = false;
		for(int i=0;i<this.getActualBehaviours().size();i++){
			if(this.getActualBehaviours().get(i).getFightAction().getName().equals(actionName)){ ret = true;}
		}
		return ret;		
	} 
}

