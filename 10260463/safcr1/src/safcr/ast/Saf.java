package safcr.ast;

import java.util.ArrayList;
import java.util.List;

public class Saf implements Node{
	private final List<Node> bots;
	private List<String> errors;
	
	public Saf(){
		bots = new ArrayList<Node>();
		errors = new ArrayList<String>();
	}
	
	@Override
	public void addNode(Node n) {
		bots.add(n);
	}

	@Override
	public String toTreeString(String indent) {
		String s = "SAF";
		for(Node b : bots){
			s += b.toTreeString(indent + "  ");
		}
		
		return s;
	}
	
	@Override
	public List<String> getErrors() {
		List<String> allErrors = new ArrayList<String>();
		allErrors.addAll(errors);
		for(Node b : bots){
			allErrors.addAll(b.getErrors());
		}
		
		return allErrors;
	}
}
