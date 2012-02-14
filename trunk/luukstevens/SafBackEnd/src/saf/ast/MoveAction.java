package saf.ast;

public class MoveAction extends Action {
	public boolean isAttack(Attack attack) {	
		return false;
	}
	
	public boolean isMove(Move move) {
		try {
			return move.equals(getMove());
		} catch (IllegalArgumentException e) {
			return false;
		}
	}
	
	public Attack getAttack() {
		return null;
	}
	
	public Move getMove() {
		return Move.valueOf(getValue().toUpperCase());
	}
}
