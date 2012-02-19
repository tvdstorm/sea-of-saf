package saf.ast;

import java.util.ArrayList;

public class Behaviour implements INodeVisitable {

	private final ArrayList<Rule> rules = new ArrayList<Rule>();
	
	@Override
	public void accept(INodeVisitor v) {
		v.visit(this);
		for(Rule r : rules){
			r.accept(v);
		}
	}

	@Override
	public String GetTreeString() {
		String newLine = System.getProperty("line.separator");
		StringBuilder retStr = new StringBuilder();
		for(Rule r : rules){
			retStr.append(newLine);
			retStr.append(r.GetTreeString());
		}
		return retStr.toString();
	}

	public ArrayList<Rule> getRules() {
		return rules;
	}

	public void addRule(Rule rule) {
		this.rules.add(rule);
	}

}
