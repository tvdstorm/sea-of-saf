grammar SAF;

options {
	output = AST;
}

tokens {
	PERSONALITY;
	BEHAVIOUR;
	FIGHTER;
	CHOOSE = 'choose';
	OR = 'or';
	AND = 'and';
	CONDITION = 'CONDITION';
}

@header {
	package antlrgenerated;
	import nodes.*;
}

@lexer::header {
	package antlrgenerated;
	import nodes.*;
}

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

fighter returns [Fighter f]
	: STRING '{' spec+ '}' { $f = new Fighter($STRING.text); }
		-> ^(STRING spec+)
	;

spec
	: (personality | behaviour)
	;

personality
	: assignment -> ^(PERSONALITY assignment)
	;
	
behaviour
	: tactic -> ^(BEHAVIOUR tactic)
	;

tactic
	: condition '[' move attack ']' -> condition move attack
	;
	
assignment
	: strength '=' NUMBER -> strength NUMBER
	;

strength
	: STRING
	;
	
condition
	: (condition_or | condition_and | STRING)
	;

condition_or
	: STRING (OR STRING)+ -> ^(OR STRING+)
	;
	
condition_and
	: STRING (AND STRING)+ -> ^(AND STRING+)
	;

move
	: (choose_move | STRING)
	;

choose_move
	: CHOOSE '(' STRING+ ')' -> ^(CHOOSE STRING+)
	;

attack
	: ( attack_move | STRING )
	;

attack_move
	: CHOOSE '(' STRING+ ')' -> ^(CHOOSE STRING+)
	;

/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

NUMBER
	: '0'..'9'
	| '10'
	;

WHITESPACE
	: ('\t'|' '|'\r'|'\n'|'\u000C')+ { $channel = HIDDEN; }
	;
 
STRING
	: ('a'..'z'|'A'..'Z'|'_'|'-'|'0'..'9')+
	;