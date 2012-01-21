grammar SAF;

options {
  language = Java;
  output = AST;
}

fighter 
	: NAME '{' specs '}'
	;

specs
	: (assignment | tactic)+
	;

fragment tactic
	: CONDITION '[' MOVE ATTACK  ']'
	;

fragment assignment
	: STRENGTH ' = ' NUMBER
	;


STRENGTH
	: 'punchReach'
	| 'kickReach'
	| 'kickPower'
	| 'punchPower'
	;
	
CONDITION
	: 'stronger'
	| 'weaker'
	| 'much_stronger' 
	| 'much_weaker' 
	| 'even' 
	| 'near' 
	| 'far' 
	| 'always'
	;

MOVE
	: 'jump'
	| 'crouch'
	| 'stand'
	| 'run_away'
	| 'walk_towards'
	| 'walk_away'
	;

ATTACK
	: 'punch_low'
	| 'punch_high'
	| 'kick_low'
	| 'kick_high'
	| 'block_low'
	| 'block_high'
	;

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