package saf.checker;

public class ConditionNameInvalid implements EvaluationError {
	private String conditionName;
	
	public ConditionNameInvalid(String conditionName) {
		this.conditionName = conditionName;
	}
	
	public String toString() {
		return String.format("Condition expected. '%s' is an invalid condition", this.conditionName);
	}
}
