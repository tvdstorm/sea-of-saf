package visitor;

import java.io.OutputStream;

import java.io.PrintStream;

import ast.*;

public class FighterDumper extends FighterVisitor {

	public void visit(INode i) {
		System.out.print(i);
	}
	
	public void visit(Personality p) {
		System.out.print(p);
	}
	public void visit(Identifier i) {
		System.out.print(i);
	}

	@Override
	public void startVisit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void finishVisit() {
		// TODO Auto-generated method stub
		
	}
}
