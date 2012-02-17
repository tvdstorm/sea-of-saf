/**
 * 
 */
package saf.fighter;

import java.util.Collections;
import java.util.List;

public class Attack implements AST {
	
	private String attack;
	
	
	public Attack(String attack) {
		this.attack = attack;
	}

	public String getName() {
		return attack;
	}
	
	public List<AST> getChildren() {
		return Collections.emptyList();
	}
	
}