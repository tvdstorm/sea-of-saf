/**
 * 
 */
package ast.action;

import ast.AstVisitor;

/**
 * @author iwan
 *
 */
public class SimpleAction extends Action {
	
	String action;

	public SimpleAction(String action){
		this.action = action;
	}
	
	public String getAction(){
		return this.action;
	}
	
	@Override
	public void accept(AstVisitor astVisitor) {
		astVisitor.visit(this);
		
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof SimpleAction){
			SimpleAction action = (SimpleAction) obj;
			return this.action.equals(action.getAction());
		} else{
			return false;
		}
	}

}
