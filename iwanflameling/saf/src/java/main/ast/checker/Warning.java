package ast.checker;

import ast.ASTNode;

public class Warning extends Message {
	
	public Warning(String msg, ASTNode node){
		super(msg, node);
	}
}
