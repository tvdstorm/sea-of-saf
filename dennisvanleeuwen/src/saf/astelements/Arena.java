package saf.astelements;

import java.util.List;

import saf.ISAFNode;
import saf.ISAFNodeVisitor;

public class Arena implements ISAFNode{
	private List<Fighter> fighters;

	public Arena(List<Fighter> fighters){
		this.fighters = fighters;
	}

	public List<Fighter> getFighters(){
		return this.fighters;
	}	
	
	@Override
	public void accept(ISAFNodeVisitor visitor){
		visitor.visit(this);		
	}  
}