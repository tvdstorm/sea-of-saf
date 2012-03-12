package saf.ast.condition;

import saf.fight.validate.IConditionVisitable;
import saf.fight.validate.IConditionVisitor;
import saf.visitor.*;

public class Condition implements IVisitable, IConditionVisitable{

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);		
	}

	@Override
	public boolean accept(IConditionVisitor visitor) {
		return visitor.validateCondition(this);
	}
}
