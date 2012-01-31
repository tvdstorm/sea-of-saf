grammar SAF;

options {
  language = Java;
}

@header {
  package saf;
}

@lexer::header {
  package saf;
}

program
	:	IDENT LEFT_CURLY
			personality
			behaviour
		RIGHT_CURLY
	;

personality
	:	characteristic*
	;
	
characteristic
	:	IDENT '=' DIGIT
	;

behaviour
	:	rule+
	;
	
rule
	:	IDENT LEFT_BRACK action action RIGHT_BRACK
	;
	
action
	:	'choose' LEFT_PAREN IDENT IDENT+ RIGHT_PAREN
	|	IDENT
	;
	
LEFT_CURLY : '{';
RIGHT_CURLY : '}';
LEFT_BRACK : '[';
RIGHT_BRACK : ']';
LEFT_PAREN : '(';
RIGHT_PAREN : ')';

LETTER : ('a'..'z' | 'A'..'Z');
DIGIT : '0'..'9';

IDENT : LETTER (LETTER | DIGIT | '_')*;
WS : (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};
