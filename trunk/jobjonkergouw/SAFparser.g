parser grammar SAFparser;

options {
	output = AST;
	
	tokenVocab = SAFlexer;
}

tokens {
	PERSONALITY;
	BEHAVIOUR;
}
file			:	fighter+;

fighter			: 	ID^ LEFT_BRACE! property+ RIGHT_BRACE!;

property		:	characteristic | behaviour;

characteristic	:	STRENGTH^ ASSIGN! NUMBER;
	
behaviour		:	CONDITION^ LEFT_BRACKET! MOVE ATTACK RIGHT_BRACKET!;
