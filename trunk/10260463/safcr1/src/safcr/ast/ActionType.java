package safcr.ast;

import java.util.ArrayList;
import java.util.List;

public class ActionType implements Node{
	private final String type;
	private List<String> errors;
	
	public ActionType(String actionType){
		type = actionType;
		errors = new ArrayList<String>();
	}
	
	@Override
	public void addNode(Node n) { }

	@Override
	public String toTreeString(String indent) {
		return '\n' + indent + type;
	}

	@Override
	public List<String> getErrors() {
		return errors;
	}
}
