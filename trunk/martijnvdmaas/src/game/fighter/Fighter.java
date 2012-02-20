package game.fighter;

import java.util.List;

import astelements.Behaviour;

public class Fighter {

	private int weight;
	private int height;
	private int speed;
	
	//characteristics:
	private int punchReach = 5;
	private int punchPower = 5;
	private int kickReach = 5;
	private int kickPower = 5;
	
	private int health;
	private String fighterName;

	private String currentAttack;
	private String currentMove;
	private List<Behaviour> behaviours;

	public Fighter(String fighterName) {
		setHealth(100);
		setFighterName(fighterName);
	}
	

	public List<Behaviour> getBehaviours() {
		return behaviours;
	}
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getPunchReach() {
		return punchReach;
	}

	public void setPunchReach(int punchReach) {
		this.punchReach = punchReach;
	}

	public int getPunchPower() {
		return punchPower;
	}

	public void setPunchPower(int punchPower) {
		this.punchPower = punchPower;
	}

	public int getKickReach() {
		return kickReach;
	}

	public void setKickReach(int kickReach) {

		this.kickReach = kickReach;
	}

	public int getKickPower() {
		return kickPower;
	}

	public void setKickPower(int kickPower) {
		this.kickPower = kickPower;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getFighterName() {
		return fighterName;
	}

	public void setFighterName(String fighterName) {
		this.fighterName = fighterName;
	}

	public String getCurrentAttack() {
		return currentAttack;
	}

	public void setCurrentAttack(String currentAttack) {
		this.currentAttack = currentAttack;
	}

	public String getCurrentMove() {
		return currentMove;
	}

	public void setCurrentMove(String currentMove) {
		this.currentMove = currentMove;
	}

	public void setBehaviours(List<Behaviour> behaviours) {
		this.behaviours = behaviours;
	}
}
