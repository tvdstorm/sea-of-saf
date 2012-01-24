package ast.conditions;
import ast.IConditionElement;
import saf.ISAFElementVisitor;

public class ANDConditionElement implements IConditionElement{

	private IConditionElement condition1;
	private IConditionElement condition2;
	
	public ANDConditionElement(IConditionElement con1, IConditionElement con2){
		this.condition1 = con1;
		this.condition2 = con2;
	}
	
//	@Override
//	public Boolean isConditionValid() {
//		return this.condition1.isConditionValid() && this.condition2.isConditionValid();
//	}
	
	public IConditionElement getFirstCondition() {
		return this.condition1;
	}

	public void setFirstCondition(IConditionElement condition) {
		this.condition1 = condition;
	}

	public IConditionElement getSecondCondition() {
		return this.condition2;
	}

	public void setSecondCondition(IConditionElement condition) {
		this.condition2 = condition;
	}

	@Override
	public void accept(ISAFElementVisitor visitor){
		visitor.visit(this);		
		condition1.accept(visitor);
		condition2.accept(visitor);		
	}
}

