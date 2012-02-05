package game.fighter;

public class Fighter {

	private int weight;
	private int height;
	private int speed;
	
	//characteristics
	private int punchReach;
	private int punchPower;
	private int kickReach;
	private int kickPower;
	
	private int health;
	private String fighterName;

	public Fighter(String fighterName) {
		this.health = 100;
		setFighterName(fighterName);
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
}
