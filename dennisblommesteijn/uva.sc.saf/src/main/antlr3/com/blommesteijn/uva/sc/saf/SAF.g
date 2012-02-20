grammar SAF;


options 
{
	language = Java;
	output = AST;
	ASTLabelType = CommonTree;
}

@header 
{
	package com.blommesteijn.uva.sc.saf;
	import com.blommesteijn.uva.sc.saf.checkers.ParserCheckerIssue;
	import com.blommesteijn.uva.sc.saf.checkers.ParserChecker;
}

@members 
{
	//checker placeholder
	private ParserChecker _parserChecker = new ParserChecker();

	/**
	 * Display grammar parse error
	 * @param tokenNames list of tokens
	 * @param e exception
	 */
	@Override
	public void displayRecognitionError(String[] tokenNames,
										RecognitionException e)
	{
		int lpos = e.line;
		int cpos = e.charPositionInLine;
		String msg = getErrorMessage(e, tokenNames);
		//append a list of issues
		_parserChecker.append(new ParserCheckerIssue(lpos, cpos, msg));
	}
	
	/**
	 * Get parser checker
	 * @return parser checker
	 */
	public ParserChecker getParserChecker()
	{
		return _parserChecker;
	}
}

@lexer::header 
{
	package com.blommesteijn.uva.sc.saf;
}

// ========================================================
// Parser
// ========================================================


astNode
	:	fighter+
		EOF!
	;


fighter
	:	IDENT^
		CURLY_LEFT!
			(property | behaviour)* 
//			(property)* 
		CURLY_RIGHT!
	;

property
	:	IDENT BECOMES^ INTEGER
	;
		
behaviour
	:	location^ (operator)*
		SQUARE_LEFT! 
 			(action) (action)*
		SQUARE_RIGHT!
	;

operator
	:	IDENT^ IDENT
	;
	
location
	:	IDENT^
	;

action
	:	IDENT^
	;



	
// ========================================================
// Lexer
// ========================================================

BECOMES : '=';
CURLY_LEFT : '{';
CURLY_RIGHT : '}';
SQUARE_LEFT : '[';
SQUARE_RIGHT : ']';
PARENT_LEFT : '(';
PARENT_RIGHT : ')';

fragment LETTER : ('a'..'z' | 'A'..'Z');
fragment LETTER_SPECIAL : ('_' | '-');
fragment DIGIT : '0'..'9';

INTEGER : DIGIT+;
IDENT : (LETTER | LETTER_SPECIAL) (LETTER | LETTER_SPECIAL | DIGIT)*;

// ignore characters
WS : (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};
COMMENT_SINGLE : '//' .* ('\n' | '\r') {$channel = HIDDEN;};
COMMENT_MULTI : '/*' .* '*/' {$channel = HIDDEN;};
