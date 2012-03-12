package saf.ast.action;
import saf.ast.*;

public class Operator extends Action {

	private final Action _action;
	private final Rule _rule;
	private final String _operator;

	public Operator(String operator, Action action, Rule rule){
		this._operator = operator;
		this._action = action;
		this._rule = rule;
	}
	
	@Override
	public void accept(INodeVisitor v) {
		if(getAction() != null) getAction().accept(v);
		getRule().accept(v);
		v.visit(this);
	}

	public Action getAction() {
		return _action;
	}

	public Rule getRule() {
		return _rule;
	}

	public String getOperator() {
		return _operator;
	}

	

}
