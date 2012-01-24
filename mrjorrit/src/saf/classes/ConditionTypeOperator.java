package saf.classes;

public class ConditionTypeOperator implements Strict {

	
	public ConditionTypeOperator(ConditionType conditionType)
	{
		this.conditionType = conditionType;
	};
	

	public ConditionTypeOperator(ConditionType conditionType, LogicalOperators logicalOperator, ConditionTypeOperator conditionTypeOperator)
	{
		this.conditionType = conditionType;
		this.logicalOperator = logicalOperator;
		this.conditionTypeOperator = conditionTypeOperator;
	}
	
	
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


	private ConditionTypeOperator conditionTypeOperator;
	
	public ConditionTypeOperator getConditionTypeOperator() {
		return conditionTypeOperator;
	}


	@Override
	public void check() {
		// TODO Auto-generated method stub
		
	}


	
	
}
