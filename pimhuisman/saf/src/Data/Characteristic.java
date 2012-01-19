package Data;

public class Characteristic {

	private int punchReach;
	private int punchPower;
	private int kickReach;
	private int kickPower;
	
	public Characteristic() {
		
	}
	
	public Characteristic(int punchReach, int punchPower, int kickReach, int kickPower) {
		this.punchReach = punchReach;
		this.punchPower = punchPower;
		this.kickReach = kickReach;
		this.kickPower = kickPower;
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
