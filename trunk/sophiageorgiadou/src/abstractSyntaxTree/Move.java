package abstractSyntaxTree;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import checker.Checker;
import enumCheckerTypes.*;

/**
 * Represents the move attribute
 * @author Sofia
 *
 */
public class Move extends Checker{
	
	private ArrayList<String> moves;
	
	/**
	 * Constructor
	 */
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
	
	@Override
	public boolean IsAValidWord() {
		try {
			for(int i=0;i<this.moves.size();i++){
				ValidMoveWord.valueOf(this.moves.get(i).toUpperCase());
			}
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null,"CHECKER ERROR: See console for details");
			System.out.println("CHECKER ERROR: A Move word is not valid\nDetails: "+e.getMessage());
			System.exit(-1);
		}
		System.out.println("Checker status: SUCCEED");	
		return true;
	}
}
