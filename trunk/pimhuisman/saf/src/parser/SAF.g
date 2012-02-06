// Copyright © Pim Huisman 2012.
grammar SAF;

options {
	language = Java;
}

@header {
	package parser;
	import data.*;
	import java.util.List;
	import java.util.LinkedList;
}

@lexer::header {
	package parser;
}

fighter	returns[Fighter fighter]	
					:	IDENTIFIER '{'
							personality
							behaviour
						'}'
						{ $fighter = new Fighter($IDENTIFIER.text, $personality.value, $behaviour.value); }
					;

personality	returns[Personality value]
					@init { List<Characteristic> characteristics = new LinkedList<Characteristic>(); }
					:	
						( characteristic { characteristics.add($characteristic.value); } )+
						{ $value = new Personality(characteristics); }
					;
					
characteristic returns[Characteristic value]
					:	IDENTIFIER '=' NUMBER
						{ $value = new Characteristic($IDENTIFIER.text, Integer.parseInt($NUMBER.text)); }
					;

behaviour returns[Behaviour value]
					@init { List<Rule> rules = new LinkedList<Rule>(); }
					:	( rule { rules.add($rule.value); } )+
						{ $value = new Behaviour(rules); }
					;
					
rule returns[Rule value]
					:	condition '[' actions ']'
						{ $value = new Rule(); }
					;
					
condition			:	andStatement
					;

andStatement		:	orStatement 'and' condition
					|	orStatement
					;
					
orStatement			:	IDENTIFIER 'or' IDENTIFIER
					|	IDENTIFIER
					;
					
actions				:	(action action)
					;

action				:	IDENTIFIER
					| 	'choose' '(' IDENTIFIER+ ')'
					;

fragment LETTER		:	('a'..'z' | 'A'..'Z');
fragment DIGIT		:	'0'..'9';

IDENTIFIER			:	LETTER (LETTER | '_' | '-')* LETTER;
NUMBER				:	DIGIT+;
WHITESPACE			:	(' '|'\t'|'\f'|'\n'|'\r')+ { $channel = HIDDEN; };
SINGLELINE_COMMENT	:	'//' .* ('\n' | '\r') { $channel = HIDDEN; };
MULTILINE_COMMENT	:	'/*' .* '*/' { $channel = HIDDEN; };
