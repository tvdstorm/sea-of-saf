package saf.ast.definition;

import saf.ast.FighterVisitor;

public class Choose extends Procedure {

	@Override
	public void accept(FighterVisitor visitor) {
		visitor.visit(this);
	}

}
