package saf.parser;

public class BotDefinitionMalformedException extends Exception {
	private static final long serialVersionUID = 4446495545424179062L;

	/**
	 * 
	 */
	public BotDefinitionMalformedException() {
		super();
	}

	/**
	 * @param msg
	 * @param cause
	 */
	public BotDefinitionMalformedException(String msg, Throwable cause) {
		super(msg, cause);
	}

	/**
	 * @param msg
	 */
	public BotDefinitionMalformedException(String msg) {
		super(msg);
	}

	/**
	 * @param cause
	 */
	public BotDefinitionMalformedException(Throwable cause) {
		super(cause);
	}

}
