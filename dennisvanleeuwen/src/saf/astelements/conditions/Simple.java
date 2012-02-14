package saf.astelements.conditions;

import saf.astelements.ICondition;
import saf.ISAFElementVisitor;

public class Simple implements ICondition{
	private String name;
	
	public Simple(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	@Override
	public Boolean isConditionNodeActive(ICondition con){
		return this.getNodeName().equals(con.getNodeName());
	}
	
	@Override
	public void accept(ISAFElementVisitor visitor){
		visitor.visit(this);
	}

	@Override
	public String getNodeName() {
		return this.getName();
	}
}