package safcr.ast;

import java.util.ArrayList;
import java.util.List;

public class Saf implements Node{
	private final List<Node> bots;
	
	public Saf(){
		bots = new ArrayList<Node>();
	}
	
	public List<Node> getBots(){
		return bots;
	}
	
	@Override
	public void addNode(Node n) {
		bots.add(n);
	}
	
	@Override
	public void accept(VisitorInterface v) {
		v.visit(this);
		for(Node b : bots){
			b.accept(v);
		}
	}
}
