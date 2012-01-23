package SAF.Structure;

public class ChoiceCondition extends Condition implements SAFElement
{
	public ChoiceCondition(ConditionType Type)
	{
		type = Type;
	}
	
    public void accept(SAFElementVisitor visitor) throws Exception {
        visitor.visit(this);
    }
	
	private ConditionType type;
	private Condition secondCondition;
	
	public ConditionType getType() {
		return type;
	}
	public void setType(ConditionType type) {
		this.type = type;
	}
	public Condition getSecondCondition() {
		return secondCondition;
	}
	public void setSecondCondition(Condition secondCondition) {
		this.secondCondition = secondCondition;
	}
	
	public enum ConditionType
	{
		OR,
		AND
	}
}