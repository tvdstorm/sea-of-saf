package game;

import ast.Behaviour;
import ast.Bot;
import ast.Personality;

public class Fighter {

	private int health;
	private int weight;
	private int height;
	private int speed;
	private Behaviour b;
	private Personality p;
	private Personality damageLevels;
	private Bot bot;
	private int side;
	private String name;

	public Fighter(Bot b) {
		this.bot = b;
		this.setB(b.getBehavior());
		this.setP(b.getPersonality());
		weight = (p.getStrengthValue("punchPower") + p
				.getStrengthValue("kickPower")) / 2;
		height = (p.getStrengthValue("punchReach") + p
				.getStrengthValue("kickReach")) / 2;
		speed = (int) Math.abs(0.5 * (height - weight));
		health = 10;
		name = bot.getName();
		damageLevels = new Personality();
		damageLevels.addStrength("punchLowPower",
				p.getStrengthValue("punchPower"));
		damageLevels.addStrength("punchHighPower",
				p.getStrengthValue("punchPower") + 2);
		damageLevels.addStrength("kickLowPower",
				p.getStrengthValue("kickPower"));
		damageLevels.addStrength("kickHighPower",
				p.getStrengthValue("kickPower") + 2);
		damageLevels.addStrength("blockLow", 0);
		damageLevels.addStrength("blockHigh", 0);
	}

	public int getSide() {
		return side;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public int getHealth() {
		return health;
	}

	public void looseHealth(int hit) {
		health = health - hit;
	}

	public int getWeight() {
		return weight;
	}

	public int getHeight() {
		return height;
	}

	public int getSpeed() {
		return speed;
	}

	public Behaviour getB() {
		return b;
	}

	public void setB(Behaviour b) {
		this.b = b;
	}

	public Personality getP() {
		return p;
	}

	public void setP(Personality p) {
		this.p = p;
	}

	public Personality getDamageLevels() {
		return damageLevels;
	}

}
