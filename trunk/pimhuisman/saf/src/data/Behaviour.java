package data;

import java.util.List;
import core.BaseTreeVisitor;

public class Behaviour extends BaseData {

	private final List<Rule> rules;
	
	public Behaviour(List<Rule> rules) {
		this.rules = rules;
	}
	
	public List<Rule> getRules() {
		return rules;
	}
	
	public Actions getValidActions(List<String> environment) {
		for ( Rule rule : rules ) {
			Condition condition = rule.getCondition();
			// Choose the actions related to this rule if and only if it holds true
			if ( condition.evaluateCondition(environment) ) {
				return rule.getAction();
			}
		}
		return null;
	}

	@Override
	public void acceptTreeVisitor(BaseTreeVisitor treeVisitor) {
		treeVisitor.visit(this);
		for ( Rule rule : rules ) {
			rule.acceptTreeVisitor(treeVisitor);
		}
	}
	
}
