package safcr.ast;

import java.util.ArrayList;
import java.util.List;

public class Behaviour implements Node{
	private List<Node> rules;
	
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
}
