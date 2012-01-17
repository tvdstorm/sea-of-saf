package AST.Conditions;
import AST.ICondition;

public class ANDCondition implements ICondition{

	private ICondition condition1;
	private ICondition condition2;
	
	public ANDCondition(ICondition con1, ICondition con2){
		this.condition1 = con1;
		this.condition2 = con2;
	}
	
	@Override
	public Boolean isConditionValid() {
		return this.condition1.isConditionValid() && this.condition2.isConditionValid();
	}
	
	@Override
	public String toString(){
		return this.condition1 + " && " + this.condition2 + "\n";
	}
}