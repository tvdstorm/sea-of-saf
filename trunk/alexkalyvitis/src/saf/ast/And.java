package saf.ast;

import java.util.List;

import saf.ast.base.BaseCondition;
import saf.ast.base.BinaryExpression;

public class And extends BinaryExpression {
	public And(){
		this("","");
	}
	public And(String left, String right){
		this.setLeft(new Condition(left));
		this.setRight(new Condition(right));
	}
	public And(BaseCondition left, BaseCondition right){
		this.setLeft(left);
		this.setRight(right);
	}
	public boolean eval(List<BaseCondition> conditions){
		return conditions.contains(this.getLeft()) && conditions.contains(this.getRight());
	}
	public boolean isValid(){
		return this.getLeft().isValid() && this.getRight().isValid();
	}
	public String toString(){
		return this.getLeft().toString() + " and " + getRight().toString();
	}
}
