grammar SAF;

@header {
  package saf;
}

@lexer::header {
  package saf; 
}

bot 
	:	IDENT '{' 
			(characterstics | rules)*
	 	'}'
	;

characterstics
	:
		IDENT '=' INTEGER
	;		
	
rules
	:
	rule (operator rule)*
	;

rule
	:
	action
	|'(' rules* ')'
	;

action
	:
	IDENT 
	|function
	|choose
	;
			
operator
	:
	'and'	
	|'or'
	;

	
function
	:
	IDENT '[' parameters ']'
	;

choose
	:
	'choose(' IDENT IDENT ')'
	;
		
parameters
	:
	IDENT IDENT
	|choose IDENT
	|IDENT choose
	|choose choose
	;
	

INTEGER : '0'..'9'+;
IDENT : ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9'| '_')*;
WS : (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};