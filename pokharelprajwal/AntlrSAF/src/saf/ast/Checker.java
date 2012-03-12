package saf.ast;

import java.math.BigInteger;
import saf.utils.*;
import java.util.ArrayList;
import java.util.List;
import saf.ast.action.*;


public class Checker implements INodeVisitor  {

	private List<String> _errorMessage;
	private Boolean defaultRule;
	
	public Checker(){
		this._errorMessage = new ArrayList<String>();
		defaultRule = false;
	}
	
	@Override
	public void visit(Bot bot) {
		
	}

	@Override
	public void visit(Characterstics characterstics) {
		
		//check for valid characteristics
		String errorMsg = "";
		if(Config.Characterstics.contains(characterstics.getName())){
			
			//check for range between 0 and 9
			Boolean insertMsg = false;
			try {
				BigInteger value = new BigInteger(characterstics.getValue());
				if(value.intValue() < Config.MIN_STRENGTH || value.intValue() > Config.MAX_STRENGTH) insertMsg = true;
			} 
			catch (Exception e) {
				insertMsg = true;
			}
			
			if(insertMsg) errorMsg=  "Characterstics '" + characterstics.getName() + "' should be between " + Config.MIN_STRENGTH +" and " + Config.MAX_STRENGTH;
			
			
		}else {
		
			errorMsg = "'" + characterstics.getName() + "' is not a valid characterstics property.";
		}
		
		if(errorMsg.length() > 0)
			_errorMessage.add(errorMsg);
	}

	@Override
	public void visit(Rule rule) {
		
	}

	@Override
	public void visit(Behaviour behaviour) {
		if(!defaultRule) _errorMessage.add("Missing default rule 'always'");
	}

	@Override
	public void visit(Personality personality) {
		
		//Add missing properties
		ArrayList<Characterstics> allCharacterstics = personality.getCharacterstics();
		for (String name : Config.Characterstics) {
			Integer count = getCharactersticsCount(name, allCharacterstics);
			if(count == 0){
				personality.addCharacterstics(new Characterstics(name, Config.DEFAULT_STRENGTH.toString()));
			}else if(count > 1){
				_errorMessage.add(String.format("Dublicate '%s' characterstic's present.", name));
			}
		}
		
	}

	private Integer getCharactersticsCount(String name, ArrayList<Characterstics> list){
		
		Integer count = 0;
		for (Characterstics c : list) {
			if(c.getName().toLowerCase().equals(name.toLowerCase())) count++;
		}
		
		return count;
	}
	
	@Override
	public void visit(Choose choose) {
		
		//check for same valid type
		Boolean fightActionType1 = Config.FIGHTSACTOINTYPE.contains(choose.getActionFirst().toLowerCase());
		Boolean fightActionType2 = Config.FIGHTSACTOINTYPE.contains(choose.getActionSecond().toLowerCase());
		Boolean moveActionType1 = Config.MOVEACTIONTYPE.contains(choose.getActionFirst().toLowerCase());
		Boolean moveActionType2 = Config.MOVEACTIONTYPE.contains(choose.getActionSecond().toLowerCase());
		
		if(fightActionType1 == false && moveActionType1 == false){
			_errorMessage.add("'" + choose.getActionFirst()+  "' is not a valid action type for choose");
		}
		
		if(fightActionType2 == false && moveActionType2 == false){
			_errorMessage.add("'" + choose.getActionSecond()+  "' is not a valid action type for choose");
		}
				
		if((fightActionType1 && moveActionType2) || (fightActionType2 && moveActionType1))
			_errorMessage.add("Actions '" + choose.getActionFirst()+ "' and '"+ choose.getActionSecond()+ "' should be of same type for choose" );
				
		//check default rule
		defaultRule = defaultRule || CheckAlways(choose.getActionFirst());
		defaultRule = defaultRule || CheckAlways(choose.getActionSecond());
		
	}
	
	private Boolean CheckAlways(String value){
		return Config.DEFAULTCONDITION.equals(value.toLowerCase());
	}

	@Override
	public void visit(Function function) {
		
		//the default ident for action is the condition types
		if(!Config.CONDITIONTYPE.contains(function.getCondition().toLowerCase())){
				_errorMessage.add("Invalid Condition type '" + function.getCondition() + "'");
		}
			
		//check default rule
		defaultRule = defaultRule || CheckAlways(function.getCondition());
		
	}

	@Override
	public void visit(Parameters parameters) {
		
		switch (parameters.getParameterType()) {
			case IdentAndIdent:
				checkMoveCondition(parameters);
				checkFightCondition(parameters);		
				break;
			case ChooseAndIdent:
				checkFightCondition(parameters);
				break;
			case IdentAndChoose:
				checkMoveCondition(parameters);
				break;
		}
		
		//check default rule
	    if(parameters.getFirstConditon() != null)	defaultRule = defaultRule || CheckAlways(parameters.getFirstConditon());
	    if(parameters.getSecondCondition() != null) defaultRule = defaultRule || CheckAlways(parameters.getSecondCondition());
		
	}
	
	private void checkFightCondition(Parameters parameters){
		
		if(!Config.FIGHTSACTOINTYPE.contains(parameters.getSecondCondition().toLowerCase())){
			_errorMessage.add( "'" + parameters.getSecondCondition() + "' is not a valid Fightaction type.");
		}
		
	}
	
	private void checkMoveCondition(Parameters parameters){
		
		if(!Config.MOVEACTIONTYPE.contains(parameters.getFirstConditon().toLowerCase())){
			_errorMessage.add( "'" + parameters.getFirstConditon() + "' is not a valid Moveaction type.");
		}
		
	}
	
	@Override
	public void visit(Ident ident) {
		
		//the default ident for action is the condition types
		if(!Config.CONDITIONTYPE.contains(ident.getName().toLowerCase())){
			_errorMessage.add("Invalid Condition type '" + ident.getName() + "'");
		}
		
		//check default rule
		defaultRule = defaultRule || CheckAlways(ident.getName());
		
	}

	@Override
	public void visit(Operator and) {
	}

	public List<String> getErrorMessages() {
		return  _errorMessage;
	}

	public void addErrorMessage(String errorMesszge) {
		this._errorMessage.add(errorMesszge);
	}
			
}
