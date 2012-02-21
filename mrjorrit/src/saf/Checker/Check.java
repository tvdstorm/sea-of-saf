package saf.Checker;

import java.util.ArrayList;
import java.util.List;

public class Check {
	private List<String> errors = new ArrayList<String>();

	public List<String> getErrors() {
		return errors;
	}

	public void addError(String error) {
		errors.add(error);
	}

	public boolean hasErrors() {
		if (errors.size() == 0)
			return false;

		for (String error : errors) {
			System.out.println(error);
		}

		return true;
	}
}
