package data;

import java.util.List;
import core.BaseTreeVisitor;

public interface Condition {

	public abstract Boolean evaluateCondition(List<String> environment);
	public abstract void acceptTreeVisitor(BaseTreeVisitor treePrinter);
	
}
