package saf.ast.action;

import saf.ast.INodeVisitor;

public class Function extends Action {

	private final String _condition;
	private final Parameters _parameters;
	
	public Function(String condition, Parameters parameters){
		this._condition = condition;
		this._parameters = parameters;
	}
	
	@Override
	public void accept(INodeVisitor v) {
		v.visit(this);
		_parameters.accept(v);
	}

	@Override
	public String GetTreeString() {
		return getCondition() + "[" + getParameters().GetTreeString() + "]";
	}

	public String getCondition() {
		return _condition;
	}

	public Parameters getParameters() {
		return _parameters;
	}

}
