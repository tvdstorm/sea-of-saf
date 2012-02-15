package fighter;

import java.util.ArrayList;
import java.util.List;

import main.Config;

public class Personality {

	private int punchReach;
	private int punchPower;
	private int kickReach;
	private int kickPower;

	public Personality() {
		punchPower = Config.DEFAULT_STRENGTH;
		punchReach = Config.DEFAULT_STRENGTH;
		kickPower = Config.DEFAULT_STRENGTH;
		kickReach = Config.DEFAULT_STRENGTH;
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
