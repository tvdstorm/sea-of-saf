package safcr.ast;

import java.util.ArrayList;
import java.util.List;

public class Action implements Node{
	private List<Node> types;
	
	public Action(Node actionType){
		types = new ArrayList<Node>();
		types.add(actionType);
	}
	
	@Override
	public void addNode(Node actionType) {
		types.add(actionType);
	}

	@Override
	public String toTreeString(String indent) {
		String s = '\n' + indent + "action";
		for(Node type : types){
			s += type.toTreeString(indent + "  ");
		}
		
		return s;
	}
}
