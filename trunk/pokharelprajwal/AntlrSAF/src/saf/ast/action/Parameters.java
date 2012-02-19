package saf.ast.action;

import saf.ast.INodeVisitable;
import saf.ast.INodeVisitor;

public class Parameters implements INodeVisitable {
	
	private final String _firstConditon;
	private final String _secondCondition;
	private final Choose _firstChoose;
	private final Choose _secondChoose;
	private final String _returnString;
	
	public Parameters(String firstCondition, String secondCondition){
		this._firstConditon = firstCondition;
		this._secondCondition = secondCondition;
		this._firstChoose = null;
		this._secondChoose = null;
		this._returnString = firstCondition + " " + secondCondition;
	}
	
	public Parameters(Choose firstCondition, String secondCondition){
		this._firstConditon = null;
		this._secondCondition = secondCondition;
		this._firstChoose = firstCondition;
		this._secondChoose = null;
		this._returnString = firstCondition.GetTreeString() + " " + secondCondition;
	}
	
	public Parameters(String firstCondition, Choose secondCondition){
		this._firstConditon = firstCondition;
		this._secondCondition = null;
		this._firstChoose = null;
		this._secondChoose = secondCondition;
		this._returnString = firstCondition + " " + secondCondition.GetTreeString();
	}
	
	public Parameters(Choose firstCondition, Choose secondCondition){
		this._firstConditon = null;
		this._secondCondition = null;
		this._firstChoose = firstCondition;
		this._secondChoose = secondCondition;
		this._returnString = firstCondition.GetTreeString() + " " + secondCondition.GetTreeString();
	}

	@Override
	public void accept(INodeVisitor v) {
		v.visit(this);
		if(_firstChoose != null) _firstChoose.accept(v);
		if(_secondChoose != null) _secondChoose.accept(v);
	}

	@Override
	public String GetTreeString() {
		return this._returnString;
	}

	public String getFirstConditon() {
		return _firstConditon;
	}

	public String getSecondCondition() {
		return _secondCondition;
	}

	public Choose getFirstChoose() {
		return _firstChoose;
	}

	public Choose getSecondChoose() {
		return _secondChoose;
	}
}
