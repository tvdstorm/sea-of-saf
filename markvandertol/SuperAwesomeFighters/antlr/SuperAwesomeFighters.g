grammar SuperAwesomeFighters;

options {
output=AST;
}

tokens {
  PROGRAM;
  ASSIGNMENT;
  ACTION;
  CONDITION;
}

prog	:	ws? NAME ws? '{' ws (assignment endline ws?)* (action endline ws?)*
		'}' ws? -> ^(PROGRAM NAME assignment* action*);

assignment
	:	strengths ws? '=' ws? DIGIT+
	 	-> ^(ASSIGNMENT strengths DIGIT+);

action 	:	condition ws? '[' move ws attack ws? ']'
		-> ^(ACTION condition move attack);

ws	:	(NEWLINE | WS)+;
endline :	WS* NEWLINE;

strengths 
	:	('punchReach' | 'kickReach' | 'kickPower' | 'punchPower');
	
move	:	('jump' | 'crouch' | 'stand' | 'run_towards' | 'run_away' | 'walk_towards' | 'walk_away');

attack 	:	('punch_low' | 'punch_high' | 'kick_low' | 'kick_high' | 'block_low' | 'block_high');

condition 
	:	'(' c=condition ')' -> ^(CONDITION $c)
	|	first=conditioni WS+ operator WS+ second=condition -> ^(CONDITION $first operator $second)
	|	p=conditioni -> ^(CONDITION $p);

operator 
	:	('and' | 'or');

conditioni
	:	('stronger'| 'weaker'|'much_stronger'| 'much_weaker'|
		'even' | 'near'| 'far' | 'always');
		

/* Tokens: */

NEWLINE : '\r'? '\n';
WS 	: ( ' ' | '\t')+;
NAME	: ('a'..'z'|'A'..'Z')('a' .. 'z'| 'A'..'Z'| '0' .. '9')+;
DIGIT	:	('0' .. '9');

