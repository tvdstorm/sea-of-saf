/**
 * 
 */
package saf.fighter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Move implements AST {
	private final static Set<String> VALID_MOVES = new HashSet<String>(Arrays.asList(
    	    "walk_towards","walk_away","run_towards","run_away","jump","crouch","stand"
    ));

	private String move;
	
	public Move(String move) {
		this.move = move;
	}

	public String getValue() {
		return move;
	}
	
	public List<AST> getChildren() {
		return new LinkedList<AST>();
	}
	
	public static String describeValidValues() {
		return "Valid moves are: "+VALID_MOVES;
	}
	
	public static boolean isValidValue(String move) {
		return VALID_MOVES.contains(move);
	}
	
	public static class UndecidedMove extends Move {

		List<Move> optionalMoves;
		
		public UndecidedMove(List<String> moves) {
			super(null); // we don't use parent members
			this.optionalMoves = new ArrayList<Move>();
			for(String move: moves) {
				this.optionalMoves.add(new Move(move));
			}
		}
		
		//TODO override methods that need a random move here:
		public List<AST> getChildren() {
			return new LinkedList<AST>(optionalMoves);
		}
		
	}

}