package ast;


import java.util.ArrayList;
import java.util.List;

public class Behaviour {
	
	private List<BehaviourItem> a;
	
	public Behaviour(){
		this.a = new ArrayList<BehaviourItem>();		
	}
	
	/* Add behaviour item */
	public void addCondition(BehaviourItem condition){
		this.a.add(condition);
	}
	
	
	public List<BehaviourItem> getBehaviourItems(){
		return this.a;
	}
}
