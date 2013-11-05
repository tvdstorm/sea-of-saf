package saf.ast.fighter;

import java.util.List;

import saf.ast.ASTNode;
import saf.ast.util.Visitor;

public class Behaviour extends ASTNode {
	private List<Rule> rules;
	
	public Behaviour(List<Rule> rules) {
		this.rules = rules;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public List<Rule> getRules() {
		return rules;
	}

}
