package visitor;

import java.io.OutputStream;
import java.io.PrintStream;

public class FighterDumper extends FighterVisitor {

	public void visit(Fighter.FighterElement i) {
		System.out.print(i);
	}
	
	public void visit(Fighter.Personality p) {
		System.out.print(p);
	}
	public void visit(Fighter.Identifier i) {
		System.out.print(i);
	}
}
