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
	ACTION;
	AND_OPERATOR;
	OR_OPERATOR;
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
characteristic		:	IDENTIFIER '=' NUMBER
						->	^(CHARACTERISTIC
								^(NAME CHARACTERISTIC_TYPE)
								^(VALUE NUMBER)
							)
					;

behaviour			:	rule+;
rule				:	condition '[' actions ']'
						->	^(CONDITION condition actions)
					;
					
condition			:	IDENTIFIER -> ^(NAME CONDITION_TYPE)
					|	andStatement
					|	orStatement
					;

andStatement		:	c1=IDENTIFIER 'and' c2=IDENTIFIER
						-> ^(AND_CONDITION ^(NAME $c1) ^(NAME $c2))
					;
orStatement			:	c1=IDENTIFIER 'or' c2=IDENTIFIER
						-> ^(OR_CONDITION ^(NAME $c1) ^(NAME $c2))
					;

actions				:	(action action)
					| 	'choose' '(' actions+ ')' -> ^(CHOOSE actions+)
					;

action				:	IDENTIFIER -> ^(ACTION ^(NAME IDENTIFIER))
					| 	'choose' '(' IDENTIFIER+ ')' -> ^(CHOOSE IDENTIFIER+)
					;

fragment LETTER		:	('a'..'z' | 'A'..'Z');
fragment DIGIT		:	'0'..'9';

IDENTIFIER			:	LETTER (LETTER | '_')+ LETTER;
NUMBER				:	DIGIT+;
WHITESPACE			:	(' '|'\t'|'\f'|'\n'|'\r')+ { $channel = HIDDEN; };
SINGLELINE_COMMENT	:	'//' .* ('\n' | '\r') { $channel = HIDDEN; };
MULTILINE_COMMENT	:	'/*' .* '*/' { $channel = HIDDEN; };
