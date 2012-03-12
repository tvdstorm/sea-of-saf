package saf.ast;
import java.util.ArrayList;

import saf.ast.action.*;

public class Rule implements INodeVisitable {

	private final ArrayList<Rule> _rules = new ArrayList<Rule>();
	private final ArrayList<Action> _action = new ArrayList<Action>();
	private final ArrayList<Operator> _operator = new ArrayList<Operator>();
	
	public void AddRule(Rule rule){
		_rules.add(rule);
	}
	
	public ArrayList<Rule> GetRules(){
		return _rules;
	}
	
	public ArrayList<Action> GetAction(){
		return _action;
	}
	
	public ArrayList<Operator> GetOperator(){
		return _operator;
	}
	
	public void AddAction(Action action){
		_action.add(action);
	}
	
	private void RemoveAction(){
		Integer index = _action.size();
		if(index > 0)
		_action.remove(index - 1);
	}
	
	public void AddOperator(String operator, Action action, Rule rule){
		RemoveAction();
		Operator o = new Operator(operator, action, rule);
		_operator.add(o);
	}
		
	@Override
	public void accept(INodeVisitor v) {
		v.visit(this);
		
		for(Rule r : _rules){
			r.accept(v);
		}
		
		for(Action r : _action){
			r.accept(v);
		}
		
		for(Operator o : _operator){
			o.accept(v);
		}
		
	}

	
}
