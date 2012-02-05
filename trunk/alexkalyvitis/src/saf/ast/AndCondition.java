package saf.ast;

public class AndCondition extends Condition {
	private String andCondition;
	
	public void setCondition(String c){ super.setName(c); }
	public void setAndCondition(String c){ andCondition = c; }
	
	public String getAndCondition(){ return andCondition; }
	public String getCondition(){ return super.getName(); }
	public String toString(){
		return "\n\t\tCondition: " + super.getName() + "\n\t\t\tAnd: " + andCondition;
	}
}
