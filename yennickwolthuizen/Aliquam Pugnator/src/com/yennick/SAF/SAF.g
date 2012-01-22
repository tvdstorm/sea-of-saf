grammar SAF;

options {
  language = Java;
  output = AST;
}

tokens
{
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
	: DISTANCE '[' action attack ']'
	;
	
conditions
	: ('health'|distance)
	;

action
	:	ACTIONS|'stand'
	;
	
attack
	: ATTACK'_'DIRECTION
	; 
	
//move cases to lists for testability
ATTACK			: ('kick'|'punch'|'block');
DISTANCE		: ('far'|'near'|'always');
DIRECTION		: ('high'|'low');
ACTIONS			: ('run'|'crouch'|'walk'|'jump')('_'('towards'|'away'))?;	
SKILLS			: ATTACK('Reach'|'Power');


FIGHTERNAME	: ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'-')+;
INT					: '0'..'9' |'10';
WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+    { $channel = HIDDEN; } ;