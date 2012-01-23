package saf.parser;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.RecognizerSharedState;

/**
 * Lexer for the SAF language. Throws a ParseException when an error is encountered.
 */
public class ErrorHandlingSAFLexer extends SAFLexer {

	public ErrorHandlingSAFLexer() {
		super();
	}

	public ErrorHandlingSAFLexer(CharStream input, RecognizerSharedState state) {
		super(input, state);
	}

	public ErrorHandlingSAFLexer(CharStream input) {
		super(input);
	}

	/**
	 * Throws ParseException with the error as message.
	 * @throws ParseException always
	 */
	@Override
	public void emitErrorMessage(String msg) {
		throw new ParseException("Error in Lexer:" + msg);
	}
}
