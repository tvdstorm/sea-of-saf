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

}