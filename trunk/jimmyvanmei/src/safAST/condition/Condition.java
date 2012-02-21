package safAST.condition;

import safFightAnimation.conditionCheck.ISAFAnimationConditionCheckVisitable;
import safFightAnimation.conditionCheck.ISAFAnimationConditionCheckVisitor;
import safVisitor.*;

public abstract class Condition implements ISAFVisitable, ISAFAnimationConditionCheckVisitable{

	@Override
	public void accept(ISAFVisitor visitor) {
		visitor.visit(this);		
	}

	@Override
	public boolean accept(ISAFAnimationConditionCheckVisitor visitor) {
		return visitor.checkCondition(this);
	}

}
