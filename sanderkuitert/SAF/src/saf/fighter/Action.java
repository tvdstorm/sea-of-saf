package saf.fighter;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;


class Action implements AST {

	List<Move> moves;
	List<Attack> attacks;

	public Action(List<String> moves, List<String> attacks) {
		this.moves = new LinkedList<Move>();
		this.attacks = new LinkedList<Attack>();
		for(String move: moves) {
			this.moves.add(new Move(move));
		}
		for(String attack: attacks) {
			this.attacks.add(new Attack(attack));
		}
	}
	
	/** Get random move and attack */
	public MoveAndAttack getAction() {
		assert moves.size()>0 && attacks.size()>0;
		
		Move move = moves.get(new Random().nextInt(moves.size()));
		Attack attack = attacks.get(new Random().nextInt(attacks.size()));
		
		return new MoveAndAttack(move, attack);
	}

	public String getName() {
		return "<"+moves+", "+attacks+">";
	}

	public List<AST> getChildren() {
		LinkedList<AST> result = new LinkedList<AST>();
		result.addAll(moves);
		result.addAll(attacks);
		return result;
	}

	
	//=== Inner class ========================================================
	public static class MoveAndAttack {
		public final Move move;
		public final Attack attack;
		
		public MoveAndAttack(Move move, Attack attack) {
			this.move = move;
			this.attack = attack;
		}
	}
	
}
