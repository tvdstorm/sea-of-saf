package saf.structure;

import saf.checker.Element;
import saf.checker.ElementVisitor;

public class Condition implements Element {
	public Condition()
	{}
	
    public void accept(ElementVisitor visitor) {
        visitor.visit(this);
    }
}