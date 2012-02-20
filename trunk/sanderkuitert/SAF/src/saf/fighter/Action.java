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

	
	public String getName() {
		return "{ "+moves+", "+attacks+" }";
	}

	public List<AST> getChildren() {
		LinkedList<AST> result = new LinkedList<AST>();
		result.addAll(moves);
		result.addAll(attacks);
		return result;
	}
	
	public Fighter.ActionEffect getEffectFromRandomChoice(List<Property> properties) {
		Move move = moves.get(new Random().nextInt(moves.size()));
		Attack attack = attacks.get(new Random().nextInt(attacks.size()));
		
		return new Fighter.ActionEffect(attack.getName(), attack.getPhysicalEffect(properties), 
					attack.getRange(properties), move.getName(), move.getSteps(), move.getDistance());
	}
	
}
