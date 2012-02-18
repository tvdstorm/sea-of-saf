package saf.evaluators;

public class BehaviourCondition {
	// BehaviourConditions: stronger, weaker, much_stronger, much_weaker, even, near, far, always.
	private BehaviourCondition left;
	private BehaviourCondition right;
	private String value;
	
	public BehaviourCondition() {}

	public BehaviourCondition(String value) {
		this.value = value;
	}

	public BehaviourCondition getLeft() {
		return left;
	}
	
	public BehaviourCondition getRight() {
		return right;
	}
	
	public String getValue() {
		return value;
	}
	/**
	 * When dealing with a leaf, only the value will have to be set
	 * @param value
	 */
	public void add(String value){
		this.value = value;
	}
	
	public void add(String left, BehaviourCondition right, String value) {
		this.left = new BehaviourCondition(left);
		this.right = right;
		this.value = value;
	}

	public void add(BehaviourCondition left, String right, String value) {
		this.left = left;
		this.right= new BehaviourCondition(right);
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "BehaviourCondition [left=" + left + ", right=" + right
				+ ", value=" + value + "]\n";
	}
	
	public Boolean isAlways(){
		return getValue() == "always";
	}
}