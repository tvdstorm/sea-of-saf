grammar SAF;

options {
	output=AST;
}

tokens {
  FIGHTER;
  ASSIGNMENT;
  RULE;
  MOVES;
  ATTACKS;
  CONDITION;
  ANDCONDITION;
  ORCONDITION;
  RCONDITION;
}

@header {
package saf.parser;
}

@lexer::header {
package saf.parser;
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

fighter
		: IDENTIFIER '{'  assignment*  rule* '}' -> ^(FIGHTER IDENTIFIER assignment* rule*);

assignment
		:	IDENTIFIER '=' DIGIT -> ^(ASSIGNMENT IDENTIFIER DIGIT);

rule
	 	:	condition '[' moves attacks ']' -> ^(RULE condition moves attacks);
		
moves
	 	:	move=IDENTIFIER -> ^(MOVES $move)
		|	'(' (move=IDENTIFIER)+ ')' -> ^(MOVES $move+);
		
attacks
		:	attack=IDENTIFIER -> ^(ATTACKS $attack)
		|	'(' (attack=IDENTIFIER)+ ')' -> ^(ATTACKS $attack+);

condition 
		:	first=andcondition ( 'or' second=condition -> ^(ORCONDITION $first $second) | -> ^(RCONDITION $first));
	
andcondition
		:	first=pcondition ( 'and' second=andcondition -> ^(ANDCONDITION $first $second) | -> ^(RCONDITION $first));
	

pcondition 
		:	'(' c=condition ')' -> ^(RCONDITION $c)
		|	p=IDENTIFIER -> ^(CONDITION $p);


/* Tokens: */

WS
		:	( ' ' | '\t' | '\r' | '\n')+ {$channel=HIDDEN;};
IDENTIFIER
		:	('a'..'z'|'A'..'Z'|'_')('a' .. 'z'| 'A'..'Z'| '0' .. '9' | '_' | '-')+;
DIGIT
		:	('0' .. '9')+;

