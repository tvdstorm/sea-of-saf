package saf.parser;

import org.antlr.runtime.TokenStream;

class ErrorHandlingSAFParser extends SAFParser {

	public ErrorHandlingSAFParser(TokenStream input) {
		super(input);
	}

	/**
	 * @throws ParseException always
	 */
	@Override
	public void emitErrorMessage(String msg) {
		throw new ParseException("Error in Parser:" +msg);
	}

}
