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
		String moveActionVal =(br.getMoveActionValue().replace("choose", ""));
		String fightActionVal =(br.getFightActionValue().replace("choose", ""));
		
		if(!dt.moveActions.contains(moveActionVal)) {
			System.out.println(moveActionVal);
			return false;
		}

		if(!dt.fightActions.contains(fightActionVal)) {
			return false;
		}
			
		return true;
	}
	
	public void visit(Personality personality) 
	{
		String persId = personality.getId();
		Integer persVal = personality.getValue();
		
		if(!dt.personalities.contains(persId)) {
			errorList.add("Personality key '" + persId + "' is not valid");
		} else if(persVal < 0 || persVal > 9) {
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
