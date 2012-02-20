package safcr.ast;

import java.util.ArrayList;
import java.util.List;

public class Behaviour implements Node{
	private final List<Node> rules;
	
	public Behaviour(){
		rules = new ArrayList<Node>();
	}
	
	public List<Node> getRules(){
		return rules;
	}
	
	@Override
	public void addNode(Node rule) {
		rules.add(rule);
	}

	@Override
	public void accept(VisitorInterface v) {
		v.visit(this);
		for(Node r : rules){
			r.accept(v);
		}
	}
}
