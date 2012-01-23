parser grammar SAFparser;

options {
	output = AST;
	tokenVocab = SAFlexer;
}

tokens {
	PERSONALITY;
	BEHAVIOUR;
}

fighter			: 	ID^ LEFT_BRACE! property+ RIGHT_BRACE!;

property		:	characteristic | behaviour;

characteristic	:	STRENGTH ASSIGN DIGIT -> ^(PERSONALITY STRENGTH DIGIT);
	
behaviour		:	condition LEFT_BRACKET move attack RIGHT_BRACKET -> ^(BEHAVIOUR condition move attack);

move			:	CHOOSE LEFT_PAREN MOVE_TYPE MOVE_TYPE RIGHT_PAREN -> ^(CHOOSE MOVE_TYPE MOVE_TYPE)
				|	MOVE_TYPE;

attack			:	CHOOSE LEFT_PAREN ATTACK_TYPE ATTACK_TYPE RIGHT_PAREN -> ^(CHOOSE ATTACK_TYPE ATTACK_TYPE)
				|	ATTACK_TYPE;

condition		:	CONDITION_TYPE LOGICAL_OPERATOR CONDITION_TYPE -> ^(LOGICAL_OPERATOR CONDITION_TYPE CONDITION_TYPE)
				| 	CONDITION_TYPE;
