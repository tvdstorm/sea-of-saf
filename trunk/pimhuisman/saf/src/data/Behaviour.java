package data;
import java.util.List;
import java.util.LinkedList;

public class Behaviour {

	private List<Rule> rules;
	
	public Behaviour() {
		rules = new LinkedList<Rule>();
	}
	
	public void clearRules() {
		rules.clear();
	}
	
	public void addRule(Rule rule) {
		rules.add(rule);
	}
	
	public List<Rule> getRules() {
		return rules;
	}
	
}
