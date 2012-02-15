package saf;

import saf.astelements.Characteristic;
import saf.astelements.Fighter;

public class FighterModel {
	private String currentMoveState;
	private String currentFightState;
	private Fighter fighterNode;
	private int health;
	private int x;
	private int y;
	
	public FighterModel(int x, int y, int health, String startMoveState, String startFightState, Fighter fighterNode){
		this.x = x;
		this.y = y;
		this.fighterNode = fighterNode;
		this.health = health;
		this.currentMoveState = startMoveState;
		this.currentFightState = startFightState;
	}
	
	public int findCharacteristicValue(String characteristicItem){
		for(Characteristic fighterChar: this.fighterNode.getCharacteristics()){
			if(fighterChar.item == characteristicItem)
				return fighterChar.value;
		}
		return 5;//Default value;
	}
	
	
	//weight = (punchPower + kickPower) / 2
	public double getWeight(){
		return (this.findCharacteristicValue("punchPower") + this.findCharacteristicValue("kickPower")) /2;
	}
	
	//height = (punchReach + kickReach) / 2
	public double getHeight(){
		return (this.findCharacteristicValue("punchReach") + this.findCharacteristicValue("kickReach")) /2;
	}
	
	//speed = | 0.5*(height-weight) |
	public double getSpeed(){
		return Math.abs(0.5*(this.getHeight() - this.getWeight()));
	}

	public Fighter getFighterNode() {
		return fighterNode;
	}
	
	public String getCurrentFightState(){
		return this.currentFightState;
	}
	
	public void setCurrentFightState(String newFightState){
		this.currentFightState = newFightState;
	}
	
	public String getCurrentMoveState(){
		return this.currentFightState;
	}
	
	public void setCurrentMoveState(String newMoveState){
		this.currentMoveState = newMoveState;
	}
	
	public int getHealth(){
		return this.health;
	}

	public void setHealth(int health){
		this.health = health;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
