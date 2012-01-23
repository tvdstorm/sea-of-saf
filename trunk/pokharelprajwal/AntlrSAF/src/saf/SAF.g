grammar SAF;

@header {
  package saf;
}

@lexer::header {
  package saf; 
}

bot 
	:	IDENT '{' 
			personality behaviour
	 	'}'
	;

personality
	: 
	characterstics*
	;

characterstics
	:
		IDENT '=' INTEGER
	;
		
behaviour
	:
	rule*
	;

rule
	:
	 moveAction
	|fightAction
	|condition
	;

moveAction
	:
	  MOVEACTIONTYPE
	|'choose(' MOVEACTIONTYPE MOVEACTIONTYPE')'
	| MOVEACTIONTYPE 'or' MOVEACTIONTYPE
	| MOVEACTIONTYPE 'and' MOVEACTIONTYPE
	;

	
fightAction
	:
	  FIGHTACTIONTYPE 
	|'choose(' FIGHTACTIONTYPE FIGHTACTIONTYPE')'
	| FIGHTACTIONTYPE 'or' FIGHTACTIONTYPE
	| FIGHTACTIONTYPE 'and' FIGHTACTIONTYPE
	;	
		
condition
	:
	  CONDITIONTYPE
	| CONDITIONTYPE'['moveAction fightAction']'  
	| CONDITIONTYPE 'and' CONDITIONTYPE
	| CONDITIONTYPE'['moveAction fightAction']' 'or' CONDITIONTYPE
	| CONDITIONTYPE'['moveAction fightAction']' 'and' CONDITIONTYPE
	;	

CONDITIONTYPE 
	:	'always' 
	|	'near'
	| 	'far'
	|	'much_stronger'
	|	'stronger'
	|	'even'
	|	'weaker'
	|	'much_weaker'
	;
	
MOVEACTIONTYPE 
	:	'walk_towards'
	|	'walk_away'
	|	'run_towards'
	|	'run_away'
	|	'jump'
	|	'crouch'
	| 	'stand'
	;
	
FIGHTACTIONTYPE 
	:	'block_low'
	|	'block_high'
	| 	'punch_low'
	|	'punch_high'
	|	'kick_low'
	|	'kick_high'
	;

INTEGER : '0'..'9'+;
IDENT : ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9')*;
WS : (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};