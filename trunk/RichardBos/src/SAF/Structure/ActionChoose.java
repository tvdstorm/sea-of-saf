package SAF.Structure;

public class ActionChoose extends Action implements SAFElement {
	public ActionChoose(){}
	
    public void accept(SAFElementVisitor visitor) throws Exception {
        visitor.visit(this);
    }
	
	private String secondValue;
	public String getSecondValue() {
		return secondValue;
	}
	public void setSecondValue(String secondValue) {
		this.secondValue = secondValue;
	}
}
