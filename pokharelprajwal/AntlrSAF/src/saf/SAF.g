grammar SAF;

@header {
  package saf;
}

@lexer::header {
  package saf; 
}

bot 
	:	IDENT '{' 
			(characterstics | rule)*
	 	'}'
	;

characterstics
	:
		IDENT '=' INTEGER
	;		
	
rule
	:
	function (operator function)* (ruleExpression)* 
	;
	
ruleExpression:
	operator '(' rule ')'
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
	
parameters
	:
	IDENT IDENT
	|choose IDENT
	|IDENT choose
	;
	
choose
	:
	'choose(' IDENT IDENT ')'
	;
	
INTEGER : '0'..'9'+;
IDENT : ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9'| '_')*;
WS : (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};