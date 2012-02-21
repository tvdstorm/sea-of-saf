/**
 * 
 */
package ast.action;

import ast.Visitor;

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

}
