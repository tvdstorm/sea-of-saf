package safcr.ast;

import java.util.ArrayList;
import java.util.List;

public class And implements Node{
	private List<Node> nodes;
	
	public And(Node n1, Node n2){
		nodes = new ArrayList<Node>();
		nodes.add(n1);
		nodes.add(n2);
	}
	
	@Override
	public void addNode(Node n) {}

	@Override
	public String toTreeString(String indent) {
		String s = '\n' + indent + "and";
		for(Node node : nodes){
			s += node.toTreeString(indent + "  ");
		}
		
		return s;
	}

}
