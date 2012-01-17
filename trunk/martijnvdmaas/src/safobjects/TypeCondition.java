package safobjects;

public class TypeCondition extends ConditionGroup {
	public enum Operator {AND, OR};
	
	public Operator conditionType;
	public ConditionGroup firstCondition;
	public ConditionGroup secondCondition;
}
