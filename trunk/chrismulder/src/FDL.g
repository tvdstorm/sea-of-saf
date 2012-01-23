grammar FDL;
options { output=AST; }
tokens {
	SAF_NODE;
	BEHAVIOUR_NODE;
	STRENGTH_NODE;
	CONDITION_NODE;
	ACTION_NODE;
	OR_NODE;
	AND_NODE;
	CHOOSE_NODE;
}

@header {
 package parser;
}

@lexer::header {
 package parser;
}
/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

saf:		NAME '{'  (property)* '}' -> ^(SAF_NODE NAME (property)*){};
property_list: 	(property)*;
property:	strength  | behaviour;
strength:	NAME '=' NUMBER -> ^(STRENGTH_NODE NAME NUMBER);


condition: ors -> ^(CONDITION_NODE ors);		
ors:	ands (  'or'  ands )* -> ^(OR_NODE ands+);
ands:	NAME ( 'and' NAME )* ->  ^(AND_NODE NAME+);

behaviour:	condition '[' action ']' -> ^(BEHAVIOUR_NODE condition action);

action:		action_atom | action_atom action_atom -> ^(ACTION_NODE action_atom+);
action_atom:  'choose' '(' NAME NAME ')' -> ^(CHOOSE_NODE NAME NAME) | NAME; 


/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

NUMBER	: (DIGIT)+ ;
WHITESPACE : ( '\t' | ' ' | '\u000C' | '\r' | '\n')+ 	{ $channel = HIDDEN; } ;
NAME :	('a'..'z'|'A'..'Z'|'_')+ ;
fragment DIGIT	: '0'..'9' ;
