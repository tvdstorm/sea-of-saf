package nl.uva.saf.fdl;

import java.util.ArrayList;

public class ValidationReport {
	private ArrayList<String> errors;
	private ArrayList<String> warnings;
	
	public ValidationReport() {
		errors = new ArrayList<String>();
		warnings = new ArrayList<String>();
	}
	
	public ArrayList<String> getErrors() {
		return errors;
	}	

	public ArrayList<String> getWarnings() {
		return warnings;
	}
	
	public void addError(String error) {
		if (errors != null) {
			errors.add(error);
		}
	}
	
	public void addWarning(String warning) {
		if (warnings != null) {
			warnings.add(warning);
		}
	}
	
	public boolean isValid() {
		return errors.size() == 0 ? true : false;
	}
}
