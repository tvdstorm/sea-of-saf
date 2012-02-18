package safcr.ast;

import java.util.ArrayList;
import java.util.List;

public class Saf implements Node{
	private List<Node> nodes;
	
	public Saf(){
		nodes = new ArrayList<Node>();
	}
	
	@Override
	public void addNode(Node n) {
		nodes.add(n);
	}

	@Override
	public String toTreeString(String indent) {
		String s = "SAF";
		for(Node node : nodes){
			s += node.toTreeString(indent + "  ");
		}
		
		return s;
	}
}
