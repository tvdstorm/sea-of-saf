package safcr.data;

import java.util.ArrayList;
import java.util.List;

public class MoveData {
	private List<String> moveData;
	private String[] defaultMoves = {"jump", "crouch", "stand", "run_towards", "run_away", "walk_towards", "walk_away"};
	
	public MoveData(){
		moveData = new ArrayList<String>();
		
		for(String s : defaultMoves){
			moveData.add(s);
		}
	}
	
	public List<String> getMoves(){
		return moveData;
	}
	
}
