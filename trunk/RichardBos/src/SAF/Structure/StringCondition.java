package SAF.Structure;

import SAF.Checker.SAFElement;
import SAF.Checker.SAFElementVisitor;
import SAF.Checker.SAFValidationException;

public class StringCondition extends Condition implements SAFElement 
{
	public StringCondition(String Value)
	{
		this.value = Value;
	}
	
    public void accept(SAFElementVisitor visitor) throws SAFValidationException {
        visitor.visit(this);
    }
	
	private String value;
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}