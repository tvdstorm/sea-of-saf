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
	
	public void AddToBehaviour(Behaviour behaviour){
		behaviour.addRule(this);
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
	
	@Override
	public String GetTreeString() {
		
		StringBuilder retStr = new StringBuilder();
		
		for(Action a : _action){
			//retStr.append(newLine);
			retStr.append(" ");
			retStr.append(a.GetTreeString());
		}

		for(Rule r : _rules){
			//retStr.append(newLine);
			retStr.append(" ");
			retStr.append(r.GetTreeString());
		}
		
		for(Operator o : _operator){
			//retStr.append(newLine);
			retStr.append(" ");
			retStr.append(o.GetTreeString());
		}
		
		return retStr.toString();
	}
	
}
