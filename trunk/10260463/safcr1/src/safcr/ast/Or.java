package safcr.ast;

import java.util.ArrayList;
import java.util.List;

public class Or implements Node{
	private final List<Node> nodes;
	
	public Or(Node n1, Node n2){
		nodes = new ArrayList<Node>();
		nodes.add(n1);
		nodes.add(n2);
	}
	
	public List<Node> getOrNodes(){
		return nodes;
	}
	
	@Override
	public void addNode(Node n) {}
	
	@Override
	public void accept(VisitorInterface v) {
		v.visit(this);
		for(Node n : nodes){
			n.accept(v);
		}
	}
}
