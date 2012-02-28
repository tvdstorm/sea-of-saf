package model;

import util.Visitor;

public abstract class ASTNode {
	
	public abstract void accept(Visitor visitor);
	
}
