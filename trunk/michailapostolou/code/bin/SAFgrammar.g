grammar SAFgrammar;

options {
  language = Java;
   output=AST;
   ASTLabelType = CommonTree;
}

tokens{
	BEHAVIOUR;
	CHARACTERISTIC;
	BETWEEN;
	PROGRAM;
}

@header {
  package com.mike.SAF;
}



@lexer::header {
  package com.mike.SAF;
}

program:
	pr -> ^(PROGRAM pr);

pr
	:
		bot bot* | bot EOF 
	;

bot
	:    NAME^ '{' (personality | behaviour)* '}'
	;


NAME:
	('A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9')*;
	
behaviour:
	action -> ^(BEHAVIOUR action); 
	
personality:
	character -> ^(CHARACTERISTIC character);
	
action:
	CONDITION '[' ( MOVE | movechoice | FIGHT |fightchoice )^ (FIGHT | fightchoice | MOVE | movechoice )^ ']'
	;
	
	
movechoice:
	'choose'^ '(' ( MOVE MOVE+) ')';
	
fightchoice:
	'choose'^ '(' FIGHT FIGHT+  ')';

	
MOVE:
	('walk_towards' | 'walk_away' | 'run_towards' | 'run_away' | 'jump' | 'crouch' | 'stand');
		
FIGHT:
	('block_low' | 'block_high' | 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high');
	
DIGIT	:
  '0'..'9';  
	
character:
	('punchReach' | 'punchPower' | 'kickReach' | 'kickPower') '=' DIGIT;
	
CONDITION:
	('always' | 'near' | 'far' | 'much_stronger' | 'stronger' | 'even' | 'weaker' | 'much_weaker');

//IDENT : ('a'..'z')*('A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9');

WS : (' ' | '\n' | '\t' | '\r') + {$channel = HIDDEN;};