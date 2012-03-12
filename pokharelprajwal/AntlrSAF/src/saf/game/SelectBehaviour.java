package saf.game;

import java.util.ArrayList;
import java.util.List;

import saf.ast.Bot;
import saf.ast.Characterstics;
import saf.ast.Rule;
import saf.ast.action.Action;
import saf.ast.action.Function;
import saf.ast.action.Ident;
import saf.ast.action.Operator;
import saf.ast.action.Parameters;
import saf.utils.Config;

public class SelectBehaviour {

	private Bot _fighter;
	private List<Rule> _allRules = new ArrayList<Rule>();
	private List<Function> _allFunctions = new ArrayList<Function>();
	
	SelectBehaviour(Bot fighter){
		this._fighter = fighter;
	}
	
	private List<Characterstics> getCharacterstics(){
		return _fighter.getCharacterstics();
	}
	
	private List<Rule> getFighterRules(){		
		return _fighter.getRules();
	}
	
	public List<Rule> getAllRules(String condition){
		refreshRules();
		return _allRules;
	}
	
	private void refreshRules(){
		_allRules.clear();
		_allFunctions.clear();
		getAllRules(getFighterRules());
	}
	
	public List<Function> getAllFunctions(){
		refreshRules();
		return _allFunctions;
	}
	
	private List<Function> GetFunctions(Rule rule){
		
		List<Function> func = new ArrayList<Function>();
		List<Action> actions = rule.GetAction();
		for (Action a : actions) {
			if(a instanceof Function){
				func.add((Function)a);
			}else if(a instanceof Ident){
				func.add(new Function(((Ident)a).getName(),new Parameters("","")));
			}
		}
		
		return func;
	}
	
	private void getAllRules(List<Rule> rules){
		
		for (Rule rule : rules) {
			 if(rule.GetRules().size()>0){
				 _allFunctions.addAll(GetFunctions(rule));
				 _allRules.add(rule);
				 getAllRules(rule.GetRules());
			 }
			 else {
				 _allFunctions.addAll(GetFunctions(rule));
				 _allRules.add(rule);
			}
			 
			 List<Operator> operators = rule.GetOperator();
			 List<Rule> opRules = new ArrayList<Rule>();
			 for (Operator operator : operators) {
				 if(operator.getAction() instanceof Function)
					 _allFunctions.add((Function)operator.getAction());
				opRules.add(operator.getRule());
			 }
			 
			 getAllRules(opRules);
		}
		
	}
	
	public int getCharactersticValue(String name){
		
		for(Characterstics c : getCharacterstics()){
			if(c.getName().toLowerCase().equals(name.toLowerCase())){
				return Integer.parseInt(c.getValue());
			}
		}
		
		return Config.DEFAULT_STRENGTH;
	}

	public Bot getFighter() {
		return _fighter;
	}
	
	public Function GetFunction(String condition){
		getAllFunctions();
		for(Function f : _allFunctions){
			if(f.getCondition().toLowerCase().equals(condition.toLowerCase())){			
				return f;
			}
		}
		
		return GetFunction(Config.DEFAULTCONDITION);
	}

	
}
