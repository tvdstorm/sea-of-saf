grammar SAF;

options {
  language = Java;
  output = AST;
}


/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

fighter 
	: NAME '{' specs '}'
	;

specs
	: (assignment | tactic)+
	;

tactic
	: condition '[' move attack ']'
	;

assignment
	: strength ' = ' NUMBER
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
	: Digit+
	;

WHITESPACE
	: ('\t'|' '|'\r'|'\n'|'\u000C')+
	{ $channel = HIDDEN; }
	;
 
NAME
	: ('a'..'z'|'A'..'Z'|'_'|'-'|'0'..'9')+
	;

fragment Digit
	: '0'..'9'
	;

