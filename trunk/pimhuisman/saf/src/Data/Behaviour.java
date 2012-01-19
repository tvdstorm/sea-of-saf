package Data;
import java.util.LinkedList;

public class Behaviour {

	private LinkedList<Rule> rules;
	
	public Behaviour() {
		rules = new LinkedList<Rule>();
	}
	
	public void clearRules() {
		rules.clear();
	}
	
	public void addRule(Rule rule) {
		rules.add(rule);
	}
	
	public LinkedList<Rule> getRules() {
		return rules;
	}
	
}
