package saf.structure;

import saf.checker.Element;
import saf.checker.ElementVisitor;

public class ConditionSimple extends Condition implements Element {
	public ConditionSimple(String Value)
	{
		this.value = Value;
	}
	
    public void accept(ElementVisitor visitor) {
        visitor.visit(this);
    }
	
	private final String value;
	public String getValue() {
		return value;
	}
}
