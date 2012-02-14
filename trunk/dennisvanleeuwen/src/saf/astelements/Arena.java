package saf.astelements;

import java.util.List;

import saf.ISAFElement;
import saf.ISAFElementVisitor;

public class Arena implements ISAFElement{
	private List<Fighter> fighters;

	public Arena(List<Fighter> fighters){
		this.fighters = fighters;
	}

	public List<Fighter> getFighters(){
		return this.fighters;
	}	
	
	@Override
	public void accept(ISAFElementVisitor visitor){
		visitor.visit(this);		
	}  
}