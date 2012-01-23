grammar SAF;

@header {
  package grammar;
}

@lexer::header {
  package grammar; 
}

bot 
	:	IDENT '{' personality behaviour '}'
	;

personality
	: 
	characterstics*
	;

characterstics
	:
		IDENT '=' INTEGER
	;
		
behaviour
	:
	rule*
	;

rule
	:	condition '[' action+ ']'
	;

condition
	:	IDENT+
	;
	
action
	:	IDENT '(' IDENT+ ')'
	| IDENT
	;

fragment DIGIT
	:	'0'..'9'
	;
	
INTEGER : DIGIT+;

fragment LETTER
	: 'a'..'z'|'A'..'Z'
	;
	
IDENT 
	:	(LETTER | '_')+;

// Strip whitespaces from input.
WS : (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};