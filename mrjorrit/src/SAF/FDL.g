grammar FDL;

options {
  language = Java;
  output=AST;
}

@header {
  package SAF; 
}

@lexer::header {
  package SAF;
}

fighter
	:		IDENT^
			LEFT_CURLY!
			personality
			behaviour
			RIGHT_CURLY!
	;


personality
	:	(characteristic*) -> ^(PERSONALITY characteristic*)
	;

characteristic
	:	(ATTRIBUTE^ EQUALS ONEDIGIT)
	;
	
behaviour
	:	(rule*) -> ^(BEHAVIOUR rule*)
	;

rule
	: 	(
			CONDITIONTYPE^
			LEFT_BRACKET!
				(MOVEACTIONTYPE | chooseMoveActionType) (FIGHTACTIONTYPE | chooseFightActionType)
			RIGHT_BRACKET!
		)
	;
	
chooseFightActionType
	:	CHOOSE^
		LEFT_PAREN!
			FIGHTACTIONTYPE+ 
		RIGHT_PAREN!
	;
	
chooseMoveActionType
	:	CHOOSE^
		LEFT_PAREN!
			MOVEACTIONTYPE+ 
		RIGHT_PAREN!
	;


PERSONALITY : 'Personality' ;
BEHAVIOUR : 'Behaviour' ;
FIGHTACTIONTYPE : ('block_low' | 'block_high' | 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high') ;
MOVEACTIONTYPE : ('walk_towards' | 'walk_away' | 'run_towards' | 'run_away' | 'jump' | 'crouch' | 'stand') ;
CONDITIONTYPE : ('always' | 'near' | 'far' | 'much_stronger' | 'stronger' | 'even' | 'weaker' | 'much_weaker') ;
ATTRIBUTE : ('punchReach' | 'punchPower' | 'kickReach' | 'kickPower') ; 
CHOOSE : 'choose' ;
IDENT : ('a' .. 'z' | 'A' .. 'Z')('a' .. 'z' | 'A' .. 'Z' | '0'..'9')*;
WS : (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};
ONEDIGIT : '0' .. '9';
DIGIT : '0' .. '9'+;
EQUALS : '=';
LEFT_CURLY : '{';
RIGHT_CURLY : '}';
LEFT_PAREN : '(';
RIGHT_PAREN : ')';
LEFT_BRACKET : '[';
RIGHT_BRACKET : ']';

