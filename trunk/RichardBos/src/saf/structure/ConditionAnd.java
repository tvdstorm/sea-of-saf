package saf.structure;

import saf.checker.Element;
import saf.checker.ElementVisitor;

public class ConditionAnd extends ConditionClause implements Element {
	public ConditionAnd(Condition firstCondition, Condition secondCondition)
	{
		this.firstCondition = firstCondition;
		this.secondCondition = secondCondition;
	}
			
	public void accept(ElementVisitor visitor) {
        visitor.visit(this);
    }
}
