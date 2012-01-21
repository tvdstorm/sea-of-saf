package AST;

import org.antlr.runtime.tree.*;
import org.antlr.runtime.Token;

public class Node extends CommonTree {
//	public String text; 
	
	public Node(Token t) {
		super(t);
//		text = (t != null? t.getText(): "[]");
	}
	public Node(Node node) { super(node); }  
//	public String toString() {
//		return text + super.toString();
//	}
}
