lexer grammar SAFlexer;

LEFT_BRACE		:	'{';	
RIGHT_BRACE		:	'}';		
LEFT_BRACKET	:	'[';
RIGHT_BRACKET	:	']';
ASSIGN			:	'=';

STRENGTH			:	'kickPower' | 'punchPower' | 'kickReach' | 'punchReach';
ATTACK				:	'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' | 'block_low' | 'block_high';
MOVE				:	'jump' | 'crouch' | 'stand'	| 'run_towards'	| 'run_away' | 'walk_towards' | 'walk_away';
CONDITION			:	'stronger' | 'weaker' | 'much_stronger' | 'much_weaker' | 'even' | 'near' | 'far' | 'always';

NUMBER			:	('1') => '1' | '2'..'9' | '10';
ID				:	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

WHITESPACE 		:	(' ' | '\t') 	{ $channel = HIDDEN; };
NEWLINE			:	'\r'? '\n' 		{ $channel = HIDDEN; };
