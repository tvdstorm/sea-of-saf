package saf.parser;

import java.util.List;

/**
 * Thrown when the bot definition has an error.
 */
public class BotDefinitionMalformedException extends Exception {
	private static final long serialVersionUID = 4446495545424179062L;
	
	private List<String> errorList;


	public BotDefinitionMalformedException() {
	}

	public BotDefinitionMalformedException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public BotDefinitionMalformedException(String msg) {
		super(msg);
	}
	
	public BotDefinitionMalformedException(String msg, List<String> errorList) {
		super(msg);
		this.errorList = errorList;
	}

	public BotDefinitionMalformedException(Throwable cause) {
		super(cause);
	}

	public List<String> getErrorList() {
		return errorList;
	}
}
