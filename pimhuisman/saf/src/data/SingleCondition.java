package data;

import core.BaseTreeVisitor;

public class SingleCondition extends BaseData implements Condition {

	private String name;
	
	public SingleCondition(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public Boolean evaluateCondition() {
		// TODO: Implement this.
		return false;
	}

	@Override
	public void acceptTreeVisitor(BaseTreeVisitor treePrinter) {
		System.out.println("single condition: "+name);
	}
	
}
