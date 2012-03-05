package safcr.ast;

public class Rule implements Node{
	private final Node condition;
	private final Action action;
	
	public Rule(Node ruleCondition, Action ruleAction){
		super();
		condition = ruleCondition;
		action = ruleAction;
	}
	
	public Node getCondition(){
		return condition;
	}
	
	public Action getAction(){
		return action;
	}
	
	@Override
	public void accept(VisitorInterface v) {
		v.visit(this);	
	}
}
