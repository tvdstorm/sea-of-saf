grammar SAF;

options {
	output=AST;
}

tokens {
  FIGHTER;
  ASSIGNMENT;
  ACTION;
  CONDITION;
}

@header {
package saf.parser;
import java.util.List;
}

@lexer::header {
package saf.parser;
import java.util.List;
}

@members{
	private List<String> errorList;
	
	public void setErrorList(List<String> errorList) {
		this.errorList = errorList;
	}
	
	@Override
	public void emitErrorMessage(String msg) {
		errorList.add("Parser error: " + msg);
	}
}

@lexer::members{
	private List<String> errorList;
	
	public void setErrorList(List<String> errorList) {
		this.errorList = errorList;
	}
	
	@Override
	public void emitErrorMessage(String msg) {
		errorList.add("Lexer error: " + msg);
	}
}

fighter	:	ws? IDENTIFIER ws? '{' ws (assignment endline ws?)* (action endline ws?)*
		'}' ws? -> ^(FIGHTER IDENTIFIER assignment* action*);

assignment
	:	IDENTIFIER ws? '=' ws? DIGIT
	 	-> ^(ASSIGNMENT IDENTIFIER DIGIT);

action 	:	condition ws? '[' ws? move=IDENTIFIER ws attack=IDENTIFIER ws? ']'
		-> ^(ACTION condition $move $attack);

ws	:	(NEWLINE | WS)+;
endline :	WS* NEWLINE;

condition 
	:	'(' c=condition ')' -> ^(CONDITION $c)
	|	first=IDENTIFIER WS+ operator WS+ second=condition -> ^(CONDITION $first operator $second)
	|	p=IDENTIFIER -> ^(CONDITION $p);

operator 
	:	('and' | 'or');


/* Tokens: */

NEWLINE :	'\r'? '\n';
WS 	:	( ' ' | '\t')+;
IDENTIFIER	:	('a'..'z'|'A'..'Z'|'_')('a' .. 'z'| 'A'..'Z'| '0' .. '9' | '_' | '-')+;
DIGIT	:	('0' .. '9')+;

