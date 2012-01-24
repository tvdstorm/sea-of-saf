package eval;

public class Rule {
	private Condition condition;
	private Move move;
	private Fight fight;

	public Rule(Condition condition, Move move, Fight fight) {
		this.condition = condition;
		this.move = move;
		this.fight = fight;
	}

}
