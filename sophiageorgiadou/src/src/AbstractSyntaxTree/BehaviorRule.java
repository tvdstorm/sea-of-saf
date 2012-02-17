package AbstractSyntaxTree;

public class BehaviorRule {

	private Condition condition;
	private Move move;
	private Attack attack;
	
	public BehaviorRule(){
		this.setCondition(new Condition());
		this.setMove(new Move());
		this.setAttack(new Attack());
	}

	public Condition getCondition() {
		return condition;
	}

	public void setCondition(Condition condition) {
		this.condition = condition;
	}

	public Move getMove() {
		return move;
	}

	public void setMove(Move move) {
		this.move = move;
	}

	public Attack getAttack() {
		return attack;
	}

	public void setAttack(Attack attack) {
		this.attack = attack;
	}
	
}
