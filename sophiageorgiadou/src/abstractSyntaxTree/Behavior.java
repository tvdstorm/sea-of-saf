package abstractSyntaxTree;

import java.util.ArrayList;

public class Behavior {

	private ArrayList<BehaviorRule> behaviorRules;
	
	public Behavior(){
		behaviorRules=new ArrayList<BehaviorRule>();
	}
	
	public void addRule(BehaviorRule rule){
		this.behaviorRules.add(rule);
	}
	
	public String toString(){
		String temp="";
		for(int i=0; i<this.behaviorRules.size();i++){
			temp+=this.behaviorRules.get(i)+",";
		}
		return temp;
	}
	
}
