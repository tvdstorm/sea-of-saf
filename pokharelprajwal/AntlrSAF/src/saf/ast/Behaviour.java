package saf.ast;

import java.util.ArrayList;

public class Behaviour implements INodeVisitable {

	private final ArrayList<Rule> rules = new ArrayList<Rule>();
	
	@Override
	public void accept(INodeVisitor v) {
		for(Rule r : rules){
			r.accept(v);
		}
		v.visit(this);
	}
	
	public ArrayList<Rule> getRules() {
		return rules;
	}

	public void addRule(Rule rule) {
		this.rules.add(rule);
	}


}
