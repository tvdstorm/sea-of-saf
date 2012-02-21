package saf.ast;

import java.util.List;

import saf.ast.identifiers.Conditions;

import saf.ast.base.BaseCondition;

public class Condition extends BaseCondition{
	private String name;

	public Condition(){
		this("");
	}
	public Condition(String name){
		this.name = name;
	}
	public Conditions getCondition(){
		return Conditions.valueOf(this.name.toUpperCase());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean eval(List<BaseCondition> conditions){
		return conditions.contains(this);
	}
	public String toString(){
		return this.name;
	}
	public boolean isValid() {
		try {
			Conditions.valueOf(name.toUpperCase());
		} catch(IllegalArgumentException e) {
			return false;
		} catch(NullPointerException e){
			return false;
		}
		return true;
	}
}
