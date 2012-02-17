package AbstractSyntaxTree;

import java.util.ArrayList;

public class Move {
	
	private ArrayList<Move> moves;
	
	public Move(){
		this.setMoves(new ArrayList<Move>());
	}

	public ArrayList<Move> getMoves() {
		return moves;
	}

	public void setMoves(ArrayList<Move> moves) {
		this.moves = moves;
	}

}
