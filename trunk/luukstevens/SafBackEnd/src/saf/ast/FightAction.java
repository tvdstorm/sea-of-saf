package saf.ast;

public class FightAction extends Action {
	public boolean isAttack(Attack attack) {	
		try{
			return attack.equals(getAttack());
		} catch (IllegalArgumentException e) {
			return false;
		}
	}
	
	public boolean isMove(Move move) {
		return false;
	}
	
	public Attack getAttack() {
		return Attack.valueOf(getValue().toUpperCase());
	}
	
	public Move getMove() {
		return null;
	}
}
