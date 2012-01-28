package saf.ast;

public class OrCondition extends Condition {
	private String orCondition;
	
	public void setCondition(String c){ super.setName(c); }
	public void setOrCondition(String c){ orCondition = c; }
	
	public String getAndCond(){ return orCondition; }
	public String getCondition(){
		return "\n\t\tCondition: " + super.getName() + "\n\t\t\tOr: " + orCondition;
	}
}
