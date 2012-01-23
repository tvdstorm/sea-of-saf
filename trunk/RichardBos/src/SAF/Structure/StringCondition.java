package SAF.Structure;

public class StringCondition extends Condition implements SAFElement 
{
	public StringCondition(String Value)
	{
		this.value = Value;
	}
	
    public void accept(SAFElementVisitor visitor) throws Exception {
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