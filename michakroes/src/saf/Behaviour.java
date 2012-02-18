package saf;

import java.util.ArrayList;
import java.util.List;

import test.SafInterface;
import test.SafVisitor;

public class Behaviour implements SafInterface {
	
	private ArrayList<BehaviourRule> behaviourrules;
	
	public Behaviour(List<BehaviourRule> behaviourrules) {
		this.behaviourrules = (ArrayList<BehaviourRule>) behaviourrules;
	}
	
	@Override
	public void accept(SafVisitor visitor) {
		for(BehaviourRule br : behaviourrules) 
			br.accept(visitor);
		
		visitor.visit(this);
	}
}
