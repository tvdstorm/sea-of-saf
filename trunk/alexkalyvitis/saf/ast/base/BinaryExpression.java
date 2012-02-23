package saf.ast.base;

import java.util.List;

public abstract class BinaryExpression extends BaseCondition {
	private BaseCondition left;
	private BaseCondition right;
	
	public BaseCondition getLeft() {
		return left;
	}
	public void setLeft(BaseCondition left) {
		this.left = left;
	}
	public BaseCondition getRight() {
		return right;
	}
	public void setRight(BaseCondition right) {
		this.right = right;
	}
	public boolean eval(List<BaseCondition> conditions){
		assert false : "Should not perform eval() in this class but rather in the child classes.";
		return false;
	}
	public String toString(){
		return this.getLeft().toString() + " binary " + getRight().toString();
	}
}
