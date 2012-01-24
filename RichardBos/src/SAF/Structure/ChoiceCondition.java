package SAF.Structure;

import SAF.Checker.SAFElement;
import SAF.Checker.SAFElementVisitor;
import SAF.Checker.SAFValidationException;

public class ChoiceCondition extends Condition implements SAFElement
{
	public ChoiceCondition(ChoiceType Type)
	{
		type = Type;
	}
	
    public void accept(SAFElementVisitor visitor) throws SAFValidationException {
        visitor.visit(this);
    }
	
	private ChoiceType type;
	private Condition secondCondition;
	
	public ChoiceType getType() {
		return type;
	}
	public void setType(ChoiceType type) {
		this.type = type;
	}
	public Condition getSecondCondition() {
		return secondCondition;
	}
	public void setSecondCondition(Condition secondCondition) {
		this.secondCondition = secondCondition;
	}
	
	public enum ChoiceType
	{
		OR,
		AND
	}
}