grammar SAF;

options {
  language = Java;
  output = AST;
}

tokens
{
	CHOOSE  		= 'choose';
}

@header {
  package com.yennick.SAF;
}

@lexer::header {
  package com.yennick.SAF;
}

fighter 
	: IDENT '{'
			(personality|behaviour)*
		'}'
	;

behaviour
	:	IDENT '[' action action ']' 
	;
 
action
	:	CHOOSE '(' IDENT IDENT ')' | IDENT
	;
	
	
personality
	: IDENT '=' VALUE
	;
	

IDENT	: ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'_')*;
VALUE	: '0'..'9'+;

WHITESPACE : ( '\t' | ' ' | '\r' | '\n' )*   { $channel = HIDDEN; } ;