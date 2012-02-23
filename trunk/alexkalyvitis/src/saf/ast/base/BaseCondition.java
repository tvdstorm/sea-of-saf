package saf.ast.base;

import java.util.List;

public abstract class BaseCondition extends Identifier{
	public boolean eval(List<BaseCondition> conditions){
		return false;
	}
	public String toString(){
		return "";
	}
}
