package fighter;

import java.util.ArrayList;

import fighter.checker.Visitor;

//TODO check
public class Behaviour extends ArrayList<Rule> implements ASTNode {
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);

	}

}
