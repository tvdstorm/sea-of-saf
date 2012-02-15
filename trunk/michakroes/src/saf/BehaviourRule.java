package saf;

public class BehaviourRule {
	private Condition c;
	private WalkAction ma;
	private FightAction fa;
	
	public BehaviourRule(Condition c, WalkAction ma, FightAction fa) {
		this.c = c;
		this.ma = ma;
		this.fa = fa;
		System.out.println("Action: " + c.getType() + " - " + ma.getType() + " - "  + fa.getType());
	}	
	
}
