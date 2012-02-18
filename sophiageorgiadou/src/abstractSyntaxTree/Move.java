package abstractSyntaxTree;

import java.util.ArrayList;

public class Move {
	
	private ArrayList<String> moves;
	
	public Move(){
		this.setMoves(new ArrayList<String>());
	}

	public ArrayList<String> getMoves() {
		return moves;
	}

	public void setMoves(ArrayList<String> moves) {
		this.moves = moves;
	}

	public String toString(){
		String temp="Moves: ";
		
		for(int i=0;i<this.moves.size();i++){
			temp+=this.moves.get(i)+",";
		}
		return temp;
	}
}