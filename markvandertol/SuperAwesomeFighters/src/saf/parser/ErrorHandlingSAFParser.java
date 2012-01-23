package saf.parser;

import org.antlr.runtime.TokenStream;

/**
 * Parser for the SAF language. Throws a ParseException when an error is encountered.
 */
class ErrorHandlingSAFParser extends SAFParser {

	public ErrorHandlingSAFParser(TokenStream input) {
		super(input);
	}

	/**
	 * Throws ParseException with the error as message.
	 * @throws ParseException always
	 */
	@Override
	public void emitErrorMessage(String msg) {
		throw new ParseException("Error in Parser:" +msg);
	}

}
