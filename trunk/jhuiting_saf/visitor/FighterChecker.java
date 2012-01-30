package visitor;

import java.util.ArrayList;
import java.util.List;

import ast.*;

public class FighterChecker extends FighterVisitor {
	
	public List<String>	errorList = new ArrayList<String>();
	
	public FighterCheckerData dt;
	
	public FighterChecker() 
	{
		dt = new FighterCheckerData();
	}
	
	public void visit(BehaviourRule br) {
		
		if(!isValidBehaviourRule(br)) {
			errorList.add("Behaviour value '" + br.toString() + "' is not valid");
		}
	}
	
	private boolean isValidBehaviourRule(BehaviourRule br)
	{
		Identifier condition = br.getCondition();
		
		if(!dt.moveActions.contains(br.getMoveAction())) {
			return false;
		}

		else if(!dt.fightActions.contains(br.getFightAction())) {
			return false;
		}
			
		return true;
	}
	
	public void visit(Personality personality) 
	{
		String persVal = personality.getId().getValue();
		if(!dt.personalities.contains(persVal)) {
			errorList.add("Personality value '" + persVal + "' is not valid");
		}
	}
	
	public void startVisit() {
		// TODO Auto-generated method stub
		
	}

	public void endVisit() {
		System.out.println("\n --- Errors ---");
		
		for(String err : errorList) {
			System.out.println(err);
		}
		
	}

}
