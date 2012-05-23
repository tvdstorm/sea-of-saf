package ast;

import constants.CorrectValues;

public class BehaviourItem {
	
	private Condition condition;
	
	//We don't know where is situated the move and where is situated the attack
	//Therefore, we will test further what type of Action we have 
	public Action left;
	public Action right;		
	
	public Action getLeft() {
		return left;
	}

	public void setLeft(Action left) {
		this.left = left;
	}

	public Action getRight() {
		return right;
	}

	public void setRight(Action right) {
		this.right = right;
	}

	public BehaviourItem(Condition condition, Action move, Action attack){
		this.condition = condition;
		this.left = move;
		this.right = attack;				
	}
	
	public Condition getCondition() {
		return condition;
	}

	public void setCondition(Condition condition) 	{ 
		this.condition = condition;
	}
	
	public void setActions(Action left, Action right) {
		this.left = left;
		this.right = right;
	}
	

}
