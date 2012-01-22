// Copyright © Pim Huisman 2012.
grammar SAF;

options {
	language = Java;
	output = AST;
	ASTLabelType = CommonTree;
}

tokens {
	FIGHTER;
	NAME;
	PERSONALITY;
	BEHAVIOUR;
	CHARACTERISTIC;
	VALUE;
	CONDITION;
	CHOOSE;
	MOVE_ACTION;
	ATTACK_ACTION;
}

@header {
  package Antlr;
}

@lexer::header {
	package Antlr;
}

fighter				:	IDENTIFIER '{'
							personality
							behaviour
						'}' 
						->	^(FIGHTER
								^(NAME IDENTIFIER)
								^(PERSONALITY personality)
								^(BEHAVIOUR behaviour)
							)
					;

personality			:	characteristic+;
characteristic		:	CHARACTERISTIC_TYPE '=' NUMBER
						->	^(CHARACTERISTIC
								^(NAME CHARACTERISTIC_TYPE)
								^(VALUE NUMBER)
							)
					;

behaviour			:	rule+;
rule				:	CONDITION_TYPE '[' actions ']'
						->	^(CONDITION ^(NAME CONDITION_TYPE) actions)
					;

actions				:	(moveAction attackAction)
					| 'choose' '(' actions+ ')' -> ^(CHOOSE actions+)
					;
					
moveAction			:	MOVEACTION_TYPE -> ^(MOVE_ACTION ^(NAME MOVEACTION_TYPE))
					| 'choose' '(' MOVEACTION_TYPE+ ')' -> ^(CHOOSE MOVEACTION_TYPE+)
					;
					
attackAction		:	ATTACKACTION_TYPE -> ^(ATTACK_ACTION ^(NAME ATTACKACTION_TYPE))
					| 'choose' '(' ATTACKACTION_TYPE+ ')' -> ^(CHOOSE ATTACKACTION_TYPE+)
					;

CHARACTERISTIC_TYPE	:	('punchReach'|'punchPower'|'kickReach'|'kickPower');
CONDITION_TYPE		:	('stronger'|'weaker'|'much_stronger'|'much_weaker'|'even'|'near'|'far'|'always');
MOVEACTION_TYPE		:	('jump'|'crouch'|'stand'|'run_towards'|'run_away'|'walk_towards'|'walk_away');
ATTACKACTION_TYPE	:	('punch_low'|'punch_high'|'kick_low'|'kick_high'|'block_low'|'block_high');

IDENTIFIER			:	( 'a'..'z' | 'A'..'Z' )+;
NUMBER				:	'0'..'9'+;
WHITESPACE			:	(' '|'\t'|'\f'|'\n'|'\r')+ { $channel = HIDDEN; };
SINGLELINE_COMMENT	:	'//' .* ('\n' | '\r') { $channel = HIDDEN; };
MULTILINE_COMMENT	:	'/*' .* '*/' { $channel = HIDDEN; };
