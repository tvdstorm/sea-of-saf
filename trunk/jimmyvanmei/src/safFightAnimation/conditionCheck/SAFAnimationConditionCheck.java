package safFightAnimation.conditionCheck;

import java.awt.Point;
import safAST.condition.AndCombineCondition;
import safAST.condition.CombineCondition;
import safAST.condition.Condition;
import safAST.condition.OrCombineCondition;
import safAST.condition.SingleCondition;
import safAST.enumType.ConditionType;

public class SAFAnimationConditionCheck implements ISAFAnimationConditionCheckVisitor{
	private int  HP;
	private Point lPosition, rPosition;
	
	private final int near = 150;
	private final int far = 300;
	private final int healthValue = 100;
	
	public SAFAnimationConditionCheck()
	{
		HP = -1;
		lPosition = new Point();
		rPosition = new Point();
	}
	
	public SAFAnimationConditionCheck(int hp, Point leftP, Point rightP)
	{
		HP = hp;
		lPosition = leftP;
		rPosition = rightP;
	}
	
	public void setConditionCheckerPosition(int hp, Point leftP, Point rightP)
	{
		HP = hp;
		lPosition = leftP;
		rPosition = rightP;
	}
	
	@Override
	public boolean checkCondition(Condition condition) {
		if (condition instanceof CombineCondition)
			return checkCombineCondition((CombineCondition)condition);
		return checkSingleCondition((SingleCondition)condition);
	}

	@Override
	public boolean checkCombineCondition(CombineCondition combineCondition) {
		if (combineCondition instanceof OrCombineCondition)
			return checkOrCombineCondition((OrCombineCondition)combineCondition);
		return checkAndCombineCondition((AndCombineCondition)combineCondition);
	}

	@Override
	public boolean checkOrCombineCondition(OrCombineCondition orCombineCondition) {
		boolean isRightCondition = true;
		
		Condition[] sc = orCombineCondition.getCombineConditions();
		if (sc[0] instanceof CombineCondition)
			isRightCondition = checkCombineCondition((CombineCondition)sc[0]) || checkSingleCondition((SingleCondition)sc[1]);
		else if (sc[1] instanceof CombineCondition)
			isRightCondition = checkCombineCondition((CombineCondition)sc[1]) || checkSingleCondition((SingleCondition)sc[0]);
		else if (sc[1] instanceof CombineCondition && sc[0] instanceof CombineCondition)
			isRightCondition = checkCombineCondition((CombineCondition)sc[1]) || checkCombineCondition((CombineCondition)sc[0]);
		else
			isRightCondition = (checkSingleCondition((SingleCondition)sc[0]) || checkSingleCondition((SingleCondition)sc[1]));
		
		return isRightCondition;
	}

	@Override
	public boolean checkAndCombineCondition(AndCombineCondition andCombineCondition) {
		boolean isRightCondition = true;
		
		Condition[] sc = andCombineCondition.getCombineConditions();
		if (sc[0] instanceof CombineCondition)
			isRightCondition = checkCombineCondition((CombineCondition)sc[0]) && checkSingleCondition((SingleCondition)sc[1]);
		else if (sc[1] instanceof CombineCondition)
			isRightCondition = checkCombineCondition((CombineCondition)sc[1]) && checkSingleCondition((SingleCondition)sc[0]);
		else if (sc[1] instanceof CombineCondition && sc[0] instanceof CombineCondition)
			isRightCondition = checkCombineCondition((CombineCondition)sc[1]) && checkCombineCondition((CombineCondition)sc[0]);
		else
			isRightCondition = checkAndConditionAtom((SingleCondition)sc[0], (SingleCondition)sc[1]);
	
		return isRightCondition;
	}
	
	private boolean checkAndConditionAtom(SingleCondition sCondA, SingleCondition sCondB)
	{
		boolean isValid = false;
		
		if (checkSingleCondition(sCondA) && checkSingleCondition(sCondB))
		{
			switch (ConditionType.valueOf(sCondA.getConditionName()))
			{
				case always:
				isValid = true;
				break;
				
				case near: 
				if (sCondB.getConditionName().equalsIgnoreCase("far"))
					isValid = false;
				else
					isValid = true;
				break;	
				
				case far: 
				if (sCondB.getConditionName().equalsIgnoreCase("near"))
					isValid = false;
				else
					isValid = true;
				break;
				
				case much_stronger: case stronger: case even:
				case weaker: case much_weaker:				
				if (sCondB.getConditionName().equalsIgnoreCase("always")||
						sCondB.getConditionName().equalsIgnoreCase("far")||
						sCondB.getConditionName().equalsIgnoreCase("near")||
						sCondB.getConditionName().equalsIgnoreCase(sCondA.getConditionName()))
					isValid = true;
				break;
				
		        default: 
		        break;
			}
		}
		
		return isValid;
	}

	@Override
	public boolean checkSingleCondition(SingleCondition singleCondition) {
		boolean isValid = false;
		
		switch (ConditionType.valueOf(singleCondition.getConditionName()))
		{
			case always: 
			isValid = true;
			break;
			
			case near: 
			if (Math.abs(lPosition.x- rPosition.x) <=  near)
				isValid = true;
			break;
			
			case far: 
			if ((Math.abs(lPosition.x- rPosition.x) >  near) && (Math.abs(lPosition.x- rPosition.x) <=  far))
				isValid = true;
			break;
			
			case much_stronger: 
			if (HP >= ((int)healthValue*0.8) && HP <= healthValue)
				isValid = true;
			break;
			
			case stronger: 
			if (HP >= ((int)healthValue*0.6) && HP < ((int)healthValue*0.8))
				isValid = true;
			break;
			
			case even: 
			if (HP >= ((int)healthValue*0.4) && HP < ((int)healthValue*0.6))
				isValid = true;
			break;
			
			case weaker: 
			if (HP >= ((int)healthValue*0.2) && HP < ((int)healthValue*0.4))
				isValid = true;
			break;
			
			case much_weaker: 
			if (HP >= 0 && HP < ((int)healthValue*0.2))
				isValid = true;
			break;
			
	        default: 
	        break;
		}
		
		return isValid;
	}
}
