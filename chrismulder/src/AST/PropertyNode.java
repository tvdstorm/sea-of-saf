package AST;

import org.antlr.runtime.Token;

public abstract class PropertyNode extends Node {

	public PropertyNode(Token t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	public PropertyNode(PropertyNode node) { super(node); }  
	
}
