package saf.classes;

public class ConditionTypeOperator {

	
	public ConditionTypeOperator(){};
	
	
	private ConditionType conditionType;

	public ConditionType getConditionType() {
		return conditionType;
	}

	public void setConditionType(ConditionType conditionType) {
		this.conditionType = conditionType;
	}

	
	private LogicalOperators logicalOperator;
	
	public LogicalOperators getLogicalOperator() {
		return logicalOperator;
	}

	public void setLogicalOperator(LogicalOperators logicalOperator) {
		this.logicalOperator = logicalOperator;
	}


	private ConditionTypeOperator conditionTypeOperator;
	
	public ConditionTypeOperator getConditionTypeOperator() {
		return conditionTypeOperator;
	}

	public void setConditionTypeOperator(ConditionTypeOperator conditionTypeOperator) {
		this.conditionTypeOperator = conditionTypeOperator;
	}


	
	
}
