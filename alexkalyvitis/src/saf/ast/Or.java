package saf.ast;

import java.util.List;

import saf.ast.base.BaseCondition;
import saf.ast.base.BinaryExpression;

public class Or extends BinaryExpression {
	public Or(){
		this("","");
	}
	public Or(String left, String right){
		this.setLeft(new Condition(left));
		this.setRight(new Condition(right));
	}
	public boolean eval(List<BaseCondition> conditions){
		return conditions.contains(this.getLeft()) || conditions.contains(this.getRight());
	}
	public boolean isValid(){
		return this.getLeft().isValid() || this.getRight().isValid();
	}
	public String toString(){
		return this.getLeft().toString() + " or " + getRight().toString();
	}
}
