package saf.ast;

import saf.ast.util.Printer;
import saf.ast.util.Visitor;

public abstract class ASTNode {

	public abstract void accept(Visitor visitor);
	
	@Override
	public String toString() {
		return Printer.print(this);
	}
}
