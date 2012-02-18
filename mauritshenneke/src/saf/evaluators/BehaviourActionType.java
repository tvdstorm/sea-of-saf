package saf.evaluators;

public class BehaviourActionType {
	private String name;

	public BehaviourActionType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Boolean nameEquals(String nameValue) {
		return name.equals(nameValue);
	}

}