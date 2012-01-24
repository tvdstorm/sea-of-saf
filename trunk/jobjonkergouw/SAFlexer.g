lexer grammar SAFLexer;

// syntactical symbols
LEFT_BRACE		:	'{';	
RIGHT_BRACE		:	'}';		
LEFT_BRACKET	:	'[';
RIGHT_BRACKET	:	']';
LEFT_PAREN		:	'(';
RIGHT_PAREN		:	')';
ASSIGN			:	'=';

// keywords
STRENGTH_TYPE		:	'kickPower' | 'punchPower' | 'kickReach' | 'punchReach';
ATTACK_TYPE			:	'punch_low' | 'punch_high' | 'kick_low' | 'kick_high' | 'block_low' | 'block_high';
MOVE_TYPE			:	'jump' | 'crouch' | 'stand'	| 'run_towards'	| 'run_away' | 'walk_towards' | 'walk_away';
CONDITION_TYPE		:	'stronger' | 'weaker' | 'much_stronger' | 'much_weaker' | 'even' | 'near' | 'far' | 'always';
LOGICAL_OPERATOR	:	'or' | 'and';
CHOOSE				:	'choose';

// values
DIGIT			:	'1'..'9' | '10';
ID				:	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// disposable tokens
WHITESPACE 		:	(' ' | '\t') 	{ $channel = HIDDEN; };
NEWLINE			:	('\r'? '\n')+ 	{ $channel = HIDDEN; };
