package data;

import java.util.List;
import core.BaseTreeVisitor;

public class SingleCondition extends BaseData implements Condition {

	private final String name;
	
	public SingleCondition(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public Boolean evaluateCondition(List<String> environment) {
		// If this condition is includes within the environment it is true.
		for ( String environmentValue : environment ) {
			if ( environmentValue.equals(name) ) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void acceptTreeVisitor(BaseTreeVisitor treeVisitor) {
		treeVisitor.visitSingleCondition(this);
	}
	
}
