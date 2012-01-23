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
		(skills|conditions|distance|profile)+
		CURLYCLOSE
	;
	
fightername
	: FIGHTERNAME
	;


skills
	:SKILLS EQUALS SKILLVALUE
	;

profile
	: ('weight'|'height'|'speed')
	;
	
distance
	: DISTANCE move
	;
	
conditions
	: (CONDITION | 'always') move
	;

move 
	:	'[' action+ ']'
	;
	
action
	:	 ('choose' '(')? (moveAction|fightAction)  (')')?
	;
	
moveAction
	:	  (MOVEACTION|'stand')
	;
	
fightAction
	: FIGHTACTION 
	; 

	
	
//move cases to lists for testability
ATTACK			: ('kick'|'punch'|'block');
DISTANCE		: ('far'|'near'|'always');
DIRECTION		: ('high'|'low');
FIGHTACTION	: ATTACK'_'DIRECTION;
CONDITION		: ('much''_')?('stronger'|'weaker');
MOVEACTION	: ('run'|'crouch'|'walk'|'jump')('_'('towards'|'away'))?;	
SKILLS			: ATTACK('Reach'|'Power');


FIGHTERNAME	: ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'-')+;
SKILLVALUE	: '0'..'9' |'10';

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+    { $channel = HIDDEN; } ;