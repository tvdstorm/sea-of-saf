package saf.structure;

import saf.checker.Element;
import saf.checker.ElementVisitor;

public class ConditionOr extends ConditionClause implements Element {
	public ConditionOr(Condition firstCondition, Condition secondCondition)
	{
		this.firstCondition = firstCondition;
		this.secondCondition = secondCondition;
	}
	
	public void accept(ElementVisitor visitor) {
        visitor.visit(this);
        this.firstCondition.accept(visitor);
        this.secondCondition.accept(visitor);
    }
}
