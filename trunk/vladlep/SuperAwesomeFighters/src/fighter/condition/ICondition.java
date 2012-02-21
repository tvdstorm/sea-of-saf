package fighter.condition;

import java.util.List;

import fighter.ASTNode;

public interface ICondition extends ASTNode {

	
	public boolean testCondition(List<ConditionType> acceptedConditions);

	@Override
	public String toString();
}
