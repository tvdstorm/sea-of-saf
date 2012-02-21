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
	
	private List<SimpleAction> choices = new ArrayList<SimpleAction>();
	
	public Choose(){
		
	}


	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);

	}
	
	public void addChoice(SimpleAction choice){
		this.choices.add(choice);
	}
	
	public List<SimpleAction> getChoices(){
		return this.choices;
	}

}
