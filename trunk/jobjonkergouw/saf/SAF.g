grammar SAF;

options {
	output = AST;
	language = Java;
}

@header {
	//package saf;
	import ast.*;
}

@lexer::header {package saf; }
////////////////////////////


fighter returns [Fighter n]
	: 	ID '{' (defs)* '}'		//{ $n = new Fighter($ID.text); }
	;
	
defs: 'lol';
	
//-> ^(FIGHTER name characteristic* rule*);

/*
name			:	ID -> ^(NAME ID);

characteristic	:	STRENGTH_TYPE ASSIGN DIGIT -> ^(CHARACTERISTIC ^(STRENGTH STRENGTH_TYPE) ^(VALUE DIGIT));
	
rule			:	condition '[' move attack ']' -> ^(RULE condition move attack);

move			:	CHOOSE '(' MOVE_TYPE MOVE_TYPE ')' -> ^(MOVEACTION MOVE_TYPE MOVE_TYPE)
				|	MOVE_TYPE -> ^(MOVEACTION MOVE_TYPE);

attack			:	CHOOSE '(' ATTACK_TYPE ATTACK_TYPE ')' -> ^(FIGHTACTION ATTACK_TYPE ATTACK_TYPE)
				|	ATTACK_TYPE -> ^(FIGHTACTION ATTACK_TYPE);

condition		:	CONDITION_TYPE LOGICAL_OPERATOR CONDITION_TYPE -> ^(CONDITION LOGICAL_OPERATOR CONDITION_TYPE CONDITION_TYPE)
				| 	CONDITION_TYPE -> ^(CONDITION CONDITION_TYPE);
*/

///////// Lexer rules ///////

INT 			:	'0'..'9'+;
ID				:	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
WS  			:   ( ' '| '\t' | '\r' | '\n')* {$channel=HIDDEN;};