package saf.fight.validate;

import java.awt.Point;

import saf.ast.condition.AndCondition;
import saf.ast.condition.CombineCondition;
import saf.ast.condition.Condition;
import saf.ast.condition.OrCondition;
import saf.ast.condition.SingleCondition;
import saf.ast.enumType.ConditionType;

public class ValidateCondition implements IConditionVisitor{
	private int  HP;
	private Point lPosition, rPosition;
	
	private final int near = 150;
	private final int far = 300;
	private final int healthValue = 100;
	
	public ValidateCondition()
	{
		HP = -1;
		lPosition = new Point();
		rPosition = new Point();
	}
	
	public ValidateCondition(int hp, Point leftP, Point rightP)
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
	public boolean validateCondition(Condition condition) {
		return condition.accept(this);
	}

	@Override
	public boolean validateCondition(CombineCondition combineCondition) {
		return combineCondition.accept(this);
	}

	@Override
	public boolean validateCondition(OrCondition orCondition) {
		Condition[] cond = orCondition.getCombineConditions();
		return cond[0].accept(this)||cond[1].accept(this);
	}

	@Override
	public boolean validateCondition(AndCondition andCondition) {
		Condition[] cond = andCondition.getCombineConditions();
		return cond[0].accept(this)&&cond[1].accept(this);
	}
	
	@Override
	public boolean validateCondition(SingleCondition singleCondition) {
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
