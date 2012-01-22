lexer grammar SAFlexer;

LEFT_BRACE		:	'{'				{ $channel = HIDDEN; };
RIGHT_BRACE		:	'}'				{ $channel = HIDDEN; };
LEFT_BRACKET	:	'[';
RIGHT_BRACKET	:	']';
ASSIGN			:	'=';

PERSONALITY_TYPE	:	'kickPower' | 'punchPower' | 'kickReach' | 'punchReach';


NUMBER			:	'0'..'9';
ID				:	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

WHITESPACE 		:	(' ' | '\t') 	{ $channel = HIDDEN; };
NEWLINE			:	'\r'? '\n' 		{ $channel = HIDDEN; };
