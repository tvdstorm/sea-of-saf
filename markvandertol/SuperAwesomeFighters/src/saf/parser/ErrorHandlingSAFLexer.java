package saf.parser;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.RecognizerSharedState;

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

	@Override
	public void emitErrorMessage(String msg) {
		throw new ParseException("Error in Lexer:" + msg);
	}
}
