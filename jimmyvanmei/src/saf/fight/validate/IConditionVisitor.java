package saf.fight.validate;

import saf.ast.condition.AndCondition;
import saf.ast.condition.CombineCondition;
import saf.ast.condition.Condition;
import saf.ast.condition.OrCondition;
import saf.ast.condition.SingleCondition;

public interface IConditionVisitor {
	boolean validateCondition(Condition condition);
	boolean validateCondition(CombineCondition combineCondition);
	boolean validateCondition(OrCondition orCondition);
	boolean validateCondition(AndCondition andCondition);
	boolean validateCondition(SingleCondition singleCondition);
}
