package safcr.ast;

public class Rule implements Node{
	private Node condition;
	private Node action;
	
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

	
}
