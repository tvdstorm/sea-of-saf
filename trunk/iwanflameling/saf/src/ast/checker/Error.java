package ast.checker;

import ast.ASTNode;

public class Error extends Message {

	public Error(String msg, ASTNode node) {
		super(msg, node);
	}
	
	public Error(String msg) {
		super(msg);
	}

	
	
}
