package saf.parser;

public class ParseException extends RuntimeException
{
	private static final long serialVersionUID = 45636L;

	/**
	 * @param message
	 */
	public ParseException(String message) {
		super(message);
	}
	
	public ParseException(String message, Throwable cause) {
		super(message, cause);
	}
}