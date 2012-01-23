package SAF.Structure;

public class Condition implements SAFElement {
	public Condition(){}
	public Condition(Condition condition)
	{
		this.condition = condition;
	}
	
    public void accept(SAFElementVisitor visitor) throws Exception {
        visitor.visit(this);
    }
	
	private Condition condition;

	public Condition getCondition() {
		return condition;
	}
	public void setCondition(Condition condition) {
		this.condition = condition;
	}
}