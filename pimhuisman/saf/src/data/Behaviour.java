package data;
import java.util.List;

import core.BaseTreePrinter;

public class Behaviour extends BaseData {

	private List<Rule> rules;
	
	public Behaviour(List<Rule> rules) {
		this.rules = rules;
	}
	
	public List<Rule> getRules() {
		return rules;
	}

	@Override
	public void acceptTreePrinter(BaseTreePrinter treePrinter) {
		treePrinter.visit(this);
		for ( Rule rule : rules ) {
			rule.acceptTreePrinter(treePrinter);
		}
	}
	
}
