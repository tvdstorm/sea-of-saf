package data;

import core.BaseTreeVisitor;

public interface Condition {

	public abstract Boolean evaluateCondition();
	public abstract void acceptTreeVisitor(BaseTreeVisitor treePrinter);
	
}
