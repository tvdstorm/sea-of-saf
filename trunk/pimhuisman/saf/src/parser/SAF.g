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
						{ $value = new Rule($condition.value, $actions.value); }
					;
					
condition returns[Condition value]
					:	andStatement
						{ $value = $andStatement.value; }
					;

andStatement returns[Condition value]
					:	orStatement 'and' condition
						{ $value = new AndStatement($orStatement.value, $condition.value); }
					|	orStatement
						{ $value = $orStatement.value; }
					;
					
orStatement	returns[Condition value]
					:	id1=IDENTIFIER 'or' id2=IDENTIFIER
						{ $value = new OrStatement(new SingleCondition($id1.text), new SingleCondition($id2.text)); }
					|	IDENTIFIER
						{ $value = new SingleCondition($IDENTIFIER.text); }
					;
					
actions returns[Actions value]
					:	(moveActions=action attackActions=action) { $value = new Actions($moveActions.value, $attackActions.value); }
					;

action returns[List<String> value]
					@init { value = new LinkedList<String>(); }
					:	IDENTIFIER { value.add($IDENTIFIER.text); }
					| 	'choose' '(' (IDENTIFIER { value.add($IDENTIFIER.text); } )+ ')'
					;

fragment LETTER		:	('a'..'z' | 'A'..'Z');
fragment DIGIT		:	'0'..'9';

IDENTIFIER			:	LETTER (LETTER | '_' | '-')* LETTER;
NUMBER				:	'-'? DIGIT+;
WHITESPACE			:	(' '|'\t'|'\f'|'\n'|'\r')+ { $channel = HIDDEN; };
SINGLELINE_COMMENT	:	'//' .* ('\n' | '\r') { $channel = HIDDEN; };
MULTILINE_COMMENT	:	'/*' .* '*/' { $channel = HIDDEN; };
