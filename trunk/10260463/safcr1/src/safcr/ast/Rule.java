package safcr.ast;

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
	public void accept(VisitorInterface v) {
		v.visit(this);
		condition.accept(v);
		action.accept(v);
	}
}
