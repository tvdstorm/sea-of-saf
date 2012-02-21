package safFightAnimation.conditionCheck;

import safAST.condition.AndCombineCondition;
import safAST.condition.CombineCondition;
import safAST.condition.Condition;
import safAST.condition.OrCombineCondition;
import safAST.condition.SingleCondition;

public interface ISAFAnimationConditionCheckVisitor {
	boolean checkCondition(Condition condition);
	boolean checkCombineCondition(CombineCondition combineCondition);
	boolean checkOrCombineCondition(OrCombineCondition orCombineCondition);
	boolean checkAndCombineCondition(AndCombineCondition andCombineCondition);
	boolean checkSingleCondition(SingleCondition singleCondition);
}
