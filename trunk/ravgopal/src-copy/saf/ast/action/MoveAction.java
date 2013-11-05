package saf.ast.action;

import java.util.List;

import saf.ast.util.Visitor;

public class MoveAction extends Action {

	public MoveAction(String move) {
		super(move);
	}
	
	public MoveAction(List<String> moves) {
		super(moves);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
