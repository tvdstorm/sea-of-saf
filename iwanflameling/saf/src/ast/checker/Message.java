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
	
	public Message(String msg){
		this(msg, null);
	}
	
	@Override
	public String toString() {
		String result = null;
		String superMsg = super.toString();
		if(node != null){
			result = superMsg + ":[" + this.msg + "], " + Printer.print(node);
		} else {
			result = superMsg + ":[" + this.msg + "]";
		}
		return result;
	}
}
