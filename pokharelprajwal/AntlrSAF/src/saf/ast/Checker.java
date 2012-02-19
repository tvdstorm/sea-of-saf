package saf.ast;

import java.math.BigInteger;
import saf.utils.*;

import java.util.ArrayList;
import java.util.List;

import saf.ast.action.*;
import saf.utils.Int;

public class Checker extends Config implements INodeVisitor  {

	private List<String> _errorMessage;
	
	public Checker(){
		this._errorMessage = new ArrayList<String>();
	}
	
	@Override
	public void visit(Bot bot) {
		_errorMessage.add(bot.getName());
	}

	@Override
	public void visit(Characterstics characterstics) {
		
		//check for valid characterstics
		String errorMsg = "";
		if(this.Characterstics.contains(characterstics.getName())){
			
			//check for range between 0 and 9
			Boolean insertMsg = false;
			try {
				BigInteger value = new BigInteger(characterstics.getValue());
				if(value.intValue() < MIN_STRENGTH || value.intValue() > MAX_STRENGTH) insertMsg = true;
				
			} 
			catch (Exception e) {
				insertMsg = true;
			}
			
			if(insertMsg) errorMsg=  "Characterstics '" + characterstics.getName() + "' should be between " + MIN_STRENGTH +" and " + MAX_STRENGTH;
			
		}else {
		
			errorMsg = "'" + characterstics.getName() + "' is not a valid characterstics property.";
		
		}
		
		if(errorMsg.length() > 0)
			_errorMessage.add(errorMsg);
	}

	@Override
	public void visit(Rule rule) {
		//_errorMessage.add(rule.GetTreeString());
	}

	@Override
	public void visit(Behaviour behaviour) {
		_errorMessage.add("----------------behaviour----------------");
	}

	@Override
	public void visit(Personality personality) {
		
		//Add missing properties
		ArrayList<Characterstics> allCharacterstics = personality.getCharacterstics();
		for (String name : this.Characterstics) {
			if(!IsCharactersticsPresent(name, allCharacterstics)){
				personality.addCharacterstics(new Characterstics(name, DEFAULT_STRENGTH.toString()));
			}
		}
		
	}

	private Boolean IsCharactersticsPresent(String name, ArrayList<Characterstics> list){
		
		for (Characterstics c : list) {
			if(c.getName().toLowerCase().equals(name.toLowerCase())) return true;
		}
		
		return false;
	}
	
	@Override
	public void visit(Choose choose) {
		
		//check for same valid type
		Boolean fightActionType1 = false;
		Boolean fightActionType2 = false;
		Boolean moveActionType1 = false;
		Boolean moveActionType2 = false;
		if(this.FIGHTSACTOINTYPE.contains(choose.getActionFirst().toLowerCase())){
			fightActionType1 = true;
		}
		
		if(this.FIGHTSACTOINTYPE.contains(choose.getActionSecond().toLowerCase())){
			fightActionType2 = true;
		}
		
		if(this.MOVEACTIONTYPE.contains(choose.getActionFirst().toLowerCase())){
			moveActionType1 = true;
		}
		
		if(this.MOVEACTIONTYPE.contains(choose.getActionSecond().toLowerCase())){
			moveActionType2 = true;
		}
		
		if(fightActionType1 == false && moveActionType1 == false){
			_errorMessage.add("'" + choose.getActionFirst()+  "' is not a valid action type for choose");
		}
		
		if(fightActionType2 == false && moveActionType2 == false){
			_errorMessage.add("'" + choose.getActionSecond()+  "' is not a valid action type for choose");
		}
				
		if((fightActionType1 && moveActionType2) || (fightActionType2 && moveActionType1))
			_errorMessage.add("'" + choose.getActionFirst()+ "' and '"+ choose.getActionSecond()+ "' should be of same Action type for choose" );
		
		//_errorMessage.add("Choose " + choose.getActionFirst() + " " +choose.getActionSecond());
	}

	@Override
	public void visit(Int integer) {
		_errorMessage.add(integer.getValue().toString());
	}

	@Override
	public void visit(Function function) {
		//the default ident for action is the condition types
		if(!this.CONDITIONTYPE.contains(function.getCondition().toLowerCase())){
				_errorMessage.add("Invalid Condition type '" + function.getCondition() + "'");
		}
				
		//_errorMessage.add(function.GetTreeString());
	}

	@Override
	public void visit(Parameters parameters) {
		//Check for valid parameters for a function
		//for ident ident
		if(parameters.getFirstConditon() != null && parameters.getSecondCondition() != null){
			if(!this.MOVEACTIONTYPE.contains(parameters.getFirstConditon().toLowerCase())){
				_errorMessage.add( "'" + parameters.getFirstConditon() + "' is not a valid Moveaction type.");
			}
			
			
			if(!this.FIGHTSACTOINTYPE.contains(parameters.getSecondCondition().toLowerCase())){
				_errorMessage.add( "'" + parameters.getSecondCondition() + "' is not a valid Fightaction type.");
			}
		}
		
		//for choose ident
		if(parameters.getFirstChoose() != null && parameters.getSecondCondition() != null){
					
			if(!this.FIGHTSACTOINTYPE.contains(parameters.getSecondCondition().toLowerCase())){
				_errorMessage.add( "'" + parameters.getSecondCondition() + "' is not a valid Fightaction type.");
			}
		}
		
		//for ident choose
		if(parameters.getFirstConditon() != null && parameters.getSecondChoose() != null){
							
			if(!this.MOVEACTIONTYPE.contains(parameters.getFirstConditon().toLowerCase())){
				_errorMessage.add( "'" + parameters.getFirstConditon() + "' is not a valid Moveaction type.");
			}
		}
		
		//_errorMessage.add(parameters.GetTreeString());
	}
	
	@Override
	public void visit(Ident ident) {
		
		//the default ident for action is the condition types
		if(!this.CONDITIONTYPE.contains(ident.getName().toLowerCase())){
			_errorMessage.add("Invalid Condition type '" + ident.getName() + "'");
		}
		
		//_errorMessage.add(ident.GetTreeString());
	}

	@Override
	public void visit(Operator and) {
		_errorMessage.add("operator");
	}

	public List<String> getErrorMessages() {
		return _errorMessage;
	}

	public void addErrorMessage(String errorMesszge) {
		this._errorMessage.add(errorMesszge);
	}
			
}
