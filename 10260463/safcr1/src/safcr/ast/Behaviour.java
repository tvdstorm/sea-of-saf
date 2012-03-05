package safcr.ast;

import java.util.ArrayList;
import java.util.List;

public class Behaviour implements Node{
	private final List<Rule> rules;
	
	public Behaviour(){
		super();
		rules = new ArrayList<Rule>();
	}
	
	public List<Rule> getRules(){
		return rules;
	}
	
	public void addRule(Rule rule) {
		rules.add(rule);
	}
	
	@Override
	public void accept(VisitorInterface v) {
		v.visit(this);	
	}
}
