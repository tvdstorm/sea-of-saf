package saf.evaluators;

public class BehaviourCondition {
	
	private BehaviourCondition left;
	private BehaviourCondition right;
	private String value;
	
	public void add(String value){
		this.value = value;
	}
	
	public void add(String value, BehaviourCondition right) {
		this.value = value;
		this.right = right;
	}

	public void add(BehaviourCondition left, String value) {
		this.left = left;
		this.value = value;
	}

	@Override
	public String toString() {
		return "BehaviourCondition [left=" + left + ", right=" + right
				+ ", value=" + value + "]\n";
	}
	
}