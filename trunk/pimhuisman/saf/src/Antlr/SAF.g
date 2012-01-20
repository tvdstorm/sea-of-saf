// Copyright © Pim Huisman 2012.
grammar SAF;

options {
	language = Java;
	output = AST;
}

@header {
  package Antlr;
}

@lexer::header {
	package Antlr;
}

Whitespace	:	(' '|'\t'|'\f'|'\n'|'\r')+{ skip(); };
String			:	( 'a'..'z' | 'A'..'Z' )+;
Number			:	'0'..'9'+;

fighter		:	String '{'
				personality
				behaviour
			'}';

characteristic	:	characteristicType '=' Number;
personality			:	characteristic+;

behaviour			:	rule+;
rule					:	conditionType '[' moveAction attackAction ']';

moveAction		:	moveActionType | 'choose' '(' moveActionType+ ')';
attackAction	:	attackActionType | 'choose' '(' attackActionType+ ')';

characteristicType	:	('punchReach'|'punchPower'|'kickReach'|'kickPower');	
conditionType				:	('stronger'|'weaker'|'much_stronger'|'much_weaker'|'even'|'near'|'far'|'always');
moveActionType			:	('jump'|'crouch'|'stand'|'run_towards'|'run_away'|'walk_towards'|'walk_away');
attackActionType		:	('punch_low'|'punch_high'|'kick_low'|'kick_high'|'block_low'|'block_high');
