package saf.checker;

public interface Element{
	void accept(ElementVisitor visitor);
}
