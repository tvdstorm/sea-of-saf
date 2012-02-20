/**
 * 
 */
package saf.fighter;

import java.util.Collections;
import java.util.List;

public class Move implements AST {

	private String move;
	
	
	public Move(String move) {
		this.move = move;
	}

	public String getName() {
		return move;
	}
	
	public List<AST> getChildren() {
		return Collections.emptyList();
	}

	public int getSteps() {
		if(move.startsWith(RUN)){
			return RUN_STEPS;
		}
		if(move.equals(JUMP)) {
			return JUMP_STEPS;
		}
		return 1;
	}
	
	public double getDistance() {
		int directionModifier=1;
		if(move.endsWith(AWAY)){
			directionModifier = -1;
		}
		
		if(move.startsWith(WALK)){
			return WALK_DISTANCE_PERCENTAGE * directionModifier;
		}
		if(move.startsWith(RUN)){
			return RUN_DISTANCE_PERCENTAGE * directionModifier;
		}
		if(move.equals(JUMP)) {
			return JUMP_DISTANCE_PERCENTAGE * directionModifier;
		}
		return 0.0;
	}

}