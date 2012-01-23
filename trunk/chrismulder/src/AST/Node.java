package AST;

import org.antlr.runtime.tree.*;
import org.antlr.runtime.Token;

public class Node extends CommonTree {
	
	public Node(Token t) {
		super(t);
	}
	
	public boolean validate() {
		return true;
	}
}
