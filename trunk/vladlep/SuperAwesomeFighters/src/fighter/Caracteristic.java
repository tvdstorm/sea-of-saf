package fighter;

public class Caracteristic {

	private int punchReach;
	private int punchPower;
	private int kickReach;
	private int kickPower;

	public Caracteristic() {
		punchPower = 5;
		punchReach = 5;
		kickPower = 5;
		kickReach = 5;
	}

	public void setPunchReach(int punchReach) {
		this.punchReach = punchReach;
	}

	public void setPunchPower(int punchPower) {
		this.punchPower = punchPower;
	}

	public void setKickReach(int kickReach) {
		this.kickReach = kickReach;
	}

	public void setKickPower(int kickPower) {
		this.kickPower = kickPower;
	}

	public int getPunchReach() {
		return punchReach;
	}

	public int getPunchPower() {
		return punchPower;
	}

	public int getKickReach() {
		return kickReach;
	}

	public int getKickPower() {
		return kickPower;
	}

}
