/**
 * 
 */
package ast.action;

import java.util.ArrayList;
import java.util.List;

import ast.ASTNode;
import ast.Visitor;

/**
 * @author iwan
 *
 */
public class Choose extends Action {
	
	private List<String> choices = new ArrayList<String>();
	
	public Choose(){
		
	}

	/* (non-Javadoc)
	 * @see ast.ASTNode#accept(ast.Visitor)
	 */
	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub

	}
	
	public void addChoice(String choice){
		this.choices.add(choice);
	}

}
