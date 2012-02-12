package saf.structure;

import java.util.List;

import saf.checker.Element;
import saf.checker.ElementVisitor;

public class Action implements Element {
	public Action(String value){
		this.value = value;
	}
	
    public void accept(ElementVisitor visitor) {
        visitor.visit(this);
    }
	
	private final String value;
	public String getValue() {
		return value;
	}
	
	public boolean equals(Object value)
	{
		return this.value.equals(value);
	}
	
	public String toString()
	{
		return value;
	}
}
