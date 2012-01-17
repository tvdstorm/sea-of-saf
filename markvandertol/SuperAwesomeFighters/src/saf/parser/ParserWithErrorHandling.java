package saf.parser;

import org.antlr.runtime.TokenStream;

public class ParserWithErrorHandling extends SuperAwesomeFightersParser {

	public ParserWithErrorHandling(TokenStream input) {
		super(input);
	}
	
	@Override
	public void emitErrorMessage(String msg) {
		throw new ParseException(msg);
	}
	
	public class ParseException extends RuntimeException
	{
		private static final long serialVersionUID = 45636L;

		/**
		 * @param message
		 */
		public ParseException(String message) {
			super(message);
			// TODO Auto-generated constructor stub
		}
		
	}

}
