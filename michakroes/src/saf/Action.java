package saf;

public class Action {
	private WalkAction ma;
	private FightAction fa;
	
	public Action(WalkAction ma, FightAction fa) {
		this.ma = ma;
		this.fa = fa;
		System.out.println("Action: " + ma.getType() + " - "  + fa.getType());
	}	
}
