grammar SAF;

options {
  language = Java;
  output = AST;
}

tokens
{
	AND     = 'and';
	OR      = 'or';
	EQUALS  = '=';
	CURLYOPEN  = '{';
	CURLYCLOSE  = '}';
}

@header {
  package com.yennick.SAF;
}

@lexer::header {
  package com.yennick.SAF;
}

fighter
	: fightername CURLYOPEN
		(skills|conditions|profile)+
		CURLYCLOSE
	;
	
fightername
	: FIGHTERNAME
	;


skills
	:SKILLS EQUALS INT
	;

profile
	: ('weight'|'height'|'speed')
	;
	
distance
	: ('far'|'near'|'always') '[' action attack ']'
	;
	
conditions
	: ('health'|distance)
	;

action
	:	ACTIONS
	;
	
attack
	: ATTACK'_'DIRECTION
	;
ATTACK			: ('kick'|'punch');
DIRECTION		: ('high'|'low');
ACTIONS			: ('run'|'crouch')('_'('towards'|'away'))?;	
SKILLS			: ATTACK('Reach'|'Power');
FIGHTERNAME	: ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'-')+;
INT					: '0'..'9' |'10';

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+    { $channel = HIDDEN; } ;