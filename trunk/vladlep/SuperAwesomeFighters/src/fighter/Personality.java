package fighter;

import fighter.checker.Visitor;
import main.Config;

public class Personality implements ASTNode {

	private int punchReach;
	private int punchPower;
	private int kickReach;
	private int kickPower;
	private double speed;
	private double power;

	public Personality() {
		punchPower = Config.DEFAULT_STRENGTH;
		punchReach = Config.DEFAULT_STRENGTH;
		kickPower = Config.DEFAULT_STRENGTH;
		kickReach = Config.DEFAULT_STRENGTH;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);

	}

	public int getKickPower() {
		return kickPower;
	}

	public int getKickReach() {
		return kickReach;
	}

	public double getPower() {
		return power;
	}

	public int getPunchPower() {
		return punchPower;
	}

	public int getPunchReach() {
		return punchReach;
	}

	public double getSpeed() {
		return speed;
	}

	public void setKickPower(int kickPower) {
		this.kickPower = kickPower;
	}

	public void setKickReach(int kickReach) {
		this.kickReach = kickReach;
	}

	public void setPunchPower(int punchPower) {
		this.punchPower = punchPower;
	}

	public void setPunchReach(int punchReach) {
		this.punchReach = punchReach;
	}

	public void updatePower() {
		power = 0.5 * (punchPower - kickPower);
	}

	public void updateSpeed() {
		double power;
		double reach;
		power = 0.5 * (punchPower - kickPower);
		reach = 0.5 * (punchReach - kickReach);
		speed = Math.abs(0.5 * (power - reach));
	}
}
