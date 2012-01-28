package saf.ast;

public class AndCondition extends Condition {
	private String andCondition;
	
	public void setCondition(String c){ super.setName(c); }
	public void setAndCondition(String c){ andCondition = c; }
	
	public String getAndCond(){ return andCondition; }
	public String getCondition(){
		return "\n\t\tCondition: " + super.getName() + "\n\t\t\tAnd: " + andCondition;
	}
}
