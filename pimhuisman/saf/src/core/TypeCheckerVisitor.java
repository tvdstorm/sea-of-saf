package core;
import java.util.List;
import java.util.LinkedList;

import data.Behaviour;
import data.Characteristic;
import data.Fighter;
import data.Personality;
import data.Rule;

public class TypeCheckerVisitor extends BaseTreeVisitor {

	private List<String> errors;
	
	public TypeCheckerVisitor() {
		errors = new LinkedList<String>();
	}
	
	@Override
	public void visit(Fighter fighter) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(Personality personality) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(Behaviour behaviour) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(Characteristic characteristic) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(Rule rule) {
		// TODO Auto-generated method stub

	}

}
