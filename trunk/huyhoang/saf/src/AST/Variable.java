package AST;

public class Variable {
	private String name;
	private Object variableValue;
	
	public Object getVariableValue() {
		return variableValue;
	}

	public void setVariableValue(Object variableValue) {
		this.variableValue = variableValue;
	}

	public Variable(String name, Object initializationValue)
	{
		this.name = name;
		this.variableValue = initializationValue;
	}
}