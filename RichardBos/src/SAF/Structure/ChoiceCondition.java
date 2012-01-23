package SAF.Structure;

public class ChoiceCondition extends Condition
{
	public ChoiceCondition(ConditionType Type, Condition SecondCondition)
	{
		type = Type;
		secondCondition = SecondCondition;
	}
	public ConditionType type;
	public Condition secondCondition;
	public enum ConditionType
	{
		OR,
		AND
	}
}