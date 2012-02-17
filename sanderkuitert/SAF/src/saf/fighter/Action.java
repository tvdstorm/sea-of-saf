package saf.fighter;

import java.util.LinkedList;
import java.util.List;


class Action implements AST {

	Move move;
	Attack attack;

	public Action(List<String> moves, List<String> attacks) {
		if(moves.size()==1) {
			this.move = new Move(moves.get(0));
		} else {
			this.move = new Move.UndecidedMove(moves);
		}
		if(attacks.size()==1) {
			this.attack = new Attack(attacks.get(0));
		} else {
			this.attack = new Attack.UndecidedAttack(attacks);
		}
	}

	public String getValue() {
		return move.getValue() + ", " + attack.getValue(); //TODO ugly
	}

	public List<AST> getChildren() {
		LinkedList<AST> result = new LinkedList<AST>();
		result.add(move);
		result.add(attack);
		return result;
	}
	
	public boolean isValidValue(String action) {
		assert false: "Action can't be invalid";
		return false;
	}

	public String describeValidValues() {
		assert false: "Action doesn't have valid values";
		return "";
	}
	
}
