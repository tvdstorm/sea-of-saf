package safcr.ast;

import java.util.ArrayList;
import java.util.List;

public class Behaviour implements Node{
	private final List<Node> rules;
	
	public Behaviour(){
		rules = new ArrayList<Node>();
	}
	
	@Override
	public void addNode(Node rule) {
		rules.add(rule);
	}

	@Override
	public String toTreeString(String indent) {
		String s = '\n' + indent + "rules";
		for(Node rule : rules){
			s += rule.toTreeString(indent + "  ");
		}
		
		return s;
	}

	@Override
	public List<String> getErrors() {
		List<String> allErrors = new ArrayList<String>();
		for(Node r : rules){
			allErrors.addAll(r.getErrors());
		}
		
		return allErrors;
	}
}
