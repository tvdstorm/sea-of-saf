package saf.ast.fighter;

import java.util.List;
import saf.Config;
import saf.ast.ASTNode;
import saf.ast.util.Visitor;

public class Personality extends ASTNode {

	private int punchReach = Config.DEFAULT_STRENGTH;
	private int punchPower = Config.DEFAULT_STRENGTH;
	private int kickReach = Config.DEFAULT_STRENGTH;
	private int kickPower = Config.DEFAULT_STRENGTH;
	private double speed;
	
	public Personality(List<Characteristic> characteristics) {
		for (Characteristic c : characteristics) {
			if (c.getName().equals(Config.PUNCH_POWER))
				this.punchPower = c.getValue();
			if (c.getName().equals(Config.PUNCH_REACH))
				this.punchReach = c.getValue();
			if (c.getName().equals(Config.KICK_POWER))
				this.kickPower = c.getValue();
			if (c.getName().equals(Config.KICK_REACH))
				this.kickReach = c.getValue();
		}
		
		calcSpeed();
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	private void calcSpeed() {
		double weight;
		double height;
		
		weight = (this.punchPower + this.kickPower) / 2;
		height = (this.punchReach + this.kickReach) / 2;
		this.speed = Math.abs(0.5 * (height - weight));
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

	public double getSpeed() {
		return speed;
	}

	public int getPower() {
		return punchPower + kickPower;
	}
}
