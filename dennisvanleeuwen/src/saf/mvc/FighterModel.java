package saf.mvc;

import saf.astelements.Fighter;

public abstract class FighterModel{
	private String currentMoveState;
	private String currentFightState;
	private Fighter fighterNode;	
	private int health;
	private int x;
	private int y;
	
	public FighterModel(int x, int y, int health, String startMoveState, String startFightState, Fighter fighterNode){
		this.x = x;
		this.y = y;
		this.health = health;
		this.currentMoveState = startMoveState;
		this.currentFightState = startFightState;
		this.fighterNode = fighterNode;
	}
	
	public String getCurrentFightState(){
		return this.currentFightState;
	}
	
	public void setCurrentFightState(String newFightState){
		this.currentFightState = newFightState;
	}
	
	public String getCurrentMoveState(){
		return this.currentMoveState;
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

	public Fighter getFighterNode() {
		return fighterNode;
	}
}