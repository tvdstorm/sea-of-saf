package ast.checker;

import ast.ASTNode;
import ast.Printer;

public abstract class Message extends Throwable {

	private String msg;
	private ASTNode node;
	
	public Message(String msg, ASTNode node){
		this.msg = msg;
		this.node = node;
	}
	
	@Override
	public String toString() {
		String superMsg = super.toString();
		String result = superMsg + ":[" + this.msg + "], " + Printer.print(node);
		return result;
	}
}
