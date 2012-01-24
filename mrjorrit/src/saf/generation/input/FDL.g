grammar FDL;

options {
  language = Java;
  output=AST;
  ASTLabelType = CommonTree;
}

@header {
  package saf.generation.output; 
}

@lexer::header {
  package saf.generation.output;
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
	:	(IDENT EQUALS DIGIT) -> ^(CHARACTERISTIC IDENT DIGIT)
	;
	
behaviour
	:	(rule*) -> ^(BEHAVIOUR rule*)
	;

rule
	: 	(
			conditionTypes
			LEFT_BRACKET
				moveActionTypes fightActionTypes
			RIGHT_BRACKET
			) -> ^(RULE conditionTypes moveActionTypes fightActionTypes)
	;
	
conditionTypes
  : IDENT 
  | (IDENT (LOGICAL^ IDENT)+)
  ;

moveActionTypes
  : IDENT | chooseMoveActionType
  ;

fightActionTypes
  : IDENT | chooseFightActionType
  ;
	
chooseFightActionType
	:	CHOOSE^
		LEFT_PAREN!
			IDENT+ 
		RIGHT_PAREN!
	;
	
chooseMoveActionType
	:	CHOOSE^
		LEFT_PAREN!
			IDENT+ 
		RIGHT_PAREN!
	;


//AST Nodes
PERSONALITY : 'Personality' ;
BEHAVIOUR : 'Behaviour' ;
CHARACTERISTIC : 'Characteristic';
RULE : 'Rule';

LOGICAL : ('and' | 'or');


CHOOSE : 'choose' ;
IDENT : ('a' .. 'z' | 'A' .. 'Z')('a' .. 'z' | 'A' .. 'Z' | '0'..'9' | '_')*;
WS : (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};
DIGIT : '0' .. '9'+;
EQUALS : '=';
LEFT_CURLY : '{';
RIGHT_CURLY : '}';
LEFT_PAREN : '(';
RIGHT_PAREN : ')';
LEFT_BRACKET : '[';
RIGHT_BRACKET : ']';


//Apperantly not allowed
//FIGHTACTIONTYPE : ('block_low' | 'block_high' | 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high') ;
//MOVEACTIONTYPE : ('walk_towards' | 'walk_away' | 'run_towards' | 'run_away' | 'jump' | 'crouch' | 'stand') ;
//CONDITIONTYPE : ('always' | 'near' | 'far' | 'much_stronger' | 'stronger' | 'even' | 'weaker' | 'much_weaker') ;
//ATTRIBUTE : ('punchReach' | 'punchPower' | 'kickReach' | 'kickPower') ; 
