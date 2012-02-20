package saf.ast;

public class OrCondition extends Condition {
	private String orCondition;
	
	public void setCondition(String c){ super.setName(c); }
	public void setOrCondition(String c){ orCondition = c; }
	
	public String getOrCondition(){ return orCondition; }
	public String getCondition(){ return super.getName(); }
	public String toString(){
		return "\n\t\tCondition: " + super.getName() + "\n\t\t\tOr: " + orCondition;
	}
}
