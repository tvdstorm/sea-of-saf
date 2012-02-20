package safcr.ast;

import java.util.ArrayList;
import java.util.List;

public class Action implements Node{
	private final List<Node> types;
	
	public Action(Node actionType){
		types = new ArrayList<Node>();
		types.add(actionType);
	}
	
	@Override
	public void addNode(Node actionType) {
		types.add(actionType);
	}

	@Override
	public void accept(VisitorInterface v) {
		v.visit(this);
		for(Node type : types){
			type.accept(v);
		}
	}
}
