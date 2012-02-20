package foo;

import java.util.ArrayList;

public class Behaviour {
	
	ArrayList<BehaviourItem> a;
	
	public Behaviour(){
		this.a = new ArrayList<BehaviourItem>();		
	}
	
	void addCondition(BehaviourItem condition){
		this.a.add(condition);
	}
}
