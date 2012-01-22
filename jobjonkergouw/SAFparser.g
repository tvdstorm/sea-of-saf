parser grammar SAFparser;

options {
	output = AST;
	
	tokenVocab = SAFlexer;
}

tokens {
	PERSONALITY;
	BEHAVIOUR;
}

file	:	(fighter)+;	

fighter
	: (
		ID^
		LEFT_BRACE
		WHITESPACE*
		(property WHITESPACE*)+
		RIGHT_BRACE
	  );

property:	personality	|	behaviour;

personality
	:	PERSONALITY_TYPE WHITESPACE? ASSIGN^ WHITESPACE? 
		NUMBER
	;
	
behaviour	:	'test';
