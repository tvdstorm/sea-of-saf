package safcr.ast;

import java.util.ArrayList;
import java.util.List;

public class Rule implements Node{
	private final Node condition;
	private final Node action;
	
	public Rule(Node ruleCondition, Node ruleAction){
		condition = ruleCondition;
		action = ruleAction;
	}
	
	@Override
	public void addNode(Node actionType) {}
	
	@Override
	public String toTreeString(String indent) {
		return '\n' + indent + "rule" +
				condition.toTreeString(indent + "  ") +
				action.toTreeString(indent + "  ");
	}

	@Override
	public List<String> getErrors() {
		List<String> allErrors = new ArrayList<String>();
		allErrors.addAll(condition.getErrors());
		allErrors.addAll(action.getErrors());
		
		return allErrors;
	}
}
