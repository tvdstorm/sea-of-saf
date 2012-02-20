package ast;

import java.util.ArrayList;

public class Behaviour {
	
	public ArrayList<BehaviourItem> a;
	
	public Behaviour(){
		this.a = new ArrayList<BehaviourItem>();		
	}
	
	public void addCondition(BehaviourItem condition){
		this.a.add(condition);
	}
	
	public ArrayList<BehaviourItem> getBehaviourItems(){
		return this.a;
	}
}
