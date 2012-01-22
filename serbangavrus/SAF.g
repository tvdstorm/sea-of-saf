grammar SAF;

options {
	language = Java;
	output = AST;
	ASTLabelType = CommonTree;
}

tokens {
	CURLY_START = '{';
	CURLY_END = '}';
	
	PERSONALITY;
	BEHAVIOUR;
}

@header {
	package antlrgenerated;
}

@lexer::header {
	package antlrgenerated;
}

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

curly_start
	: '{' ->
	;

curly_end
	: '}' ->
	;

fighter 
	: NAME^ curly_start spec+ curly_end
	;

spec
	: (parsonality | behaviour)
	;

parsonality
	: assignment -> ^(PERSONALITY assignment)
	;
	
behaviour
	: tactic -> ^(BEHAVIOUR tactic)
	;

tactic
	: condition '[' move attack ']'
	;
	
assignment
	: strength '=' NUMBER
	;


strength
	: 'punchReach'
	| 'kickReach'
	| 'kickPower'
	| 'punchPower'
	;
	
condition
	: 'stronger'
	| 'weaker'
	| 'much_stronger' 
	| 'much_weaker' 
	| 'even' 
	| 'near' 
	| 'far' 
	| 'always'
	;

move
	: 'jump'
	| 'crouch'
	| 'stand'
	| 'run_towards'
	| 'run_away'
	| 'walk_towards'
	| 'walk_away'
	;

attack
	: 'punch_low'
	| 'punch_high'
	| 'kick_low'
	| 'kick_high'
	| 'block_low'
	| 'block_high'
	;


/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

NUMBER
	: '0'..'9'
	| '10'
	;

WHITESPACE
	: ('\t'|' '|'\r'|'\n'|'\u000C')+
	{ $channel = HIDDEN; }
	;
 
NAME
	: ('a'..'z'|'A'..'Z'|'_'|'-'|'0'..'9')+
	;
