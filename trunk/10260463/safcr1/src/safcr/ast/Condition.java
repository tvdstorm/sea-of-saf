package safcr.ast;

import java.util.ArrayList;
import java.util.List;

public class Condition implements Node{
	private final String type;
	private List<String> errors;
	
	public Condition(String conditionType){
		type = conditionType;
		errors = new ArrayList<String>();
	}
	
	@Override
	public void addNode(Node actionType) {}
	
	@Override
	public String toTreeString(String indent) {
		return '\n' + indent + "condition" + 
			   '\n' + indent + "  " + type;
	}

	@Override
	public List<String> getErrors() {
		return errors;
	}
	
}
