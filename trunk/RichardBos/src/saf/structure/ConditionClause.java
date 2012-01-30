package saf.structure;

import saf.checker.Element;
import saf.checker.ElementVisitor;

public class ConditionClause extends Condition implements Element {
	
	protected Condition firstCondition = null;
	protected Condition secondCondition = null;
	
	public Condition getFirstCondition() {
		return firstCondition;
	}
	public Condition getSecondCondition() {
		return secondCondition;
	}
	
    public void accept(ElementVisitor visitor) {
        visitor.visit(this);
    }
	
}
