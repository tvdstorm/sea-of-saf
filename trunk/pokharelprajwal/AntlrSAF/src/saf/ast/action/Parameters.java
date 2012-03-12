package saf.ast.action;

import saf.ast.INodeVisitable;
import saf.ast.INodeVisitor;

public class Parameters implements INodeVisitable {
	
	private String _firstConditon;
	private String _secondCondition;
	private Choose _firstChoose;
	private Choose _secondChoose;
	private ParameterType _parameterType;
	
	public enum ParameterType {
		IdentAndIdent,
		ChooseAndIdent,
		IdentAndChoose,
		ChooseAndChoose
	}
	
	public ParameterType getParameterType(){
		return _parameterType;
	}
	
	public Parameters(String firstCondition, String secondCondition){
		this._firstConditon = firstCondition;
		this._secondCondition = secondCondition;
		_parameterType = ParameterType.IdentAndIdent;
	}
	
	public Parameters(Choose firstCondition, String secondCondition){
		this._secondCondition = secondCondition;
		this._firstChoose = firstCondition;
		_parameterType = ParameterType.ChooseAndIdent;
	}
	
	public Parameters(String firstCondition, Choose secondCondition){
		this._firstConditon = firstCondition;
		this._secondChoose = secondCondition;
		_parameterType = ParameterType.IdentAndChoose;
	}
	
	public Parameters(Choose firstCondition, Choose secondCondition){
		this._firstChoose = firstCondition;
		this._secondChoose = secondCondition;
		_parameterType = ParameterType.ChooseAndChoose;
	}

	@Override
	public void accept(INodeVisitor v) {
		if(_firstChoose != null) _firstChoose.accept(v);
		if(_secondChoose != null) _secondChoose.accept(v);
		v.visit(this);
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
