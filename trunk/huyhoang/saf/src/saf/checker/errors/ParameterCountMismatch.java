package saf.checker.errors;

public class ParameterCountMismatch implements Error {
	private String functionName;
	
	public ParameterCountMismatch(String functionName) {
		this.functionName = functionName;
	}
	
	public String toString() {
		return String.format("%s accepts ", this.functionName);
	}
}
